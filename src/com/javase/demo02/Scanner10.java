package com.javase.demo02;
/**  
	����java�е�Scanner��
	������������ʹ��:
		int a=5;
	������������ʹ��:
		1.����һ�����͵�����
			�������� ������ = new ��������();   ---�����͵�����|����
			Scanner  sc = new Scanner(); ---Scanner���͵ı���
		2.ʹ�ù���
			����.��������();
			
	Scanner : ���ܼ�������
		1.����
			ָ��Scanner��λ��  java--util--Scanner
			import java.util.Scanner;
			λ��:�����������
		2.����Scanner���͵ı���
		3.����.��������();
			����.nextInt() �����û����������
			����.nextByte() �����û����������
			����.nextShort() �����û����������
			����.nextLong() �����û����������
			����.nextFloat() �����û������С��
			����.nextDouble() �����û������С��
			����.next() �����û�������ַ���
				��Ч�ַ���ʼ����,�����ո�,tab,enter�Ͳ�������,��������enterֹͣ����
			����.nextLine() �����û������һ��������
				���û���������ݿ�ʼ,֪������enter����
			
		4.����.close();
			������IO���������������ر��ͷ���Դ
			Ҫ������ʹ������Ժ��ٹر���Դ,һ���ر��޷�����ʹ��,���������´������ò���
*/
import java.util.Scanner;
public class Scanner10{ 
	//��������
	public static void main(String[] args){
		//1.����
		//2.�������͵�����
		Scanner sc=new Scanner(System.in); //ϵͳ������
		//3.ʹ�ù���
		/*
		int i=sc.nextInt();
		i=sc.nextByte();
		System.out.println(i);
		
		double d=sc.nextDouble();
		System.out.println("d="+d);
		*/
		String s=sc.next();
		System.out.println("�û���Ϊ="+s);
		
		//��������enter����
		String str=sc.nextLine();
		System.out.println(str.trim());  //ȥ��ǰ��ո�
		
		//�ر�
		sc.close();
		
		Scanner sc1=new Scanner(System.in);
		String ss=sc1.nextLine();
		System.out.println("nextLine="+ss);
		System.out.println(ss.length());
		
		//��ϰ: �����û�������û�����������ٷ��˺űȶ�,�û���:SHSXT ����:laopei123 ���������ͬ:�����¼�ɹ�,�����¼ʧ��
	}
}
