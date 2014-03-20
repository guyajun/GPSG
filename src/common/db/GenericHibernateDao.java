package common.db;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import common.db.hibernate.HibernateUtil;

/**
 * GenericHibernateDao
 * 
 * @author zhou bo
 * 
 */
public abstract class GenericHibernateDao<T extends Serializable, PK extends Serializable> extends HibernateDaoSupport{

    private Class<T> entityClass;
    
    private String queryString;

    // 构造方法，根据实例类自动获取实体类类型
    @SuppressWarnings("unchecked")
	public GenericHibernateDao() {
    	  this.entityClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    	  queryString ="from "+ entityClass.getSimpleName() +" model";
    /*   this.entityClass = null;
	      Class c = getClass();
	      Type t = c.getGenericSuperclass();
	      if (t instanceof ParameterizedType) {
	      Type[] p = ((ParameterizedType)t).getActualTypeArguments();
	      this.entityClass = (Class<T>) p[0];
	        }*/
    }
    // -------------------- 基本检索、增加、修改、删除操作 --------------------
  
    /**
	 * 根据主键获取实体。如果没有相应的实体,返回null。
	 * @param  id 主键
	 * @return 返回相应实体
	 */
    @SuppressWarnings("unchecked")
	public T get(PK id) {
    	T t = (T) getHibernateTemplate().get(entityClass, id);
    	if(t!=null)
        return t;
    	else return null;
    }
    /**
	 * 根据主键获取实体。如果没有相应的实体，抛出异常。
	 * @param  id 主键
	 * @return 返回相应实体
	 */
    @SuppressWarnings("unchecked")
	public T load(PK id) {
    	
        return (T) getHibernateTemplate().load(entityClass, id);
    }


    /**
	 * 获取全部实体
	 * @return 返回相应实体
	 */
    @SuppressWarnings("unchecked")
	public List<T> loadAll() {
        return (List<T>) getHibernateTemplate().loadAll(entityClass);
    }

    /**
	 * 更新实体
	 * @param  T 实体
	 */
    public void update(T entity) {
        getHibernateTemplate().update(entity);
    }
    
    public void evict(T entity){
    	getHibernateTemplate().evict(entity);
    }


    /**
	 *存储实体到数据库
	 * @param  T 实体
	 */
    public void save(T entity) {
        getHibernateTemplate().save(entity);
    }

    /**
	 *增加或更新实体
	 * @param  T 实体
	 */
    public void saveOrUpdate(T entity) {
        getHibernateTemplate().saveOrUpdate(entity);
    }

    /**
	 *增加新集合中的全部实体
	 * @param  Collection 实体集合
	 */
    public void saveOrUpdateAll(Collection<T> entities) {
        getHibernateTemplate().saveOrUpdateAll(entities);
    }

    /**
	 *删除指定的实体
	 * @param  entity 实体
	 */
    public void delete(T entity) {
        getHibernateTemplate().delete(entity);
    }


    /**
	 *根据主键删除指定实体
	 * @param  id 主键
	 */
    public void deleteByKey(PK id) {
        this.delete(this.load(id));
    }


    /**
	 *删除集合中全部实体
	 * @param  entities 实体集合
	 */
    public void deleteAll(Collection<T> entities) {
        getHibernateTemplate().deleteAll(entities);
    }
    //----------------------SQL-------------------------------------------------
    /**
	 *通过sql语句进行查询
	 * @param  sql SQL语句
	 * @return 返回查询List
	 */
    @SuppressWarnings("unchecked")
	public List<T> sqlFind(String sql)
    {
    	Session session = this.getSession();
    	List<T> list = session.createSQLQuery(sql).addEntity(entityClass).list();
    	releaseSession(session);
    	return list;
    }
    /**
	 *通过sql语句进行查询
	 * @param  sql SQL语句
	 * @param  params 参数数组
	 * @return 返回查询List
	 */
    @SuppressWarnings("unchecked")
	public List<T> sqlFind(String sql,Object[] params)
    {
    	Session session = this.getSession();
    	SQLQuery sqlQuery = (SQLQuery) session.createSQLQuery(sql).addEntity(entityClass);
    	for(int i=0;i<params.length;i++)
    	{
    		sqlQuery.setParameter(i, params[i]);
    	}
    	List<T> list = sqlQuery.list();
    	releaseSession(session);
    	return list;
    }
    
    //---------------------HQL--------------------------------------     
    
    // 使用HSQL语句检索数据
    @SuppressWarnings("unchecked")
	public List<T> find(String queryString) {
        return getHibernateTemplate().find(queryString);
    }

    // 使用带参数的HSQL语句检索数据
    @SuppressWarnings("unchecked")
	public List<T> find(String queryString, Object[] values) {
        return getHibernateTemplate().find(queryString, values);
    }
    
 // 创建与会话无关的检索标准
    public DetachedCriteria createDetachedCriteria() {
        return DetachedCriteria.forClass(this.entityClass);
    }

 // 创建与会话绑定的检索标准
    public Criteria createCriteria() {
        return this.createDetachedCriteria().getExecutableCriteria(
                this.getSession());
    }
    // 使用指定的实体及属性检索（满足除主键外属性＝实体值）数据
    @SuppressWarnings("unchecked")
	public List<T> findEqualByEntity(T entity, String[] propertyNames) {
        Criteria criteria = this.createCriteria();
        Example exam = Example.create(entity);
        exam.excludeZeroes();
        String[] defPropertys = getSessionFactory().getClassMetadata(
                entityClass).getPropertyNames();
        for (String defProperty : defPropertys) {
            int ii = 0;
            for (ii = 0; ii < propertyNames.length; ++ii) {
                if (defProperty.equals(propertyNames[ii])) {
                    criteria.addOrder(Order.asc(defProperty));
                    break;
                }
            }
            if (ii == propertyNames.length) {
                exam.excludeProperty(defProperty);
            }
        }
        criteria.add(exam);
        return (List<T>) criteria.list();
    }
    
    // 强制立即更新缓冲数据到数据库（否则仅在事务提交时才更新）
    public void flush() {
        getHibernateTemplate().flush();
    }
    
    public QueryResult<T> list(QueryParam param)throws Exception
	{
		return list(param, queryString, "model");
	}

	@SuppressWarnings("unchecked")
	public QueryResult<T> list(final QueryParam param, final String queryString, final String prefix) throws Exception
	{
		Session session = this.getSession();
		List<T> list = (List<T>) HibernateUtil.doQuery(session, param, queryString, prefix);
		releaseSession(session);
		return new QueryResult<T>(list,param.getTotalCounts());
	}
	}
