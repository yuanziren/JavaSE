package com.javase.day16.ref02;

import java.io.IOException;
import java.util.Properties;

/*
 * 反射:会用
 * 	反射是发生在运行期的行为
 * 
 * 	需求:动态获取配置文件中的内容,创建不同的对象,不会频繁的修改源代码
 * 
 * Java反射机制，可以实现以下功能：
	①在运行时判断任意一个对象所属的类；
	②在运行时构造任意一个类的对象；
	③在运行时判断任意一个类所具有的成员变量和方法；
	④在运行时调用任意一个对象的方法；
	⑤生成动态代理。
 */
public class RefletDemo01 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		Speak speak=new QinFen();  //接口多态
		speak.speak();
		
		//通过反射的方式创建对象
		Properties pro=new Properties();
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("name.properties"));
		speak=(Speak) Class.forName(pro.getProperty("className")).newInstance();
		speak.speak();
	}
}

interface Speak{
	void speak();
}

class Jianlin implements Speak{
	@Override
	public void speak() {
		System.out.println("我一无所有,先定义个小目标,挣他个一个亿");
	}
}

class Sicong implements Speak{
	@Override
	public void speak() {
		System.out.println("我不在乎我的朋友有没有钱,反正都没我有钱");
	}
}
class QinFen implements Speak{
	@Override
	public void speak() {
		System.out.println("那我呢???");
	}
}
