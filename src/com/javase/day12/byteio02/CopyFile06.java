package com.javase.day12.byteio02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * �ļ�����
 * 	����Դ  ---����---   ����  ---���---   Ŀ�ĵ�
 * 	1.������  
 * 		�ļ�������
 * 		InputStream is=new FileInputStream("D:/hehe.txt");
 * 		�ļ������
 * 		OutputStream os=new FileOutputStream("E:/hehe.txt");
 *  2.׼������ 
 *  	byte[] car=new byte[1024];
 *  3.��ȡ+д��
 *  	int len;  //�������ݵĸ���
 *  	while((len=is.read(car))!=-1){
 *  		os.write(car,0,len);
 *  	}
 *  4.ˢ��
 *  	os.flush();
 *  5.�ر�
 *  	�ȴ򿪵ĺ�ر�
 */
public class CopyFile06 {
	public static void main(String[] args) {
		//1.ѡ����
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new FileInputStream("D:/hehe.txt");
			os=new FileOutputStream("E:/hehe.txt");
			//2.׼������ 
			byte[] car=new byte[1024];
			//3.��ȡ+д��
			int len = -1;  //�������ݵĸ���
			while((len=is.read(car))!=-1){
				os.write(car,0,len);
			}
			//4.ˢ��
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				//�ر�   һ�������try..catch   alt+shift+z
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
