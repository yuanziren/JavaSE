package com.javase.day14.thread06;
/*
 * sleep:
 * 	1.模拟网络延时
 * 	2.放大问题的可能性
 */
public class Sleep02 implements Runnable{
	public static void main(String[] args) {
		new Thread(new Sleep02()).start();
	}

	@Override
	public void run() {
		for(int i=10;i>=0;i--){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  //1s
			if(i==0){
				System.out.println("小小张boom!!!");
			}else{
				System.out.println(i);
			}
		}
		
	}
}
