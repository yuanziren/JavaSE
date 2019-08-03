package com.javase.demo04;
/**  	
	测试java中的数组
		相同数据类型的有序集合
		
		变量:存储单个数据
		数组:存储多个数据
		
		数组的特点:
			1.数组是引用数据类型 
			2.数组是一个集合,长度一旦确定不可改变
			3.数组中数据的数据类型相同 
			4.数组是有序的  索引:从0开始,不会重复
			
		
		数组的定义:
			数组的声明:
				数据类型 数组名[];
				数据类型[] 数组名; --推荐
			
			
			数组的动态初始化:
				创建数组并指定长度
				数据类型[] 数组名 = new 数据类型[长度];
				数组中的数据没有赋值存在默认值
					整数  0
					小数  0.0
					boolean false
					字符串  null
					char ' '空格字符
			数组的静态初始化:(根据值确定数组的长度,一旦确定无法改变)
				数据类型[] 数组名 =new 数据类型[]{值1,值2,值3...};
				数据类型[] 数组名 ={值1,值2,值3...};  //推荐使用
			
		数组的使用:
		
		根据索引操作数组:
			获取值|赋值
			数组名[索引]
			数组中的索引从0开始,不会重复
			根据索引操作数组效率高
			
		长度length属性
			数组名.length
			
		数组中最后一个数据的索引:  数组名[数组名.length-1]
		
		数组的遍历:
			1.普通for循环  遍历的是索引,根据索引在数组中获取数据
			2.增强for循环,for..each
				for(数据类型 变量名:数组名字){
					变量就是数组中的每一个数据
				}
*/
public class Array07{ 
	//程序的入口
	public static void main(String[] args){
		//int类型的数组
		int[] arr;
		int arr2[];
		
		//动态初始化
		arr= new int[4];
		System.out.println(arr[2]);
		//根据索引赋值
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;
		System.out.println(arr[1]);
		System.out.println(arr.length);
		//静态初始化
		String[] arr3=new String[]{"上海","尚学堂","真棒!!!"};
		String[] arr4 = {"上海","尚学堂","真棒!!!"};
		System.out.println(arr4.length+"+++");
		System.out.println(arr3.length);
		System.out.println(arr3[arr3.length-1]);
		
		//简略写法不可以重新赋值
		char[] ch={'s','h','s','x','t'};
		//ch={'h','l'};
		
		//普通for循环  变量作为索引使用
		for(int i=0;i<=arr3.length-1;i++){
			System.out.println(arr3[i]);
		}
		
		//增强for循环
		for(char c:ch){
			System.out.println(c);
		}
		
		//随机点名器
	}
	
	
}
