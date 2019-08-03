package com.javase.day15.homework;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPSendClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建socket对象
		Socket socket = new Socket("192.168.4.213",9999);
		DataInputStream in = new DataInputStream(new FileInputStream("D:/测试.jpg"));
		DataOutputStream os = new DataOutputStream(socket.getOutputStream());
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = in.read(b)) != -1) {
			os.write(b, 0, len);
		}
		os.close();
		in.close();
		socket.close();
		
	}
}
