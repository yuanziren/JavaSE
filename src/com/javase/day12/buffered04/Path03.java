package com.javase.day12.buffered04;

import java.io.File;
import java.io.IOException;

/*
 * 相对路径    1.不以盘符开头      2.不以/开头 ,以user.dir后拼接指定路径
 * 绝对路径: 1.以盘符开头      2./开头
 */
public class Path03 {
	public static void main(String[] args) throws IOException {
		File file=new File("test.txt");
		file.createNewFile();
		System.out.println(file.getAbsolutePath());
		
		System.out.println(System.getProperty("user.dir"));
	}
}
