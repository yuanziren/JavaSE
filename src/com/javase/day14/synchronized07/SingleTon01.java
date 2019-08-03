package com.javase.day14.synchronized07;
/*
 * 多个线程,同时操作同一份资源的时候,可能发生线程不安全问题
 * 	控制线程不安全问题: 
 * 		同步锁   synchronized,锁不变的东西,同一个对象,地址
 * 	使用方式:
 * 		1.同步方法 
 * 			同步静态方法 --同步类
 * 			同步成员方法 --
 * 		2.同步块
 * 			this,类,资源(一般指成员属性)
 * 	注意:锁的内容范围小,容易锁不住,范围太小效率低,但是简单
 * 
 *  单例代理: 一个类只能构建一个对象
 *  	懒汉式是线程不安全的,控制线程安全问题
 *  		锁方法:范围较大,但是简单
 *  		锁块
 *  
 *  
 *  	
 */
public class SingleTon01 {
	public static void main(String[] args) {
		//开启多线程
		new Thread(){
			public void run() {
				System.out.println(Single.newInstance());
			};
		}.start();
		new Thread(){
			public void run() {
				System.out.println(Single.newInstance());
			};
		}.start();
		
	}
}

class Single {
	//2.提供一个私有的,静态的该类的引用
	private static Single single=null;
	
	//1.构造器私有化,外部不能使用
	private Single(){
		
	}
	
	//3.静态的公共的访问方式
	/*public static Single newInstance(){
		if(single==null){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			single=new Single();
		}
		return single;
	}*/
	
	// A  B  
	/*public synchronized static Single newInstance(){
		if(single==null){
		try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			single=new Single();
		}
		return single;
	}*/
	//双重锁,可能不适用,提高效率使用
	public static Single newInstance(){
		System.out.println("-------------");
		if(single==null){
			System.out.println("-------不需要锁的代码就不锁-------");
			// A B
			synchronized(Single.class){  //现在的锁的就是这个类,锁住了这个类的所有对象,锁静态的方法也相当于锁类,静态的内容是属于类的
				if(single==null){
					single=new Single();
				}
			}
		}
		return single;
	}
	
}
