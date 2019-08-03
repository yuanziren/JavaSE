package com.javase.day11.file08;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/*
 * File   �ļ���Ŀ¼·�����ĳ����ʾ��ʽ��
 * 	�����Ƿ�����ʵ����,�����Դ���File����
 * 	������
 * 	����
 * 
 * ��ҵ:
 * 	ģ��cmd�е�dir����
 * 	2018/10/14 ����  ���� 08:19    <DIR>          Links
	2018/09/04 �ܶ�  ���� 11:57    <DIR>          Music
	2018/10/25 ����  ���� 09:45    <DIR>          Oracle
	2018/05/28 ��һ  ���� 02:43    <DIR>          Pictures
	2019/01/27 ����  ���� 10:59               600 PUTTY.RND
	2018/05/28 ��һ  ���� 02:43    <DIR>          Saved Games
	2018/05/28 ��һ  ���� 02:43    <DIR>          Searches
	2018/07/11 ����  ���� 03:36    <DIR>          Videos
	2018/11/08 ����  ���� 10:03    <DIR>          workspace
               1 ���ļ�            
              23 ��Ŀ¼ 
 */
public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		//File(String pathname)  ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
		File file=new File("D:/test.txt");
		System.out.println(file.toString());  //D:\test.txt
		//File(String parent, String child)    ���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
		File file2=new File("D:","test.txt");
		System.out.println(file2);
		//File(File parent, String child)       ���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
		File parent=new File("D:/");
		File file3=new File(parent,"test.txt");
		System.out.println(file3);
		
		// boolean canWrite()  ����Ӧ�ó����Ƿ�����޸Ĵ˳���·������ʾ���ļ��� 
		System.out.println("canWrite():"+file.canWrite()); //�ļ�Ҫ����,����ֻ��״̬
		
		//boolean createNewFile()   ���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ��� 
		//boolean exists()  ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ� 
		if(file.exists()){
			System.out.println(file.getName());
		}else{
			System.out.println("createNewFile():"+file.createNewFile());
		}
		//boolean delete() ɾ���˳���·������ʾ���ļ���Ŀ¼�� 
		System.out.println("delete():"+file.delete());
		/*
		 *  File getAbsoluteFile()   
		          ���ش˳���·�����ľ���·������ʽ�� 
		    String getAbsolutePath() 
		          ���ش˳���·�����ľ���·�����ַ����� 
		 */
		System.out.println("getAbsoluteFile():"+file.getAbsoluteFile().getName());  //D:\test.txt
		System.out.println("getAbsolutePath():"+file.getAbsolutePath().length());  //D:\test.txt
		/*
		 *  String getName() 
		          �����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ� 
		 	String getParent() 
		          ���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null�� 
		 	File getParentFile() 
		          ���ش˳���·������Ŀ¼�ĳ���·�����������·����û��ָ����Ŀ¼���򷵻� null�� 
		 	String getPath() 
		          ���˳���·����ת��Ϊһ��·�����ַ����� 
		 */
		System.out.println("getParent():"+file.getParent());
		System.out.println("getParentFile():"+file.getParentFile());
		System.out.println("getPath():"+file.getPath());
		
		/*
		 *  boolean isAbsolute() 
			          ���Դ˳���·�����Ƿ�Ϊ����·������ 
			 boolean isDirectory() 
			          ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼�� 
			 boolean isFile() 
			          ���Դ˳���·������ʾ���ļ��Ƿ���һ����׼�ļ��� 
		 */
		File child=new File("D:/haha.txt");
		File file4=new File("D:/AAA");
		System.out.println("isAbsolute():"+child.isAbsolute());
		System.out.println("isDirectory():"+file4.isDirectory());  //Ҫ�Ѵ��ڵ�Ŀ¼
		System.out.println("isFile():"+child.isFile());  //Ҫ�Ѵ��ڵ��ļ�
		System.out.println("length():"+child.length());  //���ݵĳ���
		
		/*
		 * 	String[] list() 
          ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�� 
		 *  File[] listFiles() 
          ����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ��� 
		 */
		String[] arrString=file4.list();
		File[] arrFile=file4.listFiles();
		System.out.println(Arrays.toString(arrString));
		System.out.println(Arrays.toString(arrFile));
		
		/*
		 *  boolean mkdir() 
		          �����˳���·����ָ����Ŀ¼��   ���㲻����
		 boolean mkdirs() 
		          �����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��   ��㲻����
		 */
		File file5=new File("D:/CCC/HEHE");
		if(file5.exists()){
			System.out.println("�Ѵ���");
		}else{
			System.out.println(file5.mkdirs());;
		}
		
		// boolean renameTo(File dest)  ���������˳���·������ʾ���ļ��� 
		
		//String toString()    ���ش˳���·������·�����ַ����� 
	}
}
