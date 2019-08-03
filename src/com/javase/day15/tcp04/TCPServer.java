package com.javase.day15.tcp04;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP基本流程:
 * 	1.构建ServerSocket对象  ServerSocket(int port)     创建绑定到特定端口的服务器套接字。
 * 	2.接受客户端连接   Socket    Socket accept()   侦听并接受到此套接字的连接。 
 * 	3.IO操作  InputStream getInputStream()   返回此套接字的输入流。 
 * 	4.关闭
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		System.out.println("--------服务端启动中------------");
		//1.ServerSocket对象  ServerSocket(int port)
		ServerSocket server=new ServerSocket(8888);
		//2.接收  Socket accept()   侦听并接受到此套接字的连接。 
		Socket socket=server.accept();
		System.out.println("一个客户端连接成功.....");
		//3.获取输入流 
		DataInputStream is=new DataInputStream(socket.getInputStream());
		String str=is.readUTF();
		System.out.println(str);
		//关闭
		is.close();
		socket.close();
		server.close();
		
	}
}
