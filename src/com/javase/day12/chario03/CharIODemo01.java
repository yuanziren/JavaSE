package com.javase.day12.chario03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * �ַ���
 * 	�������ı�������
 *  �ַ�������
 *  	Reader  ���ڶ�ȡ�ַ����ĳ�����    FileReader,û����������,��̬
 *  			read()    read(char[])   +close()
 *  �ַ������
 *  	Writer   FileWriter
 *  			write()  write(char[]) write(char,index,len) write(String) + append(char|String)+flush()+close()
 *
 *	�ַ����ļ�����
 */
public class CharIODemo01 {
	public static void main(String[] args) {
		//ѡ����
		Reader read=null;
		Writer write=null;
		try {
			read=new FileReader("D:/hehe.txt");
			write=new FileWriter("E:/lalala.txt",true);  //true׷��
			//��ȡ����
			/*int num=read.read();
			System.out.println((char)num);
			num=read.read();
			System.out.println((char)num);*/
			//�ַ����� 
			char[] car=new char[1024];
			int len;
			while(-1!=(len=read.read(car))){
				System.out.println(new String(car,0,len));
//				System.out.println(car);
//				write.write(car);
				
				//д��
			/*	write.write("������������");
				write.write(97);
				write.write(car,0,len);
				
				write.append('q');
				write.append("�ǺǺǺǺǶ�");*/
				
			}
			//ˢ��
			write.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
