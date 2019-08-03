package com.javase.array;
/*
 * 可变参数 
	1.可变参数的个数可以没有也可以有多个,个数不定但是类型要求相同
	2.数据类型 ... 参数名  ...代表可变参数,要写在数据类型和参数名之间
	3.可变参数相当于在方法内部创建一个当前类型的数组,所以使用可变参数中的数据要使用数组的方法
	4.可变参数写在参数列表的最后位置
 */
public class Parameter06 {
	public static void main(String[] args){
		getSum(1,2,3,4,5,6,7,8,9,10);
	}
	
	//求不同个数的int类型参数的和
	public static void getSum(int ... a){
		int sum=0;
		for(int i:a){
			sum+=i;
		}
		System.out.println(a[2]);
		System.out.println(sum);
	}
	
	public static void test(String a,int ...b){
		
	}
}
