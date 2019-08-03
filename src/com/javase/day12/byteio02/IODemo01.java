package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * IO:��,�ṩ��һЩ��дIO����� ����
 * 	����:��д�ļ��ڲ��Ķ���
 * 	��:һ�������������� �ܵ�  ���������ȳ�
 *  ����Դͷ   ����     Ŀ�ĵ�
 *  �Գ���Ϊ����   
 *  	����: ����Դ������
 *  	���: ����Ŀ�ĵ�
 *  
 *  ���ķ���:
 *  	���ܷ�:
 *  		�ڵ���
 *  		������
 *  	������Ԫ:
 *  		�ֽ���
 *  		�ַ���
 *  	�����:
 *  		������
 *  		�����
 *  	���������ศ���,������ͻ
 *  
 *  �ֽ���  ---*****
 *  	InputStream  ������Ԫ:�ֽ���    ���ܷ�:�ڵ���    �����:������
 *  public abstract class InputStream 
 *  	extends Object 
 *  	implements Closeable
 *  �˳������Ǳ�ʾ�ֽ���������������ĳ��ࡣ
	FileInputStream ���ļ�ϵͳ�е�ĳ���ļ��л�������ֽ�
 *  
 */
public class IODemo01 {
	public static void main(String[] args) throws IOException {
		//FileInputStream(File file) 
		File file=new File("D:/hehe.txt");
		//ѡ����
		//InputStream is=new FileInputStream(file);
		//FileInputStream(String name)  �ڲ�Ҫ�ȹ���file����
		InputStream is=new FileInputStream("D:/hehe.txt");
		//�������
		// int read()  �Ӵ��������ж�ȡһ�������ֽڡ� 
		int num=is.read();
		System.out.println((char)num);
		//�����ٶ�һ���ֽ�
		num=is.read();
		System.out.println((char)num);
		
		num=is.read();
		System.out.println((char)num);

		//�ر�
		is.close();
	}
}
