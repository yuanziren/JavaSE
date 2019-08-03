package com.javase.day12.others07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��������������+String  :������   �ֽ���
 * 	DataInputStream()
 * 	DataOutputStream()
 * 	����������:
 * 		readXxx()  �����������͵�����
 * 		writeXxx() д�������������͵�����
 * 
 *  ������  :д������������͵�����
 */
public class DataDemo01 {
	public static void main(String[] args) throws IOException {
		write("D:/qqq.txt");
		read("D:/qqq.txt");
		
	}
	
	//��ȡ�����������͵�����
	public static void read(String src) throws IOException{
		//������
		DataInputStream is=new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
		//��ȡ����   д��˳��Ͷ���˳�����һ��
		int i=is.readInt();
		boolean b=is.readBoolean();
		String str=is.readUTF();
		System.out.println(i+","+b+","+str);
		//�ر�
		is.close();
	}
	
	//�ѻ����������͵�����д�����ļ�
	public static void write(String dest) throws IOException{
		//�����
		DataOutputStream os=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		
		//׼������
		int i=121;
		boolean b=false;
		String str="Ʒ��";
		//д��������������
		os.writeInt(i);
		os.writeBoolean(b);
		os.writeUTF(str);
		
		//ˢ��
		os.flush();
		//�ر�
		os.close();
	}
}
