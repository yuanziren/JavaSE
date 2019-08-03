package com.javase.demo03;
/**  
	 for循环练习
*/
public class Practice04{ 
	//程序的入口
	public static void main(String[] args){
		//求1-100的和,求1-100的偶数和,求1-100的奇数和 
		int sum=0; //求1~100之间和
		int sum1=0; //求1~100之间偶数和
		int sum2=0; //求1~100之间奇数和
		for(int i=1;i<=100;i++){
			sum+=i;
			
			//求偶数和
			if(i%2==0){
				sum1+=i;
			}else{
				sum2+=i;
			}
		}
		
		for(int i=0;i<=100;i+=2){
			//求和
		}
		System.out.println("1~100之间的和:"+sum);  //5050
		System.out.println("1~100之间的偶数和:"+sum1);  //2550
		System.out.println("1~100之间的奇数和:"+sum2);  //2500
		//1-50当中能被4整除的数的和
		sum=0; //归零
		for(int i=0;i<=50;i++){
			if(i%4==0){
				sum+=i;
			}
		}
		System.out.println("1~50之间能被4整除的数的和:"+sum);
		
		sum=0; //归零
		sum1=0; //归零
		//求出 1-100当中既能被3整除又能被5整除还能被2整除的和， 
		for(int i=0;i<=100;i++){
			if(i%2==0 && i%3==0 && i%5==0){
				sum+=i;
			}
			if(i%2==0 || i%3==0 || i%5==0){
				sum1+=i;
			}
		}
		System.out.println(" 1-100当中既能被3整除又能被5整除还能被2整除的和:"+sum);
		System.out.println(" 1-100当中能被3整除或者能被5整除或者能被2整除的和:"+sum1);
		
		//求出 1-100当中能被3整除或者能被5整除或者能被2整除的和
		//求5的阶乘  5! 5*4*3*2*1
		int result=1;
		for(int i=5;i>0;i--){
			result*=i; //result=result*i;
		}
		System.out.println(" 求5的阶乘  5! 5*4*3*2*1:"+result);
		
		System.out.println("---------------------------------------------------");
		//请找出[100，300]之间能被5整除的所有数，每行输出8个数
		int count=0;
		for(int i=100;i<=300;i++){
			if(i%5==0){
				//能够获取所有100~300之间能被5整除的数
				System.out.print(i+" ");
				count++;  //count=count+1;
				/*if(count%8==0){
					System.out.println(); //换行
				}
				*/
				if(count==8){
					System.out.println(); //换行
					count=0; //计数器归零
				}
			}
		}

		System.out.println(); 
		System.out.println("---------------------------------------------------");
		count=0;
		//请找出[100，300]之间能被5整除的所有数，每行输出8个数,每两个数之间使用逗号进行分隔,注意每行最后一个数后面不需要逗号
		for(int i=100;i<=400;i++){
			if(i%5==0){
				if(count==0){
					System.out.print(i);
				}else if(count>=1 && count<=7){
					System.out.print(","+i);
				}
				count++;  //count=count+1;
				if(count==8){
					System.out.println(); //换行
					count=0; 
				}
			}
		}
		
		System.out.println();
		
		int a=1;
		int b=10000;
		
		//使用:使用中间变量
		/*
		int temp=a;
		a=b;  //a=10000  temp=1
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		*/
		
		//第二种:求和
		a=a+b;  //a=10001  b=10000
		b=a-b;  //1
		a=a-b;  //10000
		System.out.println(a);
		System.out.println(b);
		
		//第三种:使用  ^   a^b  
	}
}
