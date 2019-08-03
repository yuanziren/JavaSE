package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * �ӳ�����д�����ļ���������  
 * ����� OutputStream   ����:�����   ����:�ڵ���	������Ԫ:�ֽ���
 * public abstract class OutputStream
 * extends Object
 * implements Closeable, Flushable
 * �˳������Ǳ�ʾ����ֽ�����������ĳ���
   FileOutputStream �ļ�����������ڽ�����д�� File
       Ĭ��д����ʱ��ظ���Դ�ļ�������,�����Ҫ׷�����Ĺ�����,�ڶ�������boolean����ֵ,�����Ƿ�׷��,true׷��,falseĬ�ϲ�׷��
 */
public class IODemo04 {
	public static void main(String[] args) throws IOException {
		//1.������ϵ   File Ŀ�ĵ� 
		File file=new File("D:/hehe.txt");
		//2.ѡ����
		//FileOutputStream(File file) \ ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
		OutputStream out=new FileOutputStream(file,true);  //���� ctrl+1
		//3.����д��
		//void write(int b) ��ָ���ֽ�д����ļ�������� 
		out.write(99);
		//4.ǿ��ˢ��
		out.flush();
		//5.�ر�
		out.close();
	}
}
