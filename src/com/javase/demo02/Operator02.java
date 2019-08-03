package com.javase.demo02;
/**  
	测试java中的运算符
		算数运算符
		赋值运算符
		关系运算符
		逻辑运算符
		条件运算符
		位运算符
		
		操作数:运算符左右两边的数就是操作数   a+b
		表达式:运算符连接左右的操作数整体叫做表达式
		语句:遇到;就是语句的结束;
		
		一元运算符:操作数只有一个的运算符叫做一元运算符   ++ --  !
		二元运算符:操作数只有二个的运算符  + - * /
		三元运算符:条件运算符:三目运算符
		
		算数运算符
			+ 
				1)正号 可以省略
				2)加法运算
				3)字符串连接符
					+左右两边是否存在字符串,如果字符串就作为字符串的连接符使用,会拼成一整个字符串
			-
				1)负号 不可省略
				2)减法运算
			*
			/
			% 取余数|取模|模以
				如果第一个操作数<第二个操作数的时候,最后的结果为第一个操作数
				
			++
			--
*/
public class Operator02{ 
	//程序的入口
	public static void main(String[] args){
		int a = -5;
		System.out.println("a = " + a);  //"a=5"
		
		//转为字符串
		System.out.println(a+"");  //"5"
		
		System.out.println("hello"+'a'+1);  //"helloa1"  "helloa"+1
		System.out.println('a'+1+"hello");  //"98hello"  
		
		System.out.println(0%5);  //0 
		System.out.println(1%5);  //1 
		System.out.println(2%5);  //2  
		System.out.println(3%5);  //3
		System.out.println(4%5);  //4
		System.out.println(5%5);  //0
		System.out.println(6%5);  //0
		System.out.println(7%5);  //0
		System.out.println(8%5);  //0
		System.out.println(9%5);  //0
		System.out.println(7%32);  //0
		System.out.println(32%7);  //0
		
		
	}
}
