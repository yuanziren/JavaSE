package com.javase.day11.file08;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/*
 * File   文件和目录路径名的抽象表示形式。
 * 	无论是否真真实存在,都可以创建File对象
 * 	构造器
 * 	方法
 * 
 * 作业:
 * 	模拟cmd中的dir命令
 * 	2018/10/14 周日  下午 08:19    <DIR>          Links
	2018/09/04 周二  上午 11:57    <DIR>          Music
	2018/10/25 周四  上午 09:45    <DIR>          Oracle
	2018/05/28 周一  下午 02:43    <DIR>          Pictures
	2019/01/27 周日  下午 10:59               600 PUTTY.RND
	2018/05/28 周一  下午 02:43    <DIR>          Saved Games
	2018/05/28 周一  下午 02:43    <DIR>          Searches
	2018/07/11 周三  下午 03:36    <DIR>          Videos
	2018/11/08 周四  上午 10:03    <DIR>          workspace
               1 个文件            
              23 个目录 
 */
public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		//File(String pathname)  通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
		File file=new File("D:/test.txt");
		System.out.println(file.toString());  //D:\test.txt
		//File(String parent, String child)    根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
		File file2=new File("D:","test.txt");
		System.out.println(file2);
		//File(File parent, String child)       根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
		File parent=new File("D:/");
		File file3=new File(parent,"test.txt");
		System.out.println(file3);
		
		// boolean canWrite()  测试应用程序是否可以修改此抽象路径名表示的文件。 
		System.out.println("canWrite():"+file.canWrite()); //文件要存在,并非只读状态
		
		//boolean createNewFile()   当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。 
		//boolean exists()  测试此抽象路径名表示的文件或目录是否存在。 
		if(file.exists()){
			System.out.println(file.getName());
		}else{
			System.out.println("createNewFile():"+file.createNewFile());
		}
		//boolean delete() 删除此抽象路径名表示的文件或目录。 
		System.out.println("delete():"+file.delete());
		/*
		 *  File getAbsoluteFile()   
		          返回此抽象路径名的绝对路径名形式。 
		    String getAbsolutePath() 
		          返回此抽象路径名的绝对路径名字符串。 
		 */
		System.out.println("getAbsoluteFile():"+file.getAbsoluteFile().getName());  //D:\test.txt
		System.out.println("getAbsolutePath():"+file.getAbsolutePath().length());  //D:\test.txt
		/*
		 *  String getName() 
		          返回由此抽象路径名表示的文件或目录的名称。 
		 	String getParent() 
		          返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。 
		 	File getParentFile() 
		          返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。 
		 	String getPath() 
		          将此抽象路径名转换为一个路径名字符串。 
		 */
		System.out.println("getParent():"+file.getParent());
		System.out.println("getParentFile():"+file.getParentFile());
		System.out.println("getPath():"+file.getPath());
		
		/*
		 *  boolean isAbsolute() 
			          测试此抽象路径名是否为绝对路径名。 
			 boolean isDirectory() 
			          测试此抽象路径名表示的文件是否是一个目录。 
			 boolean isFile() 
			          测试此抽象路径名表示的文件是否是一个标准文件。 
		 */
		File child=new File("D:/haha.txt");
		File file4=new File("D:/AAA");
		System.out.println("isAbsolute():"+child.isAbsolute());
		System.out.println("isDirectory():"+file4.isDirectory());  //要已存在的目录
		System.out.println("isFile():"+child.isFile());  //要已存在的文件
		System.out.println("length():"+child.length());  //内容的长度
		
		/*
		 * 	String[] list() 
          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。 
		 *  File[] listFiles() 
          返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。 
		 */
		String[] arrString=file4.list();
		File[] arrFile=file4.listFiles();
		System.out.println(Arrays.toString(arrString));
		System.out.println(Arrays.toString(arrFile));
		
		/*
		 *  boolean mkdir() 
		          创建此抽象路径名指定的目录。   单层不存在
		 boolean mkdirs() 
		          创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。   多层不存在
		 */
		File file5=new File("D:/CCC/HEHE");
		if(file5.exists()){
			System.out.println("已存在");
		}else{
			System.out.println(file5.mkdirs());;
		}
		
		// boolean renameTo(File dest)  重新命名此抽象路径名表示的文件。 
		
		//String toString()    返回此抽象路径名的路径名字符串。 
	}
}
