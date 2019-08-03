package com.javase.demo02;
/**  
	测试数值型的表示形式   
		整数
			1001-->10进制  满几进一
			二进制 由0,1组成    以0b/0B开头就是二进制    0b1001
			八进制 由0~7组成    以0开头是八进制  01001
			十进制 默认进制
			十六进制 由0~9和a~f组成(大小写都可以) 以0x/0X开头就是表示十六进制
			
			从其他进制如何转为十进制: 从后往前算,每一个位置的数值* 进制数^0(从0开始,往后的每一个位置+1),最终得到的和就是十进制数值
			从十进制转为其他进制:用这个数一直除以要转为的进制数,取余数,从下往上看
		
		浮点数
			0.13432  ->0可以省略   .123
			科学计数法: e->10   1.23e3  -->1.23*10^3      1.23e-2  -->1.23/10^2
			
		----练习:1314 >转为其他进制
*/
public class Radix01{ 
	//程序的入口
	public static void main(String[] args){
		System.out.println(1001);
		System.out.println(0b1001); //1*2^0 + 0*2^1 +0*2^2 +1*2^3 = 9
		System.out.println(01001); //1*8^0 + 1*8^3 = 1+ 512 = 513
		System.out.println(0X1a); //10*16^0 + 1*16^1 = 26
		System.out.println(0b1100);
		System.out.println(016);
		System.out.println(.555);
		 
		System.out.println(1.23e-2);   //0.0123
		System.out.println(1.23e3);   //1230.0
	}
}
