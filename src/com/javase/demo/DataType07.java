package com.javase.demo;
/**  
	测试java中的数据类型
		
		java是门强类型的语言
		
		基本数据类型: 四类八种
		引用数据类型: 类  接口  数组
		
		基本数据类型:存放数据的大小
			计算机中最基本的存储单位是字节  1byte=8bit 字节之间1024进制的
			数值型
				整型
					表示名称    表示形式       大小       范围
					   字节型	  byte     1个字节 8位    [-128,127]
					   短整型     short    2个字节 16位   [-32768,32767]  正负3w   8k
					****整型       int	   4个字节 32位    +-21亿
					   长整型     long     8个字节			灰常大
					   
					   整型的字面常量值默认是int类型
					   如果想要给比int类型大的long类型赋值,需要在数据的后面添加一个l/L (推荐L)
						
				浮点型|小数
					表示名称    表示形式       大小           精度
					 单精度			float		4个字节		   7位左右
					 双精度			double      8个字节        16位左右
					
					浮点类型的字面常量值默认是double类型
					给float类型变量赋值需要在数据的后面添加一个f/F
			字符型
				表示名称    表示形式       大小       范围
				 字符型			char		2个字节		0~65535
					字符型的表示形式:
						1.				0~65535之间的整数表示字符型---对应的Uncode字符集中查找,可以去ascii查看
						2. 				' '一对单引号中放单个字符,必须要放一个字符   '1'  'a'  ' ' ','
						如果字符型数据参与运行,会先转为对应的十进制数再去运算
			布尔型
				true,false   1bit 
				在程序中经常使用boolean类型的数据表示逻辑
			
*/
public class DataType07{   

	public static void main(String[] args){
		//byte
		byte b1=127;
		System.out.println(b1);
		
		//short
		short s1=1;
		System.out.println(s1);
		
		//long
		long l1=100000000000L;
		System.out.println(l1);
		long l2=11111111l;
		
		double d1=1.23456789123456789;
		System.out.println(d1);
		
		float f=0.123456789f;
		System.out.println(f);
		System.out.println(0.1+0.2==0.3);
		
		
		//char
		char ch1='a';
		char ch2='1';
		char ch3=',';
		char ch4=' ';
		char ch5=97;
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch1+1);
		
		//String 字符串,表示多个字符  ""中放的内容就是字符串 原封不动的表示字符串的内容 'a' "abc"  abc->标识符
		
	}

}
