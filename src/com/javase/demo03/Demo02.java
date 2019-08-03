package com.javase.demo03;
/**  
	 测试java中的Math.random()
	 
	 Math是java提供的一个数学类
		不需要导包,在java.lang包下
	
	 获取随机数 Math.random() [0.0,1.0)随机数
	 获取某个范围内的随机数  [0,max)
		Math.random()*max
	 获取某个范围内的随机数  [0,max] (max值的小数能够取到)
		Math.random()*(max+1)
	 获取某个范围内的随机整数  [0,max] 
		(int)(Math.random()*(max+1))
	 获取某个范围内的随机整数  [min,max]   [3,5]
		(int)(Math.random()*(max-min+1))+min
		
	 Math.round(数值)  四舍五入,只关注小数点后一位
	 Math.sqrt(数值) 取平方根  结果是double类型
	 Math.abs(数值) 绝对值 
	
*/
public class Demo02{ 
	//程序的入口
	public static void main(String[] args){
		String str="";
		System.out.println();
		
		//[1,100]
		int num=(int)(Math.random()*(100-1+1)+1);
		
		System.out.println(Math.round(4.49));
		System.out.println(Math.sqrt(2));
		System.out.println(Math.abs(-2));
	}
}
