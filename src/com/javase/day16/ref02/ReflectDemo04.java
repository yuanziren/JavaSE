package com.javase.day16.ref02;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/*
 * Class中常用方法
 * 		构造器-->创建对象		√
 * 		方法-->调用			√
 * 		字段-->设置|获取值		√
 */
public class ReflectDemo04 {
	public static void main(String[] args) throws Exception {
		//1.操作方法
		method(Person.class);
		//2.操作字段
		field(Person.class);
		//3.操作数组
		getArray();
	}
	
	/*
	 * 通过反射操作数组   反射包下的Array
	 * 
	 * static Object newInstance(Class<?> componentType, int length) 
          创建一个具有指定的组件类型和长度的新数组。 
       static void set(Object array, int index, Object value) 
          将指定数组对象中索引组件的值设置为指定的新值。 
       static Object get(Object array, int index) 
          返回指定数组对象中索引组件的值。 
	 */
	public static void getArray(){
		//创建数组对象
		Object obj=Array.newInstance(int.class, 8);
		//判断是否是一个数组类
		System.out.println(obj.getClass().isArray()); 
		System.out.println(obj);
		//数组设置值
		Array.set(obj, 2, 666);
		//数组获取值
		System.out.println(Array.get(obj, 1));
	}
	
	/*
	 * 通过反射操作字段并 使用字段
	 * Field getDeclaredField(String name) 
          	返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段。 
 	   Field[] getDeclaredFields()  
	   Field getField(String name) 
          	返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段。 
 	   Field[] getFields()  
 	   Object get(Object obj)  返回指定对象上此 Field 表示的字段的值。 
	 */
	public static void field(Class cls) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException{
		//获取所有的字段.包括私有
		Field[] fs=cls.getDeclaredFields();
		System.out.println(Arrays.toString(fs));
		//获取公共的字段
		fs=cls.getFields();
		System.out.println(Arrays.toString(fs));
		Person p=new Person();
		p.name="老裴";
		p.age=20;
		System.out.println(fs[0].get(p));
		fs[0].set(p,"老马");
		System.out.println(fs[0].get(p));
		
		//获取指定私有字段
		Field field=cls.getDeclaredField("salary");
		System.out.println(field);
		field.setAccessible(true); //放开权限 
		field.set(p, 100000.0);
		System.out.println(field.get(p));
		
		//Class<?> getType() 
		System.out.println(field.getType());  //double
		System.out.println(field.getName());  //salary
	}
	
	/*
	 * 通过反射获取方法,调用
	 * Method getDeclaredMethod(String name, Class<?>... parameterTypes) 
          	返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。 
 	   Method[] getDeclaredMethods() 
	   Method getMethod(String name, Class<?>... parameterTypes) 
          	返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。 
 	   Method[] getMethods() 
 	   
 	   	执行方法:
 	   		Object invoke(Object obj, Object... args) 对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。 
	 */
	public static void method(Class cls) throws Exception{
		//1.通过反射的方法获取Method对象
		Method method=cls.getDeclaredMethod("test4",D.class);
		System.out.println(method);
		//执行方法
		//对象
		Person p=Person.class.newInstance();
		p.name="因为";
		method.setAccessible(true); //打开权限
		method.invoke(p,new D());
		
		Method[] mes=cls.getMethods();
		//静态的方法的2中执行方式:1)对象  2)null
		mes[0].invoke(p);
		Object o=mes[0].invoke(null);  //invoke返回值是指定的方法的返回值
		System.out.println(o);
	}
}

class Person{
	public String name;
	int age;
	private double salary;
	
	public static int test1(){
		System.out.println("我是test1");
		return -1;
	}
	public void test2(Integer in){
		System.out.println("我是test2");
	}
	private void test3(){
		System.out.println("我是test3");
	}
	private void test4(D a){
		System.out.println("我是test4"+name);
	}
}
class D{}
