package com.javase.day12.convert05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * ת���� : �ֽ���ת�ַ���
 * 	InputStreamReader    
 * 	OutputStreamWriter    
 * 	û����������,���Է�����̬
 */
public class Demo02 {
	public static void main(String[] args) throws IOException {
		//ѡ����
		BufferedReader read=null;
		BufferedWriter write=null;
		read=new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream("D:/hehe.txt"))));
		write=new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("D:/aaaa.txt"))));
		//��д
		write.write(read.readLine());
		//ˢ��
		write.flush();
		//�ر�
		write.close();
		read.close();
	}
}
