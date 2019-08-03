package com.javase.day16.tcp01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * tcp:双向登录--服务端接受多个客户端连接
 * 	1.创建服务端
 * 	2.阻塞式接受  ---socket
 * 	3.IO操作 接受数据  进行处理
 * 	4.返回给用户信息
 * 	5.关闭
 */
public class TCPMulTwoWayServer {
	public static void main(String[] args) throws IOException {
		System.out.println("--------服务端启动中------------");
		//1.创建服务端
		ServerSocket server=new ServerSocket(7788);
		//2.接受
		boolean isRunning=true;
		while(isRunning){
			Socket socket=server.accept();
			System.out.println("一个客户端连接成功.....");
			new Thread(new Channel(socket)).start();
		}
		server.close();
	}
	
	//一个客户端 每个客户端要做的事情封装成为一个内部类,这个类有开启多线程的能力
	static class Channel implements Runnable{
		private Socket socket;
		private DataInputStream is;
		private DataOutputStream os;
		
		public Channel(Socket socket) {
			this.socket=socket;
			try {
				is=new DataInputStream(socket.getInputStream());
				 os=new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//读取数据
		public String read(){
			String str="";
			try {
				str=is.readUTF();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		
		//写出数据
		public void send(String msg){
			try {
				os.writeUTF(msg);
				os.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//关闭
		public void close(){
			try {
				if(os!=null){
					os.close();
				}
				if(is!=null){
					is.close();
				}
				if(socket!=null){
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			//处理字符串
			String uname="";
			String upwd="";
			String[] arr=read().split("&");  //读一次就下一次读不到内容
			for(String s:arr){
				String[] ss=s.split("=");
				if(ss[0].equals("uname")){
					uname=ss[1];
				}else if(ss[0].equals("upwd")){
					upwd=ss[1];
				}
			}
			System.out.println(uname);
			System.out.println(upwd);
			//判断是否登录成功
			if(uname.equals("laopei") && upwd.equals("123")){
				System.out.println(uname+","+upwd+"登录成功");
				send("登录成功");
			}else{
				System.out.println(uname+","+upwd+"登录失败");
				send("用户名或密码错误!!!");
			}
			close();
		}
		
	}
}
