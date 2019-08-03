package com.javase.day12.buffered04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 *  �ֽ���InputStream OutputStream,�ַ���Reader,Writer  -->�ڵ���
 *  �ڵ���:����Դ��Ŀ�ĵ�֮��ֱ�Ӵ���
 *  ������:��ǿ����,�������,û��ʵ���Ե����ã��ڽڵ���֮��
 *  
 *  ������(�ڵ���)
 *  �ֽڻ�����:BufferedInputStream,BufferedOutputStream
 *  ����������,���Զ�̬����
 *  �ַ�������:BufferedReader,BufferedWriter
 */
public class Demo01 {
	public static void main(String[] args) {
		//1.ѡ����
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new BufferedInputStream(new FileInputStream("D:/haha.txt"));
			os=new BufferedOutputStream(new FileOutputStream("D:/houhou.txt"));
			//2.����
			byte[] car=new byte[1024];
			int len;
			while((len=is.read(car))!=-1){
				os.write(car, 0, len);
			}
			//3.ˢ��
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				//�ر�
				if(os!=null){
					os.close();
				}
				if(is!=null){
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
