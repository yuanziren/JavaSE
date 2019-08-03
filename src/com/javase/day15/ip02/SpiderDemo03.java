package com.javase.day15.ip02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 爬虫   spider
 * 
 * http://www.taobao.com
 */
public class SpiderDemo03 {
	public static void main(String[] args) throws IOException {
		URL url=new URL("https://www.taobao.com");
		
		//InputStream openStream()  打开到此 URL 的连接并返回一个用于从该连接读入的 InputStream。 
		InputStream is=url.openStream();
		BufferedReader read=new BufferedReader(new InputStreamReader(is,"utf-8"));
		BufferedWriter write=new BufferedWriter(new FileWriter("src/index.html"));
		//操作
		String str=null;
		while((str=read.readLine())!=null){
			System.out.println(str);
			write.write(str);
		}
		write.flush();
		//关闭
		write.close();
		read.close();
	}
}
