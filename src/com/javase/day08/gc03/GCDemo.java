package com.javase.day08.gc03;
/*
 * 垃圾回收机制
 * 	jvm自动回收对象垃圾
 * 
 *  System.gc()  通知作用,通知垃圾回收机制来回收垃圾,来不来什么的时候来回收不确定
 *  
 *  finalize() 在回收垃圾的第一步调用finalize()方法,如果类中有自己定义,调用自己重写的,否则调用java给提供的
 * 	一定会调用finalize()方法的两种情况:
 * 								1)匿名对象
 * 								2)对象无引用状态
 */
public class GCDemo {
	public static void main(String[] args) {
		//匿名对象
		new GCDemo();
		System.gc(); //通知
		
		//对象无引用
		GCDemo demo=new GCDemo();
		GCDemo demo2=demo;
		demo=null;
		System.gc();
	}
	

	@Override
	protected void finalize() throws Throwable {
		System.out.println("gameover....");
	}
}
