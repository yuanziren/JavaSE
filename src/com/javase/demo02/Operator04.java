package com.javase.demo02;
/**  
	测试java中的赋值运算符
		基本赋值运算符
			=
			双目运算符
			自右向左运算的符号
			优先级最低
		
		扩展赋值运算符(基本赋值运算符+算数运算符)
			+= -= *= /= %=  a+=1;==>a=a+1
 			优点:
				提高执行效率
				自动做强制类型转换
			缺点: 不直观
			推荐使用扩展赋值运算符,会成倍提高效率
		
*/
public class Operator04{ 
	//程序的入口
	public static void main(String[] args){
		int result=0; //总和
		int zhangScore=100;
		int wangScore=98;
		result+=zhangScore;//result=result+zhangScore;
		result+=wangScore;//result=result+wangScore;
		
		//自动做强制类型准换
		short s=1;
		//s=s+1;
		s=(short)(s+1);
		s+=1; //s=s+1
		System.out.println(s);
	}
}
