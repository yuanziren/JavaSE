package com.javase.day14.synchronized07;
/*
 * 模拟12306买票   
 * 	100张票,卖给3个人,3个人同时购买 资源:100张票,3个人共享
 * 	多个线程同时操作100同一份资源的票,出现了线程不安全问题
 * 		锁方法
 * 		锁this,对象的地址,当前对象中所有的成员全被锁住,如果你只想锁某个资源,可以只锁这个资源
 */
public class Web_12306_03 implements Runnable{
	//Integer tickets=100; //成员属性属于对象
	Tickets tickets=new Tickets(); //锁资源,锁自定义对象的地址不会出现锁不住的情况
	
	@Override
	public void run() {
		while(true){
			// A B C
			synchronized (tickets) {
				if(tickets.num<=0){
					break;
				}
				try {
					Thread.sleep(200); //放大问题的可能性   延迟200ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"买了第"+tickets.num--+"张票");
			}
		}
		
	}
	
	public static void main(String[] args) {
		//开启3个线程
		Web_12306_03 web=new Web_12306_03();  //共享的资源对象
		new Thread(web,"小小张").start(); //开启一个小小张线程
		new Thread(web,"小小酥").start(); //开启一个小小张线程
		new Thread(web,"小小王").start(); //开启一个小小张线程
		
		//3个人买300张票,没有共享票数资源
//		new Thread(new Web_12306()).start();
//		new Thread(new Web_12306()).start();
//		new Thread(new Web_12306()).start();
	}
}

class Tickets{
	int num=100;
}
