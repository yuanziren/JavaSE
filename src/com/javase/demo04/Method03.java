package com.javase.demo04;
/**  	
		没有返回值类型的方法
			修饰符 void 方法名([参数列表]){
				方法体语句;
				[return;]
			}
			
			void:没有返回值的意思
			return:提前结束方法
		
		
		方法的调用:执行方法中的代码  方法名([参数列表]);  
			有返回值类型的方法
				1.赋值调用 
					数据类型 变量名 = 方法名(参数列表);
				2.输出调用
					System.out.println(方法名(参数列表));
				3.直接调用
					方法名([参数列表]); 
			没有返回值的方法:
				1.直接调用
		
			
*/
public class Method03{ 
	//程序的入口
	public static void main(String[] args){
		//直接调用
		print();
		print();
		print();
		print();
		print();
		//System.out.println(print());
		
		getSum(6,5);
	
	}
	
	//打印99乘法表
	//返回值类型:不需要返回值类型   参数:么有
	public static void print(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+" ");
			}
			System.out.println();
		}
	}
	
	//计算某个区间范围的所有整数的和然后直接输出,要求,第一个值不能>第二个值
	//返回值:不需要    参数:2个参数  int min,int max
	public static void getSum(int min,int max){
		if(min>max){
			System.out.println("第一个值不能>第二个值");
			return;
		}
		int sum=0;
		for(int i=min;i<=max;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
	
	
}
