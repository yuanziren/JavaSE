package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * ÿ�ζ�ȡһ���ֽ�,Ч�ʵ�,����ѡ��ʹ��ÿ�ζ�ȡһ����һ���ֽ����������
 * ���:
 * Ŀ�ĵ�,�¼�			---File
 * ��ҹ�˾			---��
 * ��ʼ���
 * 	ѡ�����乤��		---ѡ�񿨳��ֽ�����   �ֽ���ʽ����  
 * ����				---�ر���Դ
 * ע��:�ֽ�����ĳ���ָ��
 */
public class IODemo03 {
	public static void main(String[] args) throws IOException {
		//ѡ����
		InputStream is=new FileInputStream("D:/hehe.txt");
		//�ȴ����洢���ݵ�С���� �ֽ�����
		byte[] car=new byte[1024];
		//�������
		int len=is.read(car);
		System.out.println(new String(car,0,len));
		//�ر�
		is.close();
	}
}
