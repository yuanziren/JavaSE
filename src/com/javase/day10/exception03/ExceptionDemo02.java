package com.javase.day10.exception03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * throw : �����쳣
 * 
 * �쳣��������ַ�ʽ:
 * 	throws : �׳��쳣
 *  ���쳣 : �����쳣
 *  	try {
			������쳣�Ĵ���;
		}catch (Exception e) { //Exception e=new NullPointerException();
			e.printStackTrace();  
			��������쳣���ִ�еĴ���;
		}catch (NullPointerException e) {
			e.printStackTrace();  
			��������쳣���ִ�еĴ���;
		}finally{
			���������Ƿ�����쳣,����ִ��finally�еĴ���
		}
		
		1.catch���Զ��,������һ��
		2.����С��Χ�쳣��catchҪд������,��Χд������
		3.try�еĴ���,һ�������쳣�Ͳ������ִ��,���Ҷ�Ӧ��catchִ�����еĴ���
		
	��������д:
		���෽�����׳��쳣��С<=�����з������׳����쳣
 */
public class ExceptionDemo02 extends Object{
	public static void main(String[] args){
		try{
			int[] arr2=new int[-3];
			throw new NullPointerException("hahah hehehe lellee");
			//System.out.println("����úõ�");
			//InputStream is=new FileInputStream("D:/test.txt");
		}catch(Exception e){
			//System.out.println("��,��,�������쳣��");
//			e.printStackTrace();
			System.out.println("------"+e.getMessage());
		}finally{
			System.out.println("����������Ƕ����뿪...");
		}
		System.out.println("����������������");
		
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
			System.out.println("�㿴˭,�㿴��???");
		}
		
		System.out.println("������Ӵ");
	}
}

class Fu{
	void test() throws FileNotFoundException{
		
	}
}

class Zi extends Fu{
	void test(){
		System.out.println("������");
	}
}
