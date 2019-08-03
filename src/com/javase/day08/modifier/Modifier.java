package com.javase.day08.modifier;
/*
 * 权限修饰符 : 访问对象中内容的权限范围大小
 * 					本类中			同包类				不同包子类(继承)		所有类
 * 	 private         √
 *   default		 √   			 √
 *   protected       √				 √	`					√
 *   public          √				 √	`					√				 √
 *  
 *  1.权限修饰符是成员修饰符,只能用来修饰成员,不能修饰局部
 *  2.default修饰成员的时候只能隐式存在,因为是默认的,不能显示存在
 *  3.只有public,default(隐式存在)能够修饰类
 *  4.被public修饰的类在一个java文件中只能有一个,并且要求与文件名相同
 *  5.被private修饰的内容不能被继承
 *  6.构造器不能被继承
 *  7.静态的内容可以被继承,只要权限够
 *  
 *  子类继承父类,有能力使用父类中的成员
 */
public class Modifier {
	public static void main(String[] args) {
		Fu fu=new Fu();
		System.out.println("--->"+fu.d+"--->"+fu.pro+"--->"+fu.pub);
	}
}


