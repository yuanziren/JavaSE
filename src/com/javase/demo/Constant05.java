package com.javase.demo;
/**  
	测试java中的常量
		在程序执行过程当中,其值不会发生改变的量
		
	自定义常量:被final关键字修饰的变量为自定义常量
	字面值常量:写在字面上的值就是字面值常量  
		整数常量   101   12  -1
		小数常量   1.1   -3.14
		字符串常量 "haha"  "123"  " "
		字符常量  'a'  '1' ' '
		布尔常量  false  true
		
			
*/
public class Constant05{   
	
	public static void main(String[] args){
		final String name="上海尚学堂";
		System.out.println(name);
		//name="哈哈";
		System.out.println(name);
	}
	

}
