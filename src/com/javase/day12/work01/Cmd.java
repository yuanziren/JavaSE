package com.javase.day12.work01;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Cmd {
	private File f0;
	
	public File getF0() {
		return f0;
	}
	public void setF0(File f0) {
		this.f0 = f0;
	}
	
	//判断是否输入了合法的目录
	public boolean isLegal() {
		Scanner sc =new Scanner(System.in);
		String s0 =sc.nextLine();
		
		f0 =new File(s0);
		//再判断f0是否存在, 不存在也返回false
		if(!f0.exists()) {
			return false;
		}
		return f0.isDirectory();
	}
	
	public void cmd() {
		if(isLegal()) {
			File[] fi =f0.listFiles();
			int len =fi.length;
			//为文件和文件夹分别设置计数器
			int countFile =0;
			int countDir =0;
			//日期转换相关类
			Date d =new Date();
			DateFormat df =new SimpleDateFormat("yyyy/MM/dd E a hh:mm");
			//判断是否文件夹的布尔值
			boolean b =true;
			//非空文件夹情况
			if(len!=0) {
				for(int i=0; i<len;i++) {
					//得到上次修改的毫秒数赋值给 d, 再转为String
					d.setTime(fi[i].lastModified());
					String s =df.format(d);
					b =fi[i].isDirectory();
					System.out.print(s+"\t");
					if(b) {
						System.out.print("<DIR>");
						countDir++;
					}else {
						countFile++;
					}
					System.out.print("\t");
					System.out.print(fi[i].getName());
					System.out.println();
				}
				
				System.out.println("\t"+countFile+"个文件");
				System.out.println("\t"+countDir+"个目录");
			}
		}else {
			System.out.println("illegal path!");
		}
	}
}
