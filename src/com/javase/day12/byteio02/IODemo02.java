package com.javase.day12.byteio02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * ÿ�ζ�ȡһ���ֽ�,����ֽ�Ҫ�ֶ�����̫�鷳,Ϊ�˼�,ѡ��ʹ��ѭ��
 */
public class IODemo02 {
	public static void main(String[] args) throws IOException {
		//ѡ����
		InputStream is=new FileInputStream("D:/hehe.txt");
		//�������
		int num=-1;
		/*while((num=is.read())!=-1){
			System.out.print(num);
		}*/
		while((num=is.read())!=-1){
			System.out.print((char)num);
		}
		//�ر�
		is.close();
	}
}
