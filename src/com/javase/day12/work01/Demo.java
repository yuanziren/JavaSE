package com.javase.day12.work01;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		System.out.println(new File("D:/haha.txt").lastModified());
		
		Cmd cmd=new Cmd();
		//cmd.cmd();
		
		//renameTo(File) 重命名(移动文件可以跨盘符移动文件,移动文件夹同盘符下可以,跨盘符不行) 
//		File file=new File("D:/hehe.txt");
//		File dest=new File("E:/hehe.txt");
		File file=new File("D:/AAA");
		File dest=new File("D:/BBB");
		System.out.println(file.renameTo(dest));
		
	}
}
