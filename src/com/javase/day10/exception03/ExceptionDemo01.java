package com.javase.day10.exception03;

import java.io.FileInputStream;
import java.io.InputStream;

/*
 * 异常:程序生病了
 * 	异常的体系:
 * 		Throwable
 * 		/  		\
 * 	Error		Exception
 * Error:不需要管,一般指虚拟机问题,你想管也关不了
 * 	UnCheckedException:不可检查时异常
 * Exception:
 * 			CheckedException:检查时异常|编译时异常
 * 				如果出现检查时异常,如果不处理程序无法继续执行
 * 			RuntimeException:运行时异常
 * 				可以简单的通过增强程序的健壮性处理  if..
 * 				所有的运行时异常都会直接或者间接的继承自RuntimeException
 * 
 * 请说出几种运行时常见的异常:
 * 	1.NullPointerException 空指针
 * 	2.ArrayIndexOutOfBoundsException 数组索引越界异常
 * 	3.NegativeArraySizeException 数组长度负数异常
 * 	4.ClassCastException 类型转换异常
 * 	5.ArithmeticException 数学异常
 *  6.NumberFormatException 数字转换异常
 */
public class ExceptionDemo01 {
	public static void main(String[] args) {
		//空指针
		String str=null;
		if(str!=null){
			str.length();
		}
		
		//数组索引越界异常
		int[] arr=new int[3];
		//System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
		
		//数组长度负数异常
		//int[] arr2=new int[-3]; //NegativeArraySizeException
		
		//ClassCastException 类型转换异常
		Person p=new Student();
		//Teacher t=(Teacher)p;
		
		//数学异常
		//System.out.println(3/0);//ArithmeticException
		
		//数字转换异常
		//String sss="123abs";//NumberFormatException
		//System.out.println(Integer.valueOf(sss));
		
		//编译时异常
//		/InputStream is=new FileInputStream("D:/test.txt");//FileNotFoundException

	
	}
}

class Person{
	
}
class Student extends Person{}
class Teacher extends Person{}
