package com.zhangtao.zhangtao_common;


import java.util.regex.Pattern;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class WebUtil {
//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
		public static String getString(HttpServletRequest request, String name, String defaultValue){
		    //实现代码 
			String value  = request.getParameter(name);
			if(value==null){
				return defaultValue;
			}
			return value;
		}
		//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
		public static int getInt(HttpServletRequest request, String name, int defaultValue){
		    //实现代码 
			String  value   = request.getParameter(name);
			try{
				   int c = Integer.parseInt(value);
				   return c;
			}catch(Exception e){
				return defaultValue;
			}
		}
		//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
		public static boolean getBoolean(HttpServletRequest request, String name){
		    //实现代码
			String value = request.getParameter(name);
			try{
				boolean flag = Boolean.parseBoolean(value);
				return flag;
			}catch(Exception e){
				return false;
			}
		}
//			方法4：获取当前请求地址，注意参数不能丢 (5分)
		public static String getUrl(HttpServletRequest request){
			StringBuffer url  = request.getRequestURL();
			//获取 参数
			String paramsStr = request.getQueryString();
		    //实现代码
			return url.toString()+"?"+paramsStr;
		}
//			方法5：给定一个Cookie名获得Cookie值 (5分)
		public static String getCookieValue(HttpServletRequest  request,String cookieName){
			Cookie[] cs  = request.getCookies();
			if(cs!=null && cs.length>0){
				for(Cookie c:cs){
					if(c.getName().equals(cookieName)){
						return c.getValue();
					}
				}
			}
		   //  如果没有对应的 cookName的名字 返回null
			return null;
		}
		
		public  static boolean  isHttpUrl (String s){
			Pattern pattern = Pattern.compile("^([hH][tT]{2}[pP]://|[hH][tT]{2}[pP][sS]://)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+$");
			boolean matcher = pattern.matcher(s).matches();
			return matcher;
		}
}
