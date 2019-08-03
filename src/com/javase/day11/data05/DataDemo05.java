package com.javase.day11.data05;
/*
 * 基本数据类型包装类
 * 	byte		----Byte
 * 	short		----Short
 * 	int			----Integer
 * 	long		----Long
 * 	float		----Float
 * 	double		----Double
 *  char		----Character
 *  		int			Integer
 *  自动装箱:基本数据类型-->包装类型
 *  		Integer			int
 *  自动拆箱:包装类型--->基本数据类型
 */
public class DataDemo05 extends Object{
	public static void main(String[] args) {
		int i1=121;
		Integer in1=121;  //自动装箱    Integer.valueOf(121)
		System.out.println(in1+1); //自动拆箱   .intValue() 122
		int i2=in1;
		System.out.println(i2);  //自动拆箱  121
		
		Double double1=new Double(12.1);
		System.out.println(double1);// 12.1
		
		/*
		 * Integer(int value) 
		          构造一个新分配的 Integer 对象，它表示指定的 int 值。 
		   Integer(String s) 
		          构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。 
		 */
		Integer in2=new Integer(121);//121
		System.out.println(in2);
//		Integer in3=new Integer("121abc");  //非纯数字转Integer会抛出异常 NumberFormatException
//		System.out.println(in3);
		
		String str="abc123";
//		System.out.println(Integer.valueOf(str)); //NumberFormatException
		
		//static int parseInt(String s,进制)     将字符串参数以指定的进制整数进行解析。 
		int i=Integer.parseInt("012",8); 
		System.out.println(i);// 10
		
		
	}
}
