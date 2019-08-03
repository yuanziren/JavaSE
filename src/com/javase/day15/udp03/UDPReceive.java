package com.javase.day15.udp03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 基本流程:接收方
 * 1.构建DatagramSocket对象,指定端口  接受方
 * 2.准背字节数组+打包 DatagramPacket
 * 3.接受  --阻塞式接受
 * 4.操作数据
 * 5.关闭
 * 
 * 作业:做文件上传,上传一个图片
 */
public class UDPReceive {
	public static void main(String[] args) throws Exception {
		System.out.println("---------接收方启动中---------");
		//1.构建DatagramSocket对象,指定端口 --发送端
		DatagramSocket receive=new DatagramSocket(9999);
		//2.准背字节数组+打包 DatagramPacket
		byte[] arr=new byte[1024*60];
		DatagramPacket packet=new DatagramPacket(arr,arr.length);
		//3.接受  --阻塞式接受
		receive.receive(packet);
		//4.操作数据
		System.out.println(new String(packet.getData()));
		System.out.println(packet.getLength());
		//5.关闭
		receive.close();
		
	}
}
