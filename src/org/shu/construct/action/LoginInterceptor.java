package org.shu.construct.action;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = -8296954505964647458L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();
		Map session = context.getSession();
		String name = (String) session.get("name");
		if (name != null) {
			return invocation.invoke();//如果已经登录，被拦截的方法就可以被调用执行
		}
		return "loginView";
	}
}