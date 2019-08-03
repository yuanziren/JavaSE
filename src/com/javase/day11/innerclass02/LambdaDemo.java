package com.javase.day11.innerclass02;
/*
 * jdk1.8新特性 Lambda表达式
 * 	目的:简化匿名内部类
 * 语法:
 * 	() -> {}
 * 	():抽象方法的参数列表
 *  ->: Lambda符号,箭头符号
 *  {}:抽象方法的方法体实现
 *  
 *  Lambda使用前提:函数式接口
 *  函数式接口:只有一个抽象方法的接口
 *  检测函数式接口:@FunctionalInterface
 */
public class LambdaDemo {
	public static void main(String[] args) {
		A a=new A(){
			@Override
			public void test() {
				System.out.println("匿名内部类....");
			}
		};
		a.test();
		
		
		//1.写法
		A lambda=()-> {System.out.println("匿名内部类....");};
		lambda.test();
		
		//2.当抽象方法有参数,参数数据类型可以省略
		//B b=c->{System.out.println("hehehhehee"+c);};
		
		//3.当抽象方法有参数只有一个的时候,前后的()可以省略,多个参数不可以
		//B b= (c,d) ->{System.out.println("hehehhehee"+c);};
		
		//4.当方法有返回值,并且只有一条return语句的时候,return和前后{}都可以省略
		/*B b= (c,d) -> "哈哈";
		System.out.println(b.test1(3, 5));*/
		
		//5.当方法体语句只有一句的时候,前后的{}可以省略
		B b= (c,d) ->System.out.println("11111111111");
		System.out.println("22222");
	}
}

@FunctionalInterface
interface A{
	void test();
//	void test1();
}

interface B{
	void test1(int a,int b);
}