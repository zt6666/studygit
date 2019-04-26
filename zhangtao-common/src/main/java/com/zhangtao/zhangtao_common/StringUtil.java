package com.zhangtao.zhangtao_common;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
			public static boolean  hasLength(String src){
				//   不等于 null    并且  长度大于0  返回true：代表有值
				if(src!=null && src.length()>0){
					return  true;
				}
				// 其他 返回 false，代表没有值
				return false;
			}
			
			
			//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
			public static boolean hasText(String src){
			    //实现代码
//				StringUtils.isNotBlank(str)
				if(src!=null  && src.length()>0 && !src.equals(" ")){
					return  true;
				}
				return false;
			}
			
			
			//方法3：判断是否为手机号码 (5分)
			public static boolean isMobile(String src){
			    //实现代码
				String reg = "[1]\\d{10}";
				//判断是否匹配
				boolean flag  = src.matches(reg);
				return flag;
			}
			
			
			//方法4：判断是否为邮箱 (5分)
			public static boolean isEmail(String src){
			    //实现代码       myc@163.com      myc@yahoo.com.cn
				String  reg = "\\w+@[0-9a-z]{1,}(.)[a-z]{2,3}((.)[a-z]{2,3})?";
				return  src.matches(reg);
			}

			
			
			// 方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
			public static String reverse(String src){
			    //实现代码
				//StringUtils.reverse(src);
				if(src==null){
					return null;
				}
				StringBuffer buffer = new StringBuffer(src);
				return  buffer.reverse().toString();
			}
		
}
