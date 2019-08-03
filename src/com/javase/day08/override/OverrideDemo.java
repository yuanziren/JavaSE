package com.javase.day08.override;
/*
 * 重载还是重写都是指方法的
 * 重载: 
 * 		同一个类
 * 		多个方法方法名相同
 * 		方法签名不同
 * 重写  
 * 		不同的类
 * 		继承关系
 * 		方法签名相同
 * 
 * 检查是否为重写方法:
 * 				1.左边的向上的三角形
 * 				2.方法的上面添加@Override
 * 
 * 子类中如果存在重写方法,会直接调用子类中重写方法,会对父类中的同名方法进行屏蔽
 * 
 * 子父类中重写方法满足条件:
 * 	 == : 方法签名必须相同
 *   <= : 返回值类型      基本数据类型必须相同,引用数据类型  子类重写方法的返回值类型<=父类中同名方法的返回值类型
 *   >= : 修饰符  子类中重写方法的修饰符>=父类方法的权限修饰符
 *   
 *  注意:
 *  	1.被private修饰的方法不能被重写
 *  	2.被final修饰的方法不能被重写
 *  	3.被static修饰的方法不能被重写
 *  		子类中有与父类中static方法同名的方法,子类中的这个方法也要被static修饰
 * 
 * 
 *  final最终的
 *  	1.被final修饰的类不能被继承|太监类
 *  	2.被final修饰的方法不能被重写
 *  	3.被final修饰的变量不能被修改
 */
public class OverrideDemo {
	public static void main(String[] args) {
		Apple apple=new Apple();
		apple.addWater();
		Apple.addWater();
		
		Fruit f=new Fruit();
		f.addWater();
	}
}

class Fruit{
	
	public static int addWater(){
		System.out.println("我是水果,我能补水...");
		return -1;
	}
}

class Apple extends Fruit{
	//@Override
	public static int addWater(){
		System.out.println("我是水果,我能补水...还能补充维生素...");
		return -1;
	}
}