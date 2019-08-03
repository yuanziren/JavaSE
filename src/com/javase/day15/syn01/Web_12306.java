package com.javase.day15.syn01;
/*
 * 模拟12306买票   
 * 	100张票,卖给3个人,3个人同时购买 资源:100张票,3个人共享
 * 	使用实现Runnable接口,重写run方法模式开启多线程,实现资源共享
 */
public class Web_12306 implements Runnable{
	static int tickets=100;
	//Tickets tickets=new Tickets();
	
	@Override
	public void run() {
		while(true){
			//循环停止条件
			synchronized (Web_12306.class) { //锁类就是锁住了这个类所有的对象
				if(tickets<=0){
					break;
				}
				try {
					Thread.sleep(200); //放大问题的可能性   延迟200ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"买了第"+tickets--+"张票");
			}
		}
		
	}
	
	public static void main(String[] args) {
		//开启3个线程
		Web_12306 web=new Web_12306();
		new Thread(new Web_12306(),"小小张").start(); //开启一个小小张线程
		new Thread(new Web_12306(),"小小酥").start(); //开启一个小小张线程
//		new Thread(web,"小小王").start(); //开启一个小小张线程
		
		//3个人买300张票,没有共享票数资源
//		new Thread(new Web_12306()).start();
//		new Thread(new Web_12306()).start();
//		new Thread(new Web_12306()).start();
	}
}

class Tickets{
	int num=100;
}
