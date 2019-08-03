package com.javase.day14.thread05;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用第三种开启线程的方式
 * 	实现Callable接口,重写call方法,允许有返回值,允许抛出异常,但是非常繁琐,不推荐使用,了解
 */
public class Match03 implements Callable<Integer>{
	//存储赢的线程的名字  共享的资源,多个共享这个资源
	String winner=null;  
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//创建线程
		 ExecutorService ser=Executors.newFixedThreadPool(2);
		 //提交服务
		 Match03 match=new Match03();
		 Future<Integer> result1=ser.submit(match);
		 Future<Integer> result2=ser.submit(match);
		 int i1=result1.get();
		 int i2=result2.get();
		 System.out.println(i1+"------->"+i2);
		//停止服务
		 ser.shutdownNow();
	}

	//线程体
	@Override
	public Integer call() {
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
				return i;
			}
		}
		return -1;
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

