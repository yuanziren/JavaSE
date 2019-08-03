package com.javase.day14.thread05;

import java.io.IOException;

/**
 * 龟兔赛跑
 * 	每个人跑到100不就算赢,谁先到100不谁就赢,兔子没跑10步就休息200ms,如果有人赢了游戏结束
 * 	赢的条件:这个线程的步数i为100
 */
public class Match implements Runnable{
	//存储赢的线程的名字  共享的资源,多个共享这个资源
	String winner=null;  
	public static void main(String[] args) {
		Match match=new Match();  //同一场比赛
		new Thread(match,"rabbit").start();
		new Thread(match,"tortoise").start();
	}

	//线程体
	@Override
	public void run() {
		for(int i=1;i<=1000;i++){ //i是跑了的步数
			//判断当前线程是否为兔子,如果是兔子并且步数为10的倍数,休息200ms
			if(Thread.currentThread().getName().equals("rabbit") && i%10==0){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"--->"+i);
			//检查游戏有没有结束  如果flag为true就游戏结束,如果为false没结束
			boolean flag=checkOver(i); //把当前线程的步数传进去进行判断 
			if(flag){
				break;
			}
		}
	}
	
	//检查游戏是否结束 winner赋值
	public boolean checkOver(int steps){
		if(winner !=null){
			return true;
		}else{
			if(steps==1000){
				winner = Thread.currentThread().getName();
				return true;
			}
		}
		return false;
	}
	
	

}

