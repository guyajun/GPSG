package common.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * Queryparam
 * 
 * @author zhou bo
 */

public class QueryParam
{

	private final Log log = LogFactory.getLog(QueryParam.class);
	private static final String filterTypes[] = {
		" like ", " = ", " > ", " >= ", " < ", " <= ", " <> ", " in "
	};
	private static final String orderType[] = {
		" asc", " desc"
	};

	public static final String ORDER_ASC = orderType[0];
	public static final String ORDER_DESC = orderType[1];
	public static final String FILTER_LIKE = filterTypes[0];
	public static final String FILTER_EQUALS = filterTypes[1];
	public static final String FILTER_GREATETHAN = filterTypes[2];
	public static final String FILTER_GREATEEQUAL = filterTypes[3];
	public static final String FILTER_LESSTHAN = filterTypes[4];
	public static final String FILTER_LESSEQUAL = filterTypes[5];
	public static final String FILTER_NOTEQUAL = filterTypes[6];
	public static final String FILTER_IN = filterTypes[7];
	
	private List<Object> orders;
	private List<Object> andFilters;
	private List<Object> orFilters;
	private int indexPage;
	private int pageSize;
	private int totalCounts;

	public QueryParam()
	{
		orders = new ArrayList<Object>();
		andFilters = new ArrayList<Object>();
		orFilters = new ArrayList<Object>();
		indexPage = 0;
		pageSize = 0;
	}
	
	private void filter(String filterName,String filterType, Object filterValue) throws Exception
	{
		if (filterName == null)
		{
			if (log.isWarnEnabled())
				log.warn(new StringBuffer("invaild filterName ,filterValue. Name=")
				.append(filterName)
				.append(" value=")
				.append(filterValue));
			throw new Exception("invalid param");
		}
		boolean validate = false;
		for (int i = 0; i < filterTypes.length; i++)
		{
			String temp = filterTypes[i];
			if (!temp.equals(filterType))
				continue;
			validate = true;
			break;
		}
		if (!validate)
		{
			if (log.isWarnEnabled())
				log.warn(new StringBuffer("invaild filterType. filterType=").append(filterType));
			throw new Exception("invalid param");
		}
		if (!(filterValue instanceof String) && filterType.equals(FILTER_LIKE))
		{
			throw new Exception("only string type can do 'like' query");
		} 
	}
	
	public QueryParam andFilter(String filterName, String filterType, Object filterValue)
	throws Exception
	{
		
		filter(filterName,filterType,filterValue);
		if(filterValue!=null)
		{
			andFilters.add(new Object[] {filterName, filterType, filterValue});
			return this;
		}
		return this;
	}
	
	public QueryParam orFilter(String filterName, String filterType, Object filterValue)
	throws Exception
	{
		filter(filterName,filterType,filterValue);
		if(filterValue!=null)
		{
			orFilters.add(new Object[] {filterName, filterType, filterValue});
			return this;
		}
		return this;
	}

	public QueryParam addOrder(String name, String orderType)
		throws Exception
	{
		if (name == null || !ORDER_ASC.equals(orderType) && !ORDER_DESC.equals(orderType))
		{
			if (log.isWarnEnabled())
				log.warn(new StringBuffer("invaild name and orderType. Name=")
				.append(name)
				.append(" OrderType=")
				.append(orderType));
			throw new Exception("invalid param");
		}
		for (int i = 0; i < orders.size(); i++)
		{
			String order[] = (String[])orders.get(i);
			if (name.equals(order[0]))
			{
				if (log.isWarnEnabled())
					log.warn(new StringBuffer("order name=")
					.append(name)
					.append(" already existed!.can't add order.return"));
				return this;
			}
		}

		orders.add(new String[] {
			name, orderType
		});
		
		return this;
	}
	
	public QueryParam setPage(int indexPage, int pageSize) throws Exception
	{
		if (indexPage < 0 || pageSize < 0)
		{
			if (log.isWarnEnabled())
				log.warn(new StringBuffer("invaild indexpage and pageSize. IndexPage=")
				.append(indexPage)
				.append(" pageSize=")
				.append(pageSize)
				.append(". Set default value"));
			throw new Exception("invalid param");
		} else
		{
			this.indexPage = indexPage;
			this.pageSize = pageSize;
			return this;
		}
	}

	public int getTotalPage()
	{
		if (getPageSize() <= 0)
		{
			pageSize = getTotalCounts();
			return 1;
		}
		int temp = getTotalCounts() / getPageSize();
		if (getTotalCounts() % getPageSize() > 0)
			temp++;
		return temp;
	}

	public boolean isNeedPage()
	{
		return pageSize > 0;
	}

	public boolean isNeedFilter()
	{
		return andFilters.size() > 0||orFilters.size()>0;
	}

	public boolean isNeedOrder()
	{
		return orders.size() > 0;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public QueryParam setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
		return this;
	}

	public int getTotalCounts()
	{
		return totalCounts;
	}

	public QueryParam setTotalCounts(int totalCounts)
	{
		this.totalCounts = totalCounts;
		if (indexPage * pageSize > totalCounts)
			indexPage = 0;
		return this;
	}

	public int getIndexPage()
	{
		return indexPage;
	}

	public QueryParam setIndexPage(int indexPage)
	{
		this.indexPage = indexPage;
		return this;
	}

	public List<Object> getAndFilters()
	{
		return andFilters;
	}
	public List<Object> getOrFilters()
	{
		return orFilters;
	}

	public List<Object> getOrders()
	{
		return orders;
	}

	public String toString()
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
