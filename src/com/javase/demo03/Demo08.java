package com.javase.demo03;
/**  
	 测试java中循环嵌套
		for(条件初始化;条件变化;条件判断){
			//代码
			for(条件初始化;条件变化;条件判断){
				//代码
			}
			//代码
		}
*/
public class Demo08{ 
	//程序的入口
	public static void main(String[] args){
		/*
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
		*/
		//单层循环 
		int count=0; //计数器
		for(int i=1;i<=25;i++){
			System.out.print("*"+" ");
			count++;
			if(count==5){
				System.out.println();
				count=0;
			}
		}
		
		//循环嵌套  
		//外层循环变量i控制行数  从1开始,  一共有5行
		for(int i=1;i<=5;i++){
			//控制打印每一行中的所有星星  内层循环从1,一共打印5个星星
			for(int j=1;j<=5;j++){  
				System.out.print("* ");
			}
			//换行
			System.out.println();
		}
		/*
			* * * * * 
			*       *      
			*       * 
			*       * 
			* * * * * 
		*/
		for(int i=1;i<=5;i++){
			//控制打印每一行中的所有星星  内层循环从1,一共打印5个星星
			for(int j=1;j<=5;j++){ 
				if(i==1 || i==5 || j==1 || j==5){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			//换行
			System.out.println();
		}
		/*
			*   				1	
			* *      			2
			* * *				3
			* * * *				4
			* * * * * 			5
		*/
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			//换行
			System.out.println();
		}
		
		/*
			*   				1	
			* *      			2
			*   *				3
			*     *				4
			* * * * * 			5
		*/
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				if(i==5 || j==1 || j==i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			//换行
			System.out.println();
		}
		
		//九九乘法表
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
