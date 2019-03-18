package com.wwj.util;

/**
 * 打印工具类
 * @author wwj
 *
 */
public class Print {
	
	public static void print(Object ...objs) {
		for(Object obj:objs) {
			System.out.println(obj);
		}
	}

}
