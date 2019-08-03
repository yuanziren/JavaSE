package com.javase.day09.abstract04;
 /*abstract 抽象的
  * 抽象类:说不清楚的类就是抽象类 ,被abstract修饰的类就是抽象类
  * 抽象方法:说不清楚的方法就是抽象方法 ,被abstract修饰的方法就是抽象方法
  * 	没有方法体
  * 	必须存在于抽象类中
  * 
  * JavaEE开发工程师  功能: 工作  开发      BS开发
  * Android开发工程师  功能: 工作  开发    CS开发
  * 开发部  Develop  开发	
  * 
  * 特点:
  * 	1.抽象类不能被实例化
  * 	2.抽象方法要存在于抽象类中
  * 	3.抽象类中可以存在抽象方法,可以存在具体方法
  * 	4.如何使用抽象了中的内容,需要具体子类继承,继承抽象类需要重写抽象方法
  * 		具体子类:必须重写所有抽象方法+按需添加新增方法
  * 		抽象子类:按需重写抽象方法+按需添加新增方法
  * 	5.抽象方法怎么使用,必须要子类重写
  * 	6.abstract关键字不能和private,final,static,native一起使用
  * 	7.抽闲方法一旦被子类重写过,就不需要在被其子类或者孙子类重写
  */
public abstract class Develop {
	//工作开发
	//不知道定义方法体,说不清楚,写不明白
	//abstract修饰的方法没有方法体
	//有抽象方法的类必须存在抽象类中
	public abstract void work();
	
	public void test(){
		System.out.println("我是抽象类中的具体方法");
	}
}
