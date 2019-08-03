package com.javase.day10.work01;
/*
 * instanceof 运算符  前面位置必须是引用,后面位置必须是类型 
 * 编译时,只查看前面的引用和后面的类型是否在一条继承链上,运行才真正进行判断,是否是后面类型的对象或子类的对象
 */

public class Work01 {
	public static void main(String[] args) {
		String str=new String("abc");
		System.out.println(str instanceof String );
		System.out.println(str instanceof Object );
		
		Zi zi =new Zi();
		System.out.println(zi instanceof Fu);
		System.out.println(zi instanceof Zi);
		Fu fu=new Fu();
		System.out.println(fu instanceof Zi); //false
	}
}

class Fu{}
class Zi extends Fu{}
class Brother extends Fu{}
