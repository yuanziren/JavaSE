package com.javase.day12.byteio02;

import java.io.File;
import java.io.IOException;

/*
 * 文件夹拷贝
 * 	1.不能把文件拷贝到文件所在路径下
 * 	2.不允许把目标文件拷贝到目标文件的子路径下
 */
public class CopyDir07 {
	public static void main(String[] args) throws IOException {
		CopyDir("D:/AAA","E:/");
	}
	
	//1.不能把文件拷贝到文件所在路径下
	public static void selfPath(String src,String dest) throws IOException{
		int index=src.lastIndexOf("/");
		String str=src.substring(0, index);
		if(str.equals(dest) || (str+"/").equals(dest)){
			throw new IOException("不能把文件拷贝到文件所在路径下");
		}
	}
	//2.不允许把目标文件拷贝到目标文件的子路径下
	public static void selfPath2(File src,File dest) throws IOException{
		if(dest.getAbsolutePath().contains(src.getAbsolutePath())){
			throw new IOException("不允许把目标文件拷贝到目标文件的子路径下");
		}
	}
	
	public static void CopyDir(String src,String dest) throws IOException{
		//1.不能把文件拷贝到文件所在路径下
		selfPath(src,dest);
		File srcFile=new File(src);
		File destFile=new File(dest);
		//2.不允许把目标文件拷贝到目标文件的子路径下
		selfPath2(srcFile,destFile);
		
		//文件拷贝  目标路径是完整路径
		CopyDetails(srcFile,new File(dest,srcFile.getName()));  //目标路径的完整路径
	}
	
	public static void CopyDetails(File src,File dest){ //原路径和目标路径全部完整  src:D:/AAA/BBB dest:E:/AAA/BBB
		if(src.isFile()){
			if(!(dest.getParentFile().exists())){
				dest.getParentFile().mkdirs();  

			}
			CopyUtils.copyFile(src, dest);//文件内容拷贝
		}else if(src.isDirectory()){
			dest.mkdirs();
			//遍历  源文件中的所有子文件和子文件夹的file对象形式
			File[] files=src.listFiles();
			//遍历数组
			for(File s:files){
				CopyDetails(s,new File(dest,s.getName())); //递归
			}
		}	
	}
}
