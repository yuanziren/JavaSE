package com.javase.day14.thread05;

public class Demo05 {
	
	//静态内部类
	static class Inner implements Runnable{
		@Override
		public void run() {
			for(int i=1;i<=20;i++){
				System.out.println("啊哈哈,我是静态内部类开启多线程啦"+i);
			}
		}		
	}
	
	public static void main(String[] args) {
		//局部内部类
		class Local implements Runnable{

			@Override
			public void run() {
				for(int i=1;i<=20;i++){
					System.out.println("啊哈哈,我是局部内部类开启多线程啦"+i);
				}
			}
			
		}
		//开启多线程
//		new Thread(new Inner(),"静态内部类").start();
		//new Thread(new Local(),"局部内部类").start();
		//匿名内部类开启多线程
		new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=1;i<=20;i++){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("啊哈哈,匿名内部类开启多线程啦"+i);
				}
			}
			
		}, "局部内部类").start();
		
		new Thread( ()->{
			for(int i=1;i<=20;i++){
			System.out.println("啊哈哈,Lambda开启多线程啦"+i);
			}
		} , "局部内部类").start();
	}
}
