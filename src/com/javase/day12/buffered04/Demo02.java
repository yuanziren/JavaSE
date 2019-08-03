package com.javase.day12.buffered04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/**
 * �ַ�������:BufferedReader,BufferedWriter
 * ������������,����ʹ�ö�̬,��Ϊ�������ö����������������ɼ�
 * 	BufferedReader: readLine() ��һ��
 *  BufferedWriter: newLine() ���з�
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//ѡ����
		BufferedReader read=null;
		BufferedWriter write=null;
		try {
			read=new BufferedReader(new FileReader("D:/hehe.txt"));
			write=new BufferedWriter(new FileWriter("D:/ccc.txt"));
			//����
//			char[] car=new char[1024];
			String str;
			while((str=read.readLine())!=null){
				write.write(str);
				write.write("\r\n");  //ϵͳʶ����
//				write.newLine();
			}
			//ˢ��
			write.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//�ر�
			try {
				if(write!=null){
					write.close();
				}
				if(read!=null){
					read.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
