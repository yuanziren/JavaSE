package com.javase.day15.homework;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		System.out.println("------------------客户端启动中----------------");
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输出用户名:");
		String name=read.readLine();
		System.out.println("请输出密码:");
		String pwd=read.readLine();
		read.close();
		
		//1.构建Socket对象  指定服务端的IP和端口
		Socket socket=new Socket("localhost",9999);
		//2.获取输出流
		DataOutputStream os=new DataOutputStream(socket.getOutputStream());
		os.writeUTF("name="+name+"&pwd="+pwd);
		//获取输入流
		DataInputStream is=new DataInputStream(socket.getInputStream());
		String str=is.readUTF();
		System.out.println(str);
		
		//刷出
		os.flush();
		//关闭
		os.close();
		socket.close();
	}
}