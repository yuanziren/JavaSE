package com.javase.day14.thread05;
/*
 * 多线程:
 * 	多个任务同时执行就是多线程,如果不需要多任务,就不需要多线程
 *  进程:资源分配的最小范围,进程都拥有自己的代码和数据空间,一个进程中可以存在一到多个线程,进程之间切换,消耗大
 *  线程:cpu调度的最小单位,一类线程同时共享一个一个进程的代码和数据空间,线程之间切换消耗小
 *  	单核状态下:cpu同一时刻资源只能分配给一个线程
 *  
 *  线程的开启方式:
 *  	3种,关注前两种,第三种了解
 *  	1.继承 Thread类,重写run()
 *  	2.实现Runable接口,重写run()方法,推荐
 *  	3.实现Callable接口,重写call()方法 ,了解
 *  
 *  
 */
public class ThreadDemo01 extends Thread{
	//多线程的线程体,多线程的入口
	@Override
	public void run() {
		for(int i=0;i<=100;i++){
			System.out.println("一边说话....");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("下面我要开启多线程");
		//开启另一个线程  start()方法
		ThreadDemo01 th=new ThreadDemo01();
		//th.run();//方法的调用	
		th.start();
		
		for(int i=0;i<=100;i++){
			System.out.println("一边吃饭....");
		}
	}
}
