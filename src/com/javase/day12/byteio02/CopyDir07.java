package com.javase.day12.byteio02;

import java.io.File;
import java.io.IOException;

/*
 * �ļ��п���
 * 	1.���ܰ��ļ��������ļ�����·����
 * 	2.�������Ŀ���ļ�������Ŀ���ļ�����·����
 */
public class CopyDir07 {
	public static void main(String[] args) throws IOException {
		CopyDir("D:/AAA","E:/");
	}
	
	//1.���ܰ��ļ��������ļ�����·����
	public static void selfPath(String src,String dest) throws IOException{
		int index=src.lastIndexOf("/");
		String str=src.substring(0, index);
		if(str.equals(dest) || (str+"/").equals(dest)){
			throw new IOException("���ܰ��ļ��������ļ�����·����");
		}
	}
	//2.�������Ŀ���ļ�������Ŀ���ļ�����·����
	public static void selfPath2(File src,File dest) throws IOException{
		if(dest.getAbsolutePath().contains(src.getAbsolutePath())){
			throw new IOException("�������Ŀ���ļ�������Ŀ���ļ�����·����");
		}
	}
	
	public static void CopyDir(String src,String dest) throws IOException{
		//1.���ܰ��ļ��������ļ�����·����
		selfPath(src,dest);
		File srcFile=new File(src);
		File destFile=new File(dest);
		//2.�������Ŀ���ļ�������Ŀ���ļ�����·����
		selfPath2(srcFile,destFile);
		
		//�ļ�����  Ŀ��·��������·��
		CopyDetails(srcFile,new File(dest,srcFile.getName()));  //Ŀ��·��������·��
	}
	
	public static void CopyDetails(File src,File dest){ //ԭ·����Ŀ��·��ȫ������  src:D:/AAA/BBB dest:E:/AAA/BBB
		if(src.isFile()){
			if(!(dest.getParentFile().exists())){
				dest.getParentFile().mkdirs();  

			}
			CopyUtils.copyFile(src, dest);//�ļ����ݿ���
		}else if(src.isDirectory()){
			dest.mkdirs();
			//����  Դ�ļ��е��������ļ������ļ��е�file������ʽ
			File[] files=src.listFiles();
			//��������
			for(File s:files){
				CopyDetails(s,new File(dest,s.getName())); //�ݹ�
			}
		}	
	}
}
