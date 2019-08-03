package com.javase.day10.design02;
/*
 * 二十三中设计模式
 * 	单例模式: 保证这个类只能构建一个对象
 * 		饿汉式: 类第一次加载时,就创建对象        ---线程安全
 * 		懒汉式: 调用功能获取对象时,才创建对象 ---线程不安全
 * 
 *  1.构造器私有化
 *  2.提供一个私有的,静态的该类的引用
 *  3.静态的公共的访问方式
 *  
 *  懒汉式:
 */
public class Single {
	//2.提供一个私有的,静态的该类的引用
	private static Single single=null;
	
	//1.构造器私有化,外部不能使用
	private Single(){
		
	}
	
	//3.静态的公共的访问方式
	// A  B  
	/*public synchronized static Single newInstance(){
		if(single==null){
			single=new Single();
		}
		return single;
	}*/
	public static Single newInstance(){
		if(single==null){
			// A B
			synchronized(Single.class){
				if(single==null){
					single=new Single();
				}
			}
		}
		return single;
	}
	
	public void haha(){
		System.out.println("hhhhhhhhhhhhhh");
	}
	
}
