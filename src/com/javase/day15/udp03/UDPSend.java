package com.javase.day15.udp03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/*
 * 协议:合同
 * 	udp: 写信  非面向连接  不安全|不可靠   协议简单,开销小,效率高   只管发送    大小有限制 一般不超过60k
 * 
 * 	tcp: 打电话 面向连接  安全性较高  效率低  3次握手:1.拨号    2.回应,建立连接   3.发送数据
 * 
 * 	Socket套接字
 * 		传输层为应用层开辟一个小口子 
 * 		不同的协议Socket实现不同
 * 		tcp和udp面向Socket编程
 * 
 *  udp: DatagramSocket  套接字
 *  	 DatagramPacket  数据包
 */
/**
 * 基本流程:发送方
 * 1.构建DatagramSocket对象,指定端口 --发送端
 * 2.准备数据(字节数组)+打包   包裹的地址 :ip+端口号  
 * 3.发送
 * 4.关闭
 */
public class UDPSend{
	public static void main(String[] args) throws Exception {
		System.out.println("---------发送方启动中---------");
		//1.构建DatagramSocket对象,指定端口 --发送端
		DatagramSocket send=new DatagramSocket(9999);
		//2.准备数据+打包   包裹的地址 :ip+端口号  
		String str="哈哈呵呵嘿嘿";
		byte[] arr=str.getBytes();
		//DatagramPacket(byte[] buf, int offset, int length, SocketAddress address) 
		DatagramPacket packet=new DatagramPacket(arr,0,arr.length,new InetSocketAddress("127.0.0.1",9999));
		//3.发送
		send.send(packet);
		//4.关闭
		send.close();
	}
}
