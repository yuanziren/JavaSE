package com.javase.demo03;
/**  
	 测试java中的break和continue
		break:
			作用: 终止循环
			应用场景:switch语句和循环语句中
		continue:
			作用:跳过本次循环,直接进入到下一次循环
			应用场景:循环语句
*/
public class Demo07{ 
	//程序的入口
	public static void main(String[] args){
		//打印1~10之间的数,遇到3或者3的倍数就跳过
		for(int i=1;i<=10;i++){
			if(i%3==0){
				continue;
			}
			System.out.println(i);
		}
		int j=5;
		while(true){
			if(j==7){
				break;
			}
			System.out.println(j++);
		}
		
		//击鼓传花
		//随机数  [1,50]
		int ran=(int)(Math.random()*(50-1+1)+1);
		System.out.println(ran);
		int num=0;
		while(true){
			num++;
			if(ran==num){
				System.out.println("游戏结束了,有请学号为"+num+"的学生上台表演节目");
				break;
			}
		}
		
		//打印10~50之间前五个能被5整除的数
		int count=0;
		for(int i=10;i<=50;i++){
			if(i%5==0){
				System.out.println(i);
				count++;
				if(count==5){
					break;
				}
			}
		}
		
		for(int i=1;i<=10;i++){
			if(i%2==0){
				// 补全代码  
				//continue; //打印5次
				//打印一次
				break;
			}
			System.out.println("上海尚学堂真棒!!!");
		}
		
		//练习
		//A: 随机生成小写字母,判断是不是元音  元音:aeiou
		//B: 输出除了4和6以外的1~10之间的数
	}
}
