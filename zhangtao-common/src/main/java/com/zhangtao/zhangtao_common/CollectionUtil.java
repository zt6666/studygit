package com.zhangtao.zhangtao_common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtil {
	public boolean notEmpty(Collection<String> con){
		
		//利用增强for循环遍历依次比较看是否为空,
		for (String string : con) {
			if(string !=null && string !=""){
				return true;
			}else{
				continue;
			}
		}
		return false;
	}
	
	
	public boolean notEmpty(Map<String,String> map){
		Set<String> set = map.keySet();
		int i = 0;
		Set<String> set1 = new HashSet<>();
		for (String string : set) {
			set1.add(map.get(string));
			if(string !=null && string !=""){
				i++;
			}else{
				continue;
			}
		}
		for (String string : set1) {
			if(string !=null && string !=""){
				i++;
			}else{
				continue;
			}
		}
	   if(i==0){
		   return false;
	   }else{
		   return true;
	   }
	}

	public static void main(String[] args) {
		CollectionUtil con = new CollectionUtil();
		List<String> list = new ArrayList<>();
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		
//		Set<String> list = new HashSet();
//		list.add(null);
//		list.add(null);
//		list.add(null);
//		list.add(null);
//		list.add(null);
//		list.add(null);
		
		
		Map<String, String> map = new HashMap<>();
		map.put("", "aa");
		System.out.println(con.notEmpty(map));
	}
}
