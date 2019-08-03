package com.javase.day12.work01;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Cmd {
	private File f0;
	
	public File getF0() {
		return f0;
	}
	public void setF0(File f0) {
		this.f0 = f0;
	}
	
	//�ж��Ƿ������˺Ϸ���Ŀ¼
	public boolean isLegal() {
		Scanner sc =new Scanner(System.in);
		String s0 =sc.nextLine();
		
		f0 =new File(s0);
		//���ж�f0�Ƿ����, ������Ҳ����false
		if(!f0.exists()) {
			return false;
		}
		return f0.isDirectory();
	}
	
	public void cmd() {
		if(isLegal()) {
			File[] fi =f0.listFiles();
			int len =fi.length;
			//Ϊ�ļ����ļ��зֱ����ü�����
			int countFile =0;
			int countDir =0;
			//����ת�������
			Date d =new Date();
			DateFormat df =new SimpleDateFormat("yyyy/MM/dd E a hh:mm");
			//�ж��Ƿ��ļ��еĲ���ֵ
			boolean b =true;
			//�ǿ��ļ������
			if(len!=0) {
				for(int i=0; i<len;i++) {
					//�õ��ϴ��޸ĵĺ�������ֵ�� d, ��תΪString
					d.setTime(fi[i].lastModified());
					String s =df.format(d);
					b =fi[i].isDirectory();
					System.out.print(s+"\t");
					if(b) {
						System.out.print("<DIR>");
						countDir++;
					}else {
						countFile++;
					}
					System.out.print("\t");
					System.out.print(fi[i].getName());
					System.out.println();
				}
				
				System.out.println("\t"+countFile+"���ļ�");
				System.out.println("\t"+countDir+"��Ŀ¼");
			}
		}else {
			System.out.println("illegal path!");
		}
	}
}
