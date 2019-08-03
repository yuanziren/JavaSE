package com.javase.day12.bytearray06;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * �ֽ�������
 * 	�ڵ��� 
 * 	1.Դͷ���ļ���Ϊ�ֽ�����
 * 	2.����Ҫ�ر�
 * 	3.���˹���
 *	4.�κζ���������תΪ�ֽ�����,ֱ�Ӳ����ڴ�
 *	�ֽ�����������
 *		ByteArrayInputStream
 *	�ֽ����������
 *		ByteArrayOutputStream
 *		��������:	 byte[] toByteArray() ����һ���·���� byte ���顣 
 *		���ܶ�̬ʹ��
 *
 *  �����е�����--->�ֽ�����
 *  �ֽ�����--->����������
 *  
 *  ��ҵ:
 *  �ļ���--�ļ�������-->����--�ֽ����������-->�ֽ�����
 *  �ֽ�����--�ֽ�����������-->���� --�ļ������-->�ļ�
 */
public class Demo01 {
	public static void main(String[] args) throws IOException {
		fromByteArray(toByteArray());
	}
	//���ֽ������ж�ȡ����
	public static void fromByteArray(byte[] arr) throws IOException{
		//1.ѡ����
		InputStream is=new BufferedInputStream(new ByteArrayInputStream(arr));
		//2.��
		byte[] car=new byte[1024];
		int len;
		while((len=is.read(car))!=-1){
			System.out.println(new String(car,0,len));
		}
		is.close();
	}
	
	
	//������д�����ֽ�������
	public static byte[] toByteArray() throws IOException{
		//������
		ByteArrayOutputStream os=new ByteArrayOutputStream();
		String str="�����ֽ�������,����һЩ�������ײ���ܵײ㶼����,�����������ʹ����,���˽���,лл!!!";
		os.write(str.getBytes());
		byte[] arr=os.toByteArray();
		return arr;
	}
}
