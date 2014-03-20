package org.shu.construct.action;

public class ParamAction {
	public String upInitial(String str){
		char[] chars=str.toCharArray();
		chars[0]=Character.toUpperCase(chars[0]);
		return new String(chars);
	}
	public Class<?> paraTypeClass(String str){
		if(str.equals("java.lang.String")){
			return java.lang.String.class;
		}else if(str.equals("java.lang.Integer")){
			return java.lang.Integer.class;
		}else if(str.equals("java.util.Date")){
			return java.util.Date.class;
		}
		return null;
	}
}
