package com.javase.day15.homework;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		System.out.println("--------服务端启动中------------");
		//1.ServerSocket对象  ServerSocket(int port)
		ServerSocket server=new ServerSocket(9999);
		//2.接收  Socket accept()   侦听并接受到此套接字的连接。 
		Socket socket=server.accept();
		System.out.println("一个客户端连接成功.....");
		//3.获取输入流 
		DataInputStream is=new DataInputStream(socket.getInputStream());
		String str=is.readUTF();
		System.out.println(str);
		String name = null;
		String pwd = null;
		String[] arr=str.split("&");
		for(String s:arr){
			String[] result=s.split("=");
			if(result[0].equals("name")){
				System.out.println("用户名="+result[1]);
				name = result[1];
			}else if(result[0].equals("pwd")){
				System.out.println("密码="+result[1]);
				pwd = result[1];
			}
		}
		String getResult = null;
		//获取输出流
		DataOutputStream os=new DataOutputStream(socket.getOutputStream());
		if (name.equals("张三")&&pwd.equals("123456")) {
			System.out.println("name=" + name + ",pwd=" + pwd + "正确");
			getResult = "账户和密码正确";
			os.writeUTF(getResult);;
		}else {
			System.out.println("name=" + name + ",pwd=" + pwd + "不正确");
			getResult = "账户或密码不正确";
			os.writeUTF(getResult);;
		}
		
		//关闭
		is.close();
		socket.close();
		server.close();
	}
}