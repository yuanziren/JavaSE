package com.javase.day14.synchronized07;
/*
 * 模拟12306买票   
 * 	100张票,卖给3个人,3个人同时购买 资源:100张票,3个人共享
 * 	多个线程同时操作100同一份资源的票,出现了线程不安全问题
 * 		锁方法
 */
public class Web_12306 implements Runnable{
	int tickets=100;
	
	@Override
	public void run() {
		while(true){
			//循环停止条件
			//A B C
			boolean flag=test();
			if(flag==false){
				return;
			}
		}
		
	}
	
	//锁方法
	public synchronized boolean test(){
		if(tickets<=0){
			return false;
		}
		try {
			Thread.sleep(200); //放大问题的可能性   延迟200ms
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"买了第"+tickets--+"张票");
		return true;
	}
	
	public static void main(String[] args) {
		//开启3个线程
		Web_12306 web=new Web_12306();
		new Thread(web,"小小张").start(); //开启一个小小张线程
		new Thread(web,"小小酥").start(); //开启一个小小张线程
		new Thread(web,"小小王").start(); //开启一个小小张线程
		
		//3个人买300张票,没有共享票数资源
//		new Thread(new Web_12306()).start();
//		new Thread(new Web_12306()).start();
//		new Thread(new Web_12306()).start();
	}
}
