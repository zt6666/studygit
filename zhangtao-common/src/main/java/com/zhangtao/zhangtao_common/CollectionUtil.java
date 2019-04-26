package com.zhangtao.zhangtao_common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtil {
	/**
	 * 功能说明：判断List或Set对象是否空或不包含元素<br>
	 * @param coll
	 * @return
	 * boolean
	 */
	public static boolean isEmpty(Collection<?> coll){
		return coll == null || coll.isEmpty();
	}
	
	/**
	 * 功能说明：判断List或Set对象是否不为空或包含元素<br>
	 * @param coll
	 * @return
	 * boolean
	 */
	public static boolean notEmpty(Collection<?> coll){
		return coll != null && !coll.isEmpty();
	}
	
	
	/**
	 * 功能说明：判断Map对象是否空或不包含元素<br>
	 * @param map
	 * @return
	 * boolean
	 */
	public static boolean isEmpty(Map<?, ?> map){
		return map == null || map.isEmpty();
	}
	
	
	/**
	 * 功能说明：判断Map对象是否不为空或包含元素<br>
	 * @param map
	 * @return
	 * boolean
	 */
	public static boolean notEmpty(Map<?, ?> map){
		return map != null && !map.isEmpty();
	}
}
