package com.zhangtao.zhangtao_common;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class WebUtil {
	public String getString(HttpServletRequest request, String name, String defaultValue){
		
		//通过前台获取url上的参数
	    String string = request.getParameter(name);
	    if(string == null || string == ""){
	    	return defaultValue;
	    }else{
	    	return string;
	    }
	}
	
	public int getInt(HttpServletRequest request, String name, int defaultValue){
	    //实现代码
		String string = request.getParameter(name);
		Integer is = Integer.valueOf(string);
	    if(is == null || is == 0){
	    	return defaultValue;
	    }else{
	    	return is;
	    }
	}
	
	
	
	public Boolean getInt(HttpServletRequest request, String name, Boolean defaultValue){
	    //实现代码
		String string = request.getParameter(name);
		Boolean is = Boolean.valueOf(string);
	    if(is == null){
	    	return defaultValue;
	    }else{
	    	return is;
	    }
	}
	
	
	
	public String getUrl(HttpServletRequest request){
	    //实现代码
		String path = request.getContextPath();
		return path;
	}
	
	
	public String getCookieValue(HttpServletRequest request,String name){
	    //实现代码
		Cookie[] cookies = request.getCookies();
		String name2 = cookies[0].getName();
		return name2;
	}



}
