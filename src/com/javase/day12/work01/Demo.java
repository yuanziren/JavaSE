package com.javase.day12.work01;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		System.out.println(new File("D:/haha.txt").lastModified());
		
		Cmd cmd=new Cmd();
		//cmd.cmd();
		
		//renameTo(File) ������(�ƶ��ļ����Կ��̷��ƶ��ļ�,�ƶ��ļ���ͬ�̷��¿���,���̷�����) 
//		File file=new File("D:/hehe.txt");
//		File dest=new File("E:/hehe.txt");
		File file=new File("D:/AAA");
		File dest=new File("D:/BBB");
		System.out.println(file.renameTo(dest));
		
	}
}
