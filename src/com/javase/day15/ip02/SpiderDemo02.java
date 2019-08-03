package com.javase.day15.ip02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 点评网+假装模拟浏览器
 */
public class SpiderDemo02 {
	public static void main(String[] args) throws IOException {
		URL url=new URL("https://www.dianping.com");
		
		HttpURLConnection is=(HttpURLConnection)url.openConnection();
		
		//设置请求方式
		is.setRequestMethod("GET");
		is.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36");
		
		InputStream in=is.getInputStream();
		BufferedReader read=new BufferedReader(new InputStreamReader(in,"utf-8"));
		BufferedWriter write=new BufferedWriter(new FileWriter("src/index.html"));
		//操作
		String str=null;
		while((str=read.readLine())!=null){
			System.out.println(str);
		}
		write.flush();
		//关闭
		write.close();
		read.close();
	}
}
