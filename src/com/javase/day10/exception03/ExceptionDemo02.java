package com.javase.day10.exception03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * throw : 制造异常
 * 
 * 异常处理的两种方式:
 * 	throws : 抛出异常
 *  包异常 : 捕获异常
 *  	try {
			会出现异常的代码;
		}catch (Exception e) { //Exception e=new NullPointerException();
			e.printStackTrace();  
			出现这个异常后会执行的代码;
		}catch (NullPointerException e) {
			e.printStackTrace();  
			出现这个异常后会执行的代码;
		}finally{
			无论以上是否出现异常,都会执行finally中的代码
		}
		
		1.catch可以多个,至少有一个
		2.接受小范围异常的catch要写在上面,大范围写在下面
		3.try中的代码,一旦遇到异常就不会继续执行,会找对应的catch执行其中的代码
		
	方法的重写:
		子类方法上抛出异常大小<=父类中方法上抛出的异常
 */
public class ExceptionDemo02 extends Object{
	public static void main(String[] args){
		try{
			int[] arr2=new int[-3];
			throw new NullPointerException("hahah hehehe lellee");
			//System.out.println("这里好好的");
			//InputStream is=new FileInputStream("D:/test.txt");
		}catch(Exception e){
			//System.out.println("哈,哈,哈出现异常啦");
//			e.printStackTrace();
			System.out.println("------"+e.getMessage());
		}finally{
			System.out.println("最后的最后我们都会离开...");
		}
		System.out.println("啦啦啦啦啦啦啦啦");
		
		Zi zi=new Zi();
		zi.test();
		
		test();
		
	}
	
	public static void test(){
		try {
			InputStream is=new FileInputStream("D:/test.txt");
		} catch (FileNotFoundException e) {
			System.out.println("hhhh");
			return;
		}finally{
			System.out.println("你看谁,你看我???");
		}
		
		System.out.println("不行了哟");
	}
}

class Fu{
	void test() throws FileNotFoundException{
		
	}
}

class Zi extends Fu{
	void test(){
		System.out.println("哈哈哈");
	}
}
