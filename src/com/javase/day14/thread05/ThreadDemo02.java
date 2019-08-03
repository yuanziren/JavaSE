package com.javase.day14.thread05;

import java.io.IOException;

/**
 * 实现Runnable接口,重写run方法
 * 	优点:
 * 		多实现避免单继承的局限性
 * 		实现资源共享 
 * 
 *  开启多线程:利用到代理模式,Thread作为代理
 */
public class ThreadDemo02 implements Runnable{
	public static void main(String[] args) {
		//开启线程,不能在主线程中代码执行完毕之后再去开启,顺序永远不会改变
		ThreadDemo02 thread=new ThreadDemo02();
		Thread th=new Thread(thread);
		th.start();
		
		for(int i=1;i<=100;i++){
			System.out.println("一遍敲代码....");
		}
	}

	/*
	 * 多线程的入口
	 */
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			System.out.println("一遍哄女朋友....");
		}
	}
}

