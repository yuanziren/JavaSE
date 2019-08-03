package com.javase.demo03;
/**  
	运算符的优先级:
	   ++ == +-  < >    && || ^  条件  =     
		单目算数位关系,逻辑三目后赋值
		{},.优先级最高   
*/
public class Demo01{ 
	//程序的入口
	public static void main(String[] args){
		char c='a';
		System.out.println(c+1);   //98
		char d='a'+1;
		System.out.println(d);
		System.out.println(2<<3);
		
		char i =2+'6';
		System.out.println(i);  

	}
}
