package com.javase.day14.thread06;
/*
 * yield() 礼让线程,高风亮节,暂停线程
 */
public class YieldDemo03 implements Runnable{
	public static void main(String[] args) {
		YieldDemo03 demo=new YieldDemo03();
		new Thread(demo,"AAAA").start();
		new Thread(demo,"BBBB").start();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"start");
		Thread.yield();  //礼让先生,资源共享出来
		System.out.println(Thread.currentThread().getName()+"over");
	}
}
