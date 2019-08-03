package com.javase.day15.syn01;
/*
 * 当锁用的过多,或者不正确可能出现死锁,无法释放
 */
public class TestDeadLock02 {
	public static void main(String[] args) {
		Object obj1 =new Object();
		Object obj2 =new Object();
		new A(obj1,obj2).start();
		new B(obj1,obj2).start();
	}
}

class A extends Thread{
	Object obj1 ;
	Object obj2;
	public A() {}
	public A(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	@Override
	public void run() {
		synchronized(obj1){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(obj2){
				
			}
		}
		System.out.println("给我烟");
	}
}
class B extends Thread{
	Object obj1 ;
	Object obj2;
	public B() {
	}
	public B(Object obj1, Object obj2) {
	super();
	this.obj1 = obj1;
	this.obj2 = obj2;
	}
	@Override
	public void run() {
		synchronized(obj2){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(obj1){
			}
		}
		System.out.println("给我钱");
	}
}