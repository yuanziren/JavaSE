package com.javase.demo02;
/**  
	测试java中的位运算符
		先把数据转为二进制参与运算,然后得到结果再转为十进制
		&  同一位置的两个数如果有一个为0就是0.两个都为1才是1
		|  同一位置的两个数如果有一个为1就是1.两个都为0才是0
		^  同一位置的两个数如果相等为0.不等是1
		以上三个符号既可以为逻辑运算符(操作数为boolean值)也可以为位运算符(操作数为整数)
	
	位移运算符
		>>  右移   
			左边操作数转为二进制,向右移动右边操作数个位数,超出分水岭的位置数舍弃,保留的转为十进制
			正数补0负数补1
		<<  左移
			左边操作数转为二进制,向左移动右边操作数个位数,空余补0,在转为十进制
		规律:
			右移  左边的数/2的右边的数次方   8>>3   8/2^3   9>>2
			左移  左边的数*2的右边的数次方   8<<3   8*2^3
			
		十进制的负数转二进制: 对这个数的整数取二进制,然后去反+1 
		负数的二进制如何转十进制: 去反+1,得到的十进制数字前面填负号
*/
public class Practice09{ 
	//程序的入口
	public static void main(String[] args){
		System.out.println(2&3);  //2
		System.out.println(2|3);  //3
		System.out.println(2^3);  //1
		
		System.out.println(8>>3);  //1
		System.out.println(8>>2);  //2
		System.out.println(9>>2);  //2
		System.out.println(8<<3);  //64
		System.out.println(8<<2);  //32
		
		
		System.out.println(10<<2);  //40
		System.out.println(-10<<2);  //40
		System.out.println(10>>2);  //2
		System.out.println(-10>>2);  //2
		
	}
}
