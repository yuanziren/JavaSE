package com.javase.day15.ip02;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL:统一资源定位符
 * 	html url  http 互联网的三大基石
 * 	协议:
 * 	域名:
 * 	端口:
 * 	资源:
 *  http://www.baidu.com:80/index.html?uname=zhangsan&age=18#a
 *  
 *  URL 类 URL 代表一个统一资源定位符，它是指向互联网“资源”的指针

 */
public class URLDemo02 {
	public static void main(String[] args) throws Exception {
		/*
		 * 构造方法摘要 
	URL(String spec) 
	          根据 String 表示形式创建 URL 对象。 
		 */
		URL url =new URL("http://www.baidu.com:80/index.html?uname=zhangsan&age=18#a");
		
		System.out.println("协议:"+url.getProtocol());
		System.out.println("域名:"+url.getHost());
		System.out.println("端口:"+url.getPort());
		System.out.println("资源:"+url.getFile());
		System.out.println("路径"+url.getPath());
		
		System.out.println("参数:"+url.getQuery());  //uname=zhangsan&age=18
		System.out.println("锚点:"+url.getRef());  //a
		
	}
}
