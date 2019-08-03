package com.javase.day10.innerclass04;
/*
 * 局部内部类  
 * 	方法中,方法中的内部类就是局部内部类
 * 	1.不能使用成员修饰符修饰,public,private,protected,static修饰,final可以
 *  2.局部内部类只能在当前定义局部内部类中的方法使用,外部类或其他位置无法使用
 *  3.局部内部类中如果使用所在的方法的参数,参数签名必须添加final修饰,jdk1.8之后默认final
 */
public class Outer04 {
	int a=5;
	static int b=15;
	
	
	public Outer04() {
		class Inner{
			void inner(){
				System.out.println(a);
				System.out.println(b);
				
			}
		}
	}
	
	//成员方法
	void test(final int args){
		final int c=5;
		//局部内部类
		class Inner{
			void inner(){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				
				System.out.println(args);
			}
		}
		
		Inner in=new Inner(); 
		in.inner();
	}
	
	void outter(){
		System.out.println("外部类中的成员方法");
		//Inner in=new Inner();
	}
}
