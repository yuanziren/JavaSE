package com.javase.day10.exception03;

import java.io.FileInputStream;
import java.io.InputStream;

/*
 * �쳣:����������
 * 	�쳣����ϵ:
 * 		Throwable
 * 		/  		\
 * 	Error		Exception
 * Error:����Ҫ��,һ��ָ���������,�����Ҳ�ز���
 * 	UnCheckedException:���ɼ��ʱ�쳣
 * Exception:
 * 			CheckedException:���ʱ�쳣|����ʱ�쳣
 * 				������ּ��ʱ�쳣,�������������޷�����ִ��
 * 			RuntimeException:����ʱ�쳣
 * 				���Լ򵥵�ͨ����ǿ����Ľ�׳�Դ���  if..
 * 				���е�����ʱ�쳣����ֱ�ӻ��߼�ӵļ̳���RuntimeException
 * 
 * ��˵����������ʱ�������쳣:
 * 	1.NullPointerException ��ָ��
 * 	2.ArrayIndexOutOfBoundsException ��������Խ���쳣
 * 	3.NegativeArraySizeException ���鳤�ȸ����쳣
 * 	4.ClassCastException ����ת���쳣
 * 	5.ArithmeticException ��ѧ�쳣
 *  6.NumberFormatException ����ת���쳣
 */
public class ExceptionDemo01 {
	public static void main(String[] args) {
		//��ָ��
		String str=null;
		if(str!=null){
			str.length();
		}
		
		//��������Խ���쳣
		int[] arr=new int[3];
		//System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
		
		//���鳤�ȸ����쳣
		//int[] arr2=new int[-3]; //NegativeArraySizeException
		
		//ClassCastException ����ת���쳣
		Person p=new Student();
		//Teacher t=(Teacher)p;
		
		//��ѧ�쳣
		//System.out.println(3/0);//ArithmeticException
		
		//����ת���쳣
		//String sss="123abs";//NumberFormatException
		//System.out.println(Integer.valueOf(sss));
		
		//����ʱ�쳣
//		/InputStream is=new FileInputStream("D:/test.txt");//FileNotFoundException

	
	}
}

class Person{
	
}
class Student extends Person{}
class Teacher extends Person{}
