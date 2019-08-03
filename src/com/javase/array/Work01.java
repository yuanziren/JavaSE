package com.javase.array;
/**  	
	java中一切都是值传递
			
*/
public class Work01{ 
	//程序的入口
	public static void main(String[] args){
		int i=99;
		
		mb(i);  
		System.out.println(i+100); //199
		
		int[] result=flower();
		for(int a:result){
			System.out.println(a);
		}
		
		System.out.println(fibo(5));
		
	}
	
	//斐波那契数列  拿到第指定位置的数
	//返回值:结果  int    参数:指定位置 int
	public static int fibo(int i){
		if(i==1 || i==2){
			return 1;
		}
		return fibo(i-2)+fibo(i-1);
	}
	
	
	public static int mb(int i){
		i+=100;
		System.out.println(i+100); //299
		return i;
	}
	
	//水仙花数  如果存在水仙花数返回水仙花数  如果不存在返回-1
	//返回值:没有返回值    参数:不需要
	public static int[] flower(){
		int a=0; // 百位数
		int b=0; // 十位数
		int c=0; // 个位数
		int count=0;
	
		//求水仙花数的个数
		for(int i=100;i<1000;i++){
			a=i/100;
			b=i%100/10;
			c=i%100%10;
			
			if(i==a*a*a + b*b*b + c*c*c){
				count++;
			}

		}
		//存放所有指定个数的水仙花数
		int[] arr=new int[count];
		
		//把水仙花数拿出来存储到指定数组中
		int index=0;
		for(int i=100;i<1000;i++){
			a=i/100;
			b=i%100/10;
			c=i%100%10;
			
			if(i==a*a*a + b*b*b + c*c*c){
				arr[index]=i;
				index++;
			}

		}
		return arr;
	}
}
