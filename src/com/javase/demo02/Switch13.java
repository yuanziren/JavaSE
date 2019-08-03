package com.javase.demo02;
/**  
	如果比较字符串内容是否相等就是用equals
	字符串1.equals(字符串2)  ==>如果两个字符串相等返回true,如果不相等返回false

	测试java中的switch语句 :定值判断
	
		switch(表达式){
			case 值1:
				语句体1;
				break;
			case 值2:
				语句体2;
				break;
				.....
			default:
				语句体n;
				break;
		}
		
		执行流程:
			1,计算表达式
			2.与case后的值比较,如果和值1相等,就执行语句体1,遇到break结束,如果不想等继续向下比较
			3.与值2比较,就执行语句体2,遇到break结束,如果不想等继续向下比较
			.....
			4.如果以上条件都不满足,就执行default中的内容 (default可以省略)
			
		
		
		表达式:一般是一个变量
			  表达式的结果的数据类型,只能为byte,short,int,char,枚举(1.5后新增),字符串(1.7新增)
		break:如果不写break,会发生case穿透,从当前满足条件的语句体开始,一致向下执行所有的语句体,不再判断是否满足条件,直到遇到下一个break;或者语句体的结束位置
		default:位置可以改变,可以在任意位置,一般放在最后
		
		switch和if之间如何选择:
			switch:定值判断
			if:区间判断
		
*/
public class Switch13{ 
	//程序的入口
	public static void main(String[] args){
		String s1="因为1";
		String s2="因为";
		System.out.println(s1.equals(s2));
		
		String flag="紫灯";
		switch(flag){
			default:
				System.out.println("再见");
				break;
			case "红灯":
				System.out.println("红灯停一停");
				break;
			case "绿灯":
				System.out.println("绿灯行");
				break;
			case "黄灯":
				System.out.println("黄灯等一等");
				break;

		}
		
		int i=100;
		switch(i/10){
			case 1:
				System.out.println("1");
				System.out.println("...");
				break;
			case 10:
				System.out.println("10");
				break;
		}
		
		//---使用switch语句,对boolean类型的变量做定值判断
		boolean b=false;
		
		
	}
}
