package com.javase.day15.tcp04;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP基本流程:客户端
 * 	1.构建Socket对象  指定服务端的IP和端口  Socket(String host, int port) 
 * 	2.IO操作
 * 	3.关闭
 */
public class Client {
	public static void main(String[] args) throws Exception {
		System.out.println("------------------客户端启动中----------------");
		//1.构建Socket对象  指定服务端的IP和端口
		Socket socket=new Socket("localhost",8888);
		//2.获取输出流
		DataOutputStream os=new DataOutputStream(socket.getOutputStream());
		os.writeUTF("name=张三&pwd=123");
		//刷出
		os.flush();
		//关闭
		os.close();
		socket.close();
	}
}
