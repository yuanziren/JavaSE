package com.javase.demo;
/**  
	测试java中的变量
	变量:可变的量--单个值
		程序执行过程当中,其值可能会发生改变的量
		在内存中开辟一块空间存储,存储对应类型的数据
	
	变量的定义:
		数据类型 变量名 = 变量值 ; -----声明的同时赋值
		数据类型 变量名;  ---变量的声明
		变量名 = 变量值 ; ---后赋值
		同时声明多个变量,使用逗号进行分隔
		
		注意: =是唯一一个自右向左运算的符号
		
		int整数  double小数  String字符串  char单个字符'' boolean布尔
		
		关注的点:
			1.数据类型  
			2.变量名(严格遵循标识符命名规则|规范)
			3.变量值
			4.作用域  {}
			5.在同一个作用域中,变量名不能相同

		使用变量的注意事项:
			1.变量必须已经声明
			2.变量已经赋值
			3.在同一时刻一个变量只能指向一个值
	
		变量的分类:
			成员变量|实例变量:类中,方法外
				只声明不赋值有默认值  整数0  小数0.0  字符串null  char' '  boolean false
			局部变量:方法中,语句块中
				使用前必须声明并且赋值
			
*/
public class Variable05{   
	int rrr=3;  //成员变量
	
	
	public static void main(String[] args){
		//一个学生的年龄  18岁
		int age=18;  //把字面常量值18赋值给了一个int类型的变量age
		System.out.println(age);
		
		//先声明后赋值
		String name;
		name="汪志静";
		System.out.println(name);
		
		int x,y,z;
		z=y=x=10;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		//同一作用域内不能发存在同名变量,即使数据类型不同也不行
		//int name=3131;
		
		int h;
		//System.out.println(h);
		
		if(true){
			int a=3;
			System.out.println(a);
		}
	
		
	}
	
	public static void test(){
		int name=333;
		System.out.println(name);// name变量作用域是主方法
	}

}
