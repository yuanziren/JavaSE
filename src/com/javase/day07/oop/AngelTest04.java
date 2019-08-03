package com.javase.day07.oop;
/*
 * 测试天使类       
 * 
 * 你去旅行  
 * 	有几个事物    秘书   国家   
 * 	秘书有一个能力,就是为你订去不同国家的机票,查攻略,订酒店
 */
public class AngelTest04 {

	public static void main(String[] args) {
		Angel03 angel1=new Angel03();
		Angel03 angel2=new Angel03();
		System.out.println(angel1==angel2);  //false
		System.out.println(angel1);  //对象的地址值
		System.out.println(angel2);  //对象的地址值
		
		angel1.name="老裴";
		angel1.swing=4;
		angel1.circle=false;
		
		angel2.name="老高";
		angel2.swing=6;
		angel2.circle=true;
		
		angel1.assist();
		angel2.assist();
		
		Angel03 angel3=angel1;
		System.out.println(angel3==angel1);
		
		//匿名对象  :没有名字的对象  只能使用一次
		new Angel03().name="刘东京";
		new Angel03().assist();
		
		//局部变量  使用前必须声明并且赋值
		Angel03 angel4=null;    
		//System.out.println(angel4.name);    // NullPointerException
		
		//创建数据
		int[] arr=null;
		//System.out.println(arr[0]);
	}

}
