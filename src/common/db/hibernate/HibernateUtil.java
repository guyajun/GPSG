package common.db.hibernate;

import common.db.QueryParam;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.*;
/**
 * HibernateUtil
 * 
 * @author zhou bo
 * @version 1.0
 * 
 */
public class HibernateUtil
{
	private static final Log log = LogFactory.getLog(HibernateUtil.class);
	
	public static List<Object> doQuery(Session session, QueryParam param, String SQL, String prefix)
	{
		if (param == null)
			param = new QueryParam();
		String sqls[] = genQueryString(param, SQL, prefix);
		boolean needCount = param.getTotalCounts() <= 0;
		Query countQuery = null;
		if (needCount)
			countQuery = session.createQuery(sqls[1]);
		Query query = session.createQuery(sqls[0]);
		List<Object> andFilters = param.getAndFilters();
		List<Object> orFilters = param.getOrFilters();
		for (int i = 0; i < andFilters.size(); i++)
		{
			Object filter[] = (Object[])andFilters.get(i);
			String filterType = (String)filter[1];
			Object filterValue = filter[2];
			if (QueryParam.FILTER_LIKE.equals(filterType))
			{
				query.setParameter("param"+i, "%" + filterValue + "%");
				if (countQuery != null)
					countQuery.setParameter("param"+i, "%" + filterValue + "%");
			} 
			else
			{
				query.setParameter("param"+i, filterValue);
				if (countQuery != null)
					countQuery.setParameter("param"+i, filterValue);
			}
		}
		for(int i = 0; i <orFilters.size(); i++)
		{
			int j = andFilters.size() + i;
			Object filter[] = (Object[])orFilters.get(i);
			String filterType = (String)filter[1];
			Object filterValue = filter[2];
			if(QueryParam.FILTER_LIKE.equals(filterType))
			{
				query.setParameter("param"+j,"%" + filterValue + "%");
				if(countQuery != null)
					countQuery.setParameter("param"+j, "%" +filterValue +"%");
			}
			else
			{
				query.setParameter("param"+j, filterValue);
				if (countQuery != null)
					countQuery.setParameter("param"+j, filterValue);
			}
		}
		
		if (countQuery != null)
		{
			int totalCounts = Integer.parseInt(countQuery.iterate().next().toString());
			log.debug("Total Counts=" + totalCounts);
			param.setTotalCounts(totalCounts);
		}
		if (param.getIndexPage() * param.getPageSize() > param.getTotalCounts())
		{
			log.debug("exceed all page data.indexPage=" 
					+ param.getIndexPage()
					+ " pageSize="
					+ param.getPageSize()
					+ " reset indexPage=0");
			
			param.setIndexPage(0);
		}
		if (param.isNeedPage())
		{
			log.debug("set page info. IndexPage=" 
					+ param.getIndexPage() 
					+ " pageSize=" 
					+ param.getPageSize());
			if(param.getPageSize()!=0)
				query.setMaxResults(param.getPageSize());
			query.setFirstResult(param.getIndexPage() * param.getPageSize());
		}
		return query.list();
	}

	public static String[] genQueryString(QueryParam param, String SQL, String prefix)
	{
		if (param == null)
			param = new QueryParam();
		StringBuffer sql1 = new StringBuffer(SQL);
		StringBuffer filterStr = new StringBuffer();;
		List<Object> andFilters = param.getAndFilters();
		List<Object> orFilters = param.getOrFilters();
		for (int i = 0; i < andFilters.size(); i++)
		{
			Object filter[] = (Object[])andFilters.get(i);
			String filterName = (String)filter[0];
			String filterType = (String)filter[1];
			
			filterStr
			.append(" ")
			.append(prefix)
			.append(".")
			.append(filterName)
			.append(filterType)
			.append(":param")
			.append(i);
			
			if (i != andFilters.size() - 1)
				filterStr.append(" and ");
				
		}
		if(andFilters.size()>0&&orFilters.size()>0)
			filterStr.append(" or ");
		for(int i =0; i < orFilters.size(); i++)
		{
			int j = andFilters.size()+i;
			Object filter[] = (Object[])orFilters.get(i);
			String filterName = (String)filter[0];
			String filterType = (String)filter[1];
			
			filterStr
			.append(" ")
			.append(prefix)
			.append(".")
			.append(filterName)
			.append(filterType)
			.append(":param")
			.append(j);
			if(i != orFilters.size() -1)
				filterStr.append(" or ");
		}
		if (andFilters.size() > 0||(orFilters.size()>0))
		{
			if (sql1.indexOf("where") > 0)
				sql1.append(" and ");
			else
				sql1.append(" where ");
		}
		
		sql1.append(filterStr);
		String sql2 = "select count(*)" + sql1.toString();
		List<Object> orders = param.getOrders();
		if (param.isNeedOrder())
		{
			sql1.append(" order by ");
			StringBuffer orderStr = new StringBuffer();
			for (int i = 0; orders != null && i < orders.size(); i++)
			{
				String order[] = (String[])orders.get(i);
				String name = order[0];
				String type = order[1];
				orderStr
				.append(prefix)
				.append(".")
				.append(name)
				.append(type);
				if (i != orders.size() - 1)
					orderStr.append(" , ");
			}
//			sql1 += orderStr;
			sql1.append(orderStr);
		}
		log.debug("SQL1 ="+sql1);
		log.debug("SQL2="+sql2);
		return (new String[] {
			sql1.toString(), sql2
		});
	}
}
