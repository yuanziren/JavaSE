package com.javase.demo02;/**  
	测试java中的逻辑运算符
		逻辑运算符左右两边的操作数必须是值为boolean的表达式
		& 与   如果左右两边有一个false,结果就为false
		| 或   只要有一个为true就是true,两个都为false才是false
		! 非   取反  !true  !false
		^ 异或  两个操作数相同为false不同为true
		
		逻辑上与&,|一样,有短路的作用:如果前面的结果就能够决定最终表达式的结果,后面的将不再执行
		&& 如果左右两边有一个false,结果就为false
		|| 只要有一个为true就是true,两个都为false才是false
		推荐使用短路与,与短路或
		
*/
public class Operator06{ 
	//程序的入口
	public static void main(String[] args){
		System.out.println("-------&---------");
		System.out.println(true & true);  //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		System.out.println("-------|---------");
		System.out.println(true | true);  //true
		System.out.println(true | false); //true
		System.out.println(false | true); //true
		System.out.println(false | false); //false
		
		System.out.println("-------!---------");
		System.out.println(!true);  //false
		System.out.println(!false); //true
		
		System.out.println("-------^---------");
		System.out.println(true ^ true);  //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(false ^ false); //false
		
	}
}
