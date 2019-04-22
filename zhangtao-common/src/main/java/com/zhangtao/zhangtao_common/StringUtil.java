package com.zhangtao.zhangtao_common;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
	public boolean hasLength(String src){
		//空字符串和空引号返回false
		boolean b = !StringUtils.isEmpty(src);
		return b;
	}
	public boolean hasText(String src){
	    //空引号和空白字符串返回false
		boolean b = !StringUtils.isBlank(src);
		return b;
	}
	public boolean isMobile(String src){
		//通过正则验证手机号是否为正确,正确返回true,错误返回false
	    String reg = "1[3578]\\d{9}";
	    boolean b = src.matches(reg);
	    return b;
	}
	public boolean isEmail(String src){
	    //通过正则验证邮箱是否为正确,正确返回true,错误返回false
		String reg = "^\\d+@\\w+\\.com$";
	    boolean b = src.matches(reg);
	    return b;
	}
	
	public String reverse(String src){
	    //利用StringUtils将字符串反转然后返回
		
		String string = StringUtils.reverse(src);
		return string;
	}
	
	
	public static void main(String[] args) {
		StringUtil str = new StringUtil();
		//System.out.println(str.hasLength(""));
		//System.out.println(str.hasText("   "));
		//System.out.println(str.isMobile("18100178589"));
		//System.out.println(str.isEmail("1147959494@qq.com"));
		System.out.println(str.reverse("1147959494@qq.com"));
	}
}
