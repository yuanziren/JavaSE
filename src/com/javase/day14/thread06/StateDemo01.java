package com.javase.day14.thread06;
/*
 * 线程的状态5种:
 * 	1.新生:创建线程对象
 * 	2.就绪状态:当调用start方法时,线程进入到就绪队列中,等待cpu调度,分配时间片
 *  3.运行状态:当获取到cpu分配的资源,开始执行线程
 *  4.阻塞状态:通过sleep()...进入
 *  5.终止状态:线程结束
 *  
 *  1.如果线程一旦结束,不能恢复,就算重写创建线程也是新线程了
 *  
 *  进入终止状态的情况:1.调用stop()destroy()强制停止线程   2.正常执行完毕    3.通过条件|标识控制
 *  
 *  进入到就绪状态的情况:
 *  				1.调用start()方法
 *  				2.阻塞状态结束,进入就绪状态,无法直接进入运行(运行状态cpu决定)
 *  				3.yield() 礼让线程
 *  				4.线程切换,被切换的线程进入到就绪状态
 *  
 *  进入到阻塞状态的情况:
 *  				1.IO操作
 *  				2.sleep()
 *  				3.wait()  
 *  				4.join()		
 */
public class StateDemo01 implements Runnable{
	//控制终止的标识
	boolean flag=true;
	
	public static void main(String[] args) {
		//创建线程
		StateDemo01 demo1=new StateDemo01();
		new Thread(demo1).start();
		
		for(int i=1;i<=100;i++){
			if(i==50){
				demo1.setFlag();
			}
			System.out.println("弱者小小张在线寻求强者帮助"+i);
		}
	}

	@Override
	public void run() {
		int i=1;
		while(flag){
			System.out.println("强者老裴,在线给你帮助.."+i++);
		}
		
	}
	
	//决定是否结束
	public void setFlag(){
		this.flag=false;
	}
}
