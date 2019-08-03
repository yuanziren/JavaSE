package com.javase.demo;
/**  
	测试java中的数据类型转换
		1.boolean 类型不参与类型转换
		自动类型转换
			从小数据类型到大数据类型可以发生自动类型转换
			
			在运算的时候结果同一提升为参与运算的数据类型中最大的那一个  
			char,short,byte类型的数据在参与运算的时候回把类类型同一提升成为int类型
			在给byte,short类型赋值的时候,可以把int类型的字面常量值成功赋值
			
			
		
		强制类型转换
			从大数据类型到小数据类型可以发生强制类型准换,可能会损失精度
			小范围数据类型  变量名= (小范围数据类型)大范围数据类型;
			
		byte  short  char  int long  float  double
			
*/
public class DataTypeCon08{   

	public static void main(String[] args){
		//自动类型提升
		byte b1=121;
		short s1=b1; 
		System.out.println(s1);
		
		int i1=s1;
		
		double d1=s1+b1;
		System.out.println(d1);
		
		float f1=i1;
		//int i2=f1;
		System.out.println(f1);
		//System.out.println(i2);
		
		long l1=1000L;
		float f2=l1;
		System.out.println(f2);
		
		//强制类型准换
		int int1=120;
		byte b3=(byte)int1;
		System.out.println(b3);
		
		//int i2=(int)(b1+s1+d1);
		int i2=b1+s1+(int)d1;
		
		//取整,小数位丢弃
		double double1=1000.9;
		int int2=(int)double1;
		System.out.println(int2);
		
		
		float float1=(float)3.1415;
		System.out.println(float1);
		
		//圆环形
		byte by1=(byte)-130;
		System.out.println(by1);  //126
		
		int money=1000000000;
		int month=12;
		int result=(int)(month*(long)money);
		System.out.println(result); //-884901888
	}

}
