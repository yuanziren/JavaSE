package com.javase.day14.thread06;

import java.lang.Thread.State;

/*
 * 线程状态问题 
 * 	getState()获取一个线程的状态
 * 
 * 线程的优先级问题:不能决定哪个线程先执行,但是可以提高执行几率
 * 	setPriority(int pro)
 *  getPriority()
 * 		1~10  1最小:MIN_PRIORITY    10最大:MAX_PRIORITY   5:NORM_PRIORITY
 */
public class StateDemo05 {
	public static void main(String[] args) {
		//优先级问题
		Thread th1=new Thread(()->{System.out.println("我是线程1");});
		
		Thread th2=new Thread(()->System.out.println("我是线程2"));
		
//		th1.setPriority(Thread.MAX_PRIORITY);
//		th2.setPriority(Thread.MIN_PRIORITY);
		
		//获取优先级  默认为5
		System.out.println(th1.getPriority()); //5
		System.out.println(th2.getPriority());
		
		th1.start();
		th2.start();
		
		
		//获取状态问题
		/*Thread th=new Thread(()->{
			for(int i=0;i<=100;i++){
				if(i==50){
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("--------------"+i);
			}
		});
		//新生状态    NEW
		State state=th.getState();
		System.out.println(state);
		
		//就绪状态  RUNNABLE
		th.start();
		System.out.println(th.getState());
		
		while(true){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(th.getState());
		}*/
	}
}
