package com.javase.day16.tcp01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * tcp:双向登录--服务端
 * 	1.创建服务端
 * 	2.阻塞式接受  ---socket
 * 	3.IO操作 接受数据  进行处理
 * 	4.返回给用户信息
 * 	5.关闭
 */
public class TCPTwoWayServer {
	public static void main(String[] args) throws IOException {
		System.out.println("--------服务端启动中------------");
		//1.创建服务端
		ServerSocket server=new ServerSocket(7788);
		//2.接受
		Socket socket=server.accept();
		System.out.println("一个客户端连接成功.....");
		//3.输入流
		DataInputStream data=new DataInputStream(socket.getInputStream());
		String str=data.readUTF();  //"uname=zhangsan&upwd=123"
		//处理字符串
		String uname=null;
		String upwd=null;
		String[] arr=str.split("&");
		for(String s:arr){
			String[] ss=s.split("=");
			if(ss[0].equals("uname")){
				uname=ss[1];
			}else if(ss[0].equals("upwd")){
				upwd=ss[1];
			}
		}
		//输出流
		DataOutputStream os=new DataOutputStream(socket.getOutputStream());
		//判断是否登录成功
		if(uname.equals("laopei") && upwd.equals("123")){
			System.out.println(uname+","+upwd+"登录成功");
			os.writeUTF("登录成功");
		}else{
			System.out.println(uname+","+upwd+"登录失败");
			os.writeUTF("用户名或密码错误!!!");
		}
		os.flush();
		os.close();
		data.close();
		socket.close();
		server.close();
	}
}
