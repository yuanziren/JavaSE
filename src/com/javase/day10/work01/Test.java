package com.javase.day10.work01;

import java.util.Scanner;

/*
 * 工厂测试类
 * 	在工厂里创建对象 
 * 	接受用户输入的需求,创建pizza对象
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请选择您要制作的披萨,1培根披萨,2海鲜披萨");
		int num=sc.nextInt();
		Pizza pizza=null;
		System.out.println("请输入价格");
		double price=sc.nextDouble();
		System.out.println("请输入大小");
		int size=sc.nextInt();
		if(num==1){
			System.out.println("培根制作中.....");
		}else if(num==2){
			System.out.println("请输入配料信息");
			sc.nextLine();  //处理遗留enter问题
			String info=sc.nextLine();
			pizza=new SeaPizza("海鲜披萨",price,size,info);
		}else{
			System.out.println("本店还没上架.欢迎下次品尝...");
		}
		if(pizza!=null){
			pizza.show();
		}
	}
}
