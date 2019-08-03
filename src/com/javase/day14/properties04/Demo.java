package com.javase.day14.properties04;

import java.io.IOException;
import java.util.Properties;
/*
 * Properties 容器Map的实现类
	要求键值对都是String类型
	配置文件使用
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		Properties pro=new Properties();
	/*	pro.put("张三", "180");
		pro.setProperty("李四", "170");
		System.out.println(pro);
		System.out.println(pro.getProperty("张三"));
		System.out.println(pro.get("张三"));*/
		//获取配置文件中数据的方式,查
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("age"));
	}
}
