package com.javase.day15.ip02;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/*
 * IP:定位网络上的节点
 * 	IPV4 4个字节,32位  IPV6
 * 		192.168.0.0~192.168.255.255 非注册IP 专门为公司内部设置使用的IP
 * 		本机:127.0.0.1
 * 		本机域名:localhost
 * 		IP  和     域名   ==> 域名解析:DNS服务器
 *  
 *  InetAddress 此类表示互联网协议 (IP) 地址。 
 *  
 * 端口:区分软件
 * 	0~65535  2个字节
 * 	8000以下的端口号不建议你使用,预留端口号
 * 		常见的端口号:
 * 			80:http
 * 			8080:tomcat
 * 			1521:Oracle
 * 			3306:Mysql
 *  同一的协议下端口号不能冲突
 * 	InetSocketAddress 此类实现 IP 套接字地址（IP 地址 + 端口号）。

 * 	
 * URL:统一资源定位符
 * 	协议:
 * 	域名:
 * 	端口:
 * 	资源:
 *  http://www.baidu.com:80/index.html?uname=zhangsan&age=18#a
 * 爬虫:
 * 协议: ***
 * 		udp:
 * 		tcp:
 * 
 */
public class IPDemo01 {
	public static void main(String[] args) throws UnknownHostException {
		/*
		 * static InetAddress getLocalHost()   返回本地主机 
		 */
		InetAddress address=InetAddress.getLocalHost();
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName()); //上海扛把子
		
		/*static InetAddress getByName(String host) 
        在给定主机名的情况下确定主机的 IP 地址。*/ 
		InetAddress add=InetAddress.getByName("www.shsxt.com");
		System.out.println(add.getHostAddress());  //123.56.138.186
		System.out.println(add.getHostName());  //www.shsxt.com
		
		/*
		 * InetSocketAddress(InetAddress addr, int port) 
          	根据 IP 地址和端口号创建套接字地址。
		 */
		InetSocketAddress inet=new InetSocketAddress("127.0.0.1",8888);
		System.out.println(inet.getPort());
		System.out.println(inet.getAddress());
		System.out.println(inet.getHostName());
	}
}
