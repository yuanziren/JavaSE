package com.javase.day14.thread06;
/*
 * join() 合并线程,插入线程,插队
 * 	会使原线程进入阻塞状态
 */
public class Join04 {
	public static void main(String[] args) {
		new Thread(new Father()).start();
	}
}

class Father implements Runnable{

	@Override
	public void run() {
		System.out.println("想抽烟了...");
		System.out.println("给儿子拿100让我儿子去买盒中华...");
		Son son=new Son();
		//线程新生
		new Thread(son).start();
		//线程就绪状态
//		th.start();
		try {
			//儿子线程插队
			son.join();  //阻塞状态,等待儿子线程执行完毕
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//合并线程
		System.out.println("接过烟,开心的吸了一口...");
	}
	
}

class Son extends Thread{

	@Override
	public void run() {
		System.out.println("儿子接过钱去买烟...");
		System.out.println("路上遇到一家游戏厅,进去玩10s钟...");
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"秒钟过去了");
		}
		System.out.println("去买烟");
		System.out.println("买了烟给老爸...");
		
	}
	
}
