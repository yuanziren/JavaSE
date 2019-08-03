package com.javase.day12.buffered04;

import java.io.File;
import java.io.IOException;

/*
 * ���·��    1.�����̷���ͷ      2.����/��ͷ ,��user.dir��ƴ��ָ��·��
 * ����·��: 1.���̷���ͷ      2./��ͷ
 */
public class Path03 {
	public static void main(String[] args) throws IOException {
		File file=new File("test.txt");
		file.createNewFile();
		System.out.println(file.getAbsolutePath());
		
		System.out.println(System.getProperty("user.dir"));
	}
}
