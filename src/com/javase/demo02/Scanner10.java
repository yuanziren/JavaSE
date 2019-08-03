package com.javase.demo02;
/**  
	测试java中的Scanner类
	基本数据类型使用:
		int a=5;
	引用数据类型使用:
		1.创建一个类型的引用
			数据类型 变量名 = new 数据类型();   ---该类型的引用|变量
			Scanner  sc = new Scanner(); ---Scanner类型的变量
		2.使用功能
			引用.功能名字();
			
	Scanner : 接受键盘输入
		1.导包
			指明Scanner的位置  java--util--Scanner
			import java.util.Scanner;
			位置:类的上面声明
		2.创建Scanner类型的变量
		3.引用.功能名字();
			引用.nextInt() 接收用户输入的整数
			引用.nextByte() 接收用户输入的整数
			引用.nextShort() 接收用户输入的整数
			引用.nextLong() 接收用户输入的整数
			引用.nextFloat() 接收用户输入的小数
			引用.nextDouble() 接收用户输入的小数
			引用.next() 接收用户输入的字符串
				有效字符开始接受,遇到空格,tab,enter就不接收了,但是遇到enter停止功能
			引用.nextLine() 接受用户输入的一整行数据
				从用户输入的内容开始,知道接受enter结束
			
		4.引用.close();
			凡属于IO流的内容最好用完关闭释放资源
			要在真正使用完毕以后再关闭资源,一旦关闭无法重新使用,就算是重新创建引用不行
*/
import java.util.Scanner;
public class Scanner10{ 
	//程序的入口
	public static void main(String[] args){
		//1.导包
		//2.创建类型的引用
		Scanner sc=new Scanner(System.in); //系统输入流
		//3.使用功能
		/*
		int i=sc.nextInt();
		i=sc.nextByte();
		System.out.println(i);
		
		double d=sc.nextDouble();
		System.out.println("d="+d);
		*/
		String s=sc.next();
		System.out.println("用户名为="+s);
		
		//处理遗留enter问题
		String str=sc.nextLine();
		System.out.println(str.trim());  //去除前后空格
		
		//关闭
		sc.close();
		
		Scanner sc1=new Scanner(System.in);
		String ss=sc1.nextLine();
		System.out.println("nextLine="+ss);
		System.out.println(ss.length());
		
		//练习: 接受用户输入的用户名和密码与官方账号比对,用户名:SHSXT 密码:laopei123 如果输入相同:输出登录成功,否则登录失败
	}
}
