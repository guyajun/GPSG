package common.db;

import java.util.List;

public class QueryResult<T> {
	
	List<T> list;
	
	int total;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public QueryResult(List<T> list, int total) {
		this.list = list;
		this.total = total;
	}
}
