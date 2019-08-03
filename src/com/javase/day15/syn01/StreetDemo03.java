package com.javase.day15.syn01;
/*
 * 线程通信:生产者消费者模式
 * 	wait  notify notifyAll   --> 同步状态中
 * 	信号灯法实现线程通信
 * 		Street 共享街道     信号灯 flag   boolean 
 * 	flag->false  车走      东西  车走的时候人停
 * 	flag->true	  人走      南北  人走的时候车停
 */
public class StreetDemo03 {
	public static void main(String[] args) {
		Street street=new Street();
		new Thread(new Person(street),"人").start();
		new Thread(new Car(street),"车").start();
	}
}

//街道 Street
class Street{
	//信号灯
	boolean flag=false;
	
	//人走   南北
	public synchronized void sn(){
		if(flag==false){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("人走完了..");
			//变灯
			flag=false;
			//唤醒对方
			this.notify();
		}
	}
	
	//车走  东西
		public synchronized void we(){
			if(flag==true){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("车走完了..");
				//变灯
				flag=true;
				//唤醒对方
				this.notify();
			}
		}
}

//人
class Person implements Runnable{
	//资源
	Street street;
	
	public Person(Street street) {
		this.street=street;
	}
	

	@Override
	public void run() {
		while(true){
			street.sn();
		}
		
	}
	
}

//车
class Car implements Runnable{
	//资源
	Street street;
	
	public Car(Street street) {
		this.street=street;
	}
	

	@Override
	public void run() {
		while(true){
			street.we();
		}
		
	}
	
}
