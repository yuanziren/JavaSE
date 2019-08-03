package com.javase.day15.homework;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerReceive {

	public static void main(String[] args) throws IOException {
		System.out.println("------服务端成功启动------");
		ServerSocket server = new ServerSocket(8889);
		Socket socket = server.accept();
		System.out.println("------客户端成功启动------");
		DataInputStream is = new DataInputStream(socket.getInputStream());
		DataOutputStream os = new DataOutputStream(new FileOutputStream("E:/abc.png"));
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		os.close();
		is.close();
		socket.close();
		server.close();
	}
}

