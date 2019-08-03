package com.javase.day16.tcp01;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * tcp:双向登录--客户端
 * 	1.获取登录数据--键盘输入
 * 	2.创建客户端
 * 	3.IO  输出流 写出数据
 * 	4.刷出,关闭输出流
 * 	5.IO 输入流 接受数据
 * 	6.关闭
 */
public class TCPMulTwoWayClient {
	public static void main(String[] args) throws IOException {
		System.out.println("------------------客户端启动中----------------");
	
		
		//2.创建客户端
		Socket client=new Socket("localhost",7788);
		
		new Send(client).send();
		new Receive(client).receive();
		
		//关闭
		client.close();
	}
	
	//接受
	static class Receive{
		Socket client;
		DataInputStream is;
		public Receive(Socket client) {
			this.client=client;
			try {
				is=new DataInputStream(client.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void receive(){
			//4.输入
			String str;
			try {
				str = is.readUTF();
				System.out.println(str);
			} catch (IOException e) {
				e.printStackTrace();
			}  
			
		}
	}
	
	//send
	static class Send{
		private Socket client;
		private DataOutputStream os;
		private BufferedReader read;
//		private String msg;
		public Send(Socket client) {
			read=new BufferedReader(new InputStreamReader(System.in));
//			this.msg=init();
			this.client=client;
			try {
				os=new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//init 接受用户输入的内容
		public String init(){
			try {
				System.out.println("请输入姓名:");
				String uname=read.readLine();
				System.out.println("请输入密码:");
				String upwd=read.readLine();
				return "uname="+uname+"&"+"upwd="+upwd;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "";
		}
		
		//写出
		public void write(String msg){
			try {
				os.writeUTF(msg);
				os.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void send(){ 
			//3.输出  写出的是用户输入的内容
			write(init());
		}
	}
}
