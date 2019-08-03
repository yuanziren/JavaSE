package com.javase.day16.ref02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/*
 * Class中常用方法
 */
public class ReflectDemo03 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class cls=Demo.class;
		//父类的Class对象
		Class fuClass=cls.getSuperclass();
		System.out.println(fuClass);
		//父接口的Class对象
		Class[] arr=cls.getInterfaces();
		for(Class c:arr){
			System.out.println(c);
		}
		
		//int getModifiers()       返回此类或接口以整数编码的 Java 语言修饰符。 
		int i=Inner.class.getModifiers();
		System.out.println(Modifier.toString(i));
		
		//String getName()  
		System.out.println(cls.getName());  //com.shsxt.ref02.Demo
		
		
		//Package getPackage()获取此类的包 
		System.out.println(cls.getPackage());
		
		//boolean isPrimitive()  
		System.out.println(int.class.isPrimitive());
		
		//创建对象的第一种方式: T newInstance() 创建此 Class 对象所表示的类的一个新实例。 调用这个类的空构造,如果这个类没有空构造,将会报错
		Demo d=(Demo) cls.newInstance();
		System.out.println(d);
		
		getConstructor(cls);
		
	}
	/*
	 *获取一个类的构造器,通过反射
	 *	Constructor<T> getConstructor(Class<?>... parameterTypes) 
          	返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。 
 		Constructor<?>[] getConstructors() 
          	返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法。 
		Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 
          	返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。 
 		Constructor<?>[] getDeclaredConstructors() 
          	返回 Constructor 对象的一个数组，这些对象反映此 Class 对象表示的类声明的所有构造方法。 
          	
         通过反射创建某个类对象:
         		1.类的Class对象  newInstance()  只能使用空构造
         		2.构造器对象.newInstance(参数)  匹配当前构造器的参数(实参)
	 */
	public static  void getConstructor(Class cls) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//获取所有公共的构造器
		Constructor[] cons=cls.getConstructors();
		for(Constructor c:cons){
			System.out.println(c);
		}
		
		//获取指定的构造器
		Constructor con=cls.getDeclaredConstructor(int.class,String.class); //参数的Class对象
		System.out.println("私有的"+con);
		
		//根据构造器创建对象
		// T newInstance(Object... initargs) 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。 
//		Demo d=(Demo) cons[1].newInstance(1101);
//		System.out.println(d);
		
		//私有的 设置权限  setAccessible(true);  true打开权限,false关闭权限
		con.setAccessible(true);
		Demo d=(Demo) con.newInstance(1314,"爱你一生一世");
		con.setAccessible(false);
		System.out.println(d);
	}
	
	
	public static class Inner{}
}

interface A{}
interface B{}
interface C{}

class Fu{}
class Demo extends Fu implements A,B,C {
	public Demo() {
	}
	public Demo(int i) {
		System.out.println(i);
	}
	private Demo(int i,String str) {
	}
}