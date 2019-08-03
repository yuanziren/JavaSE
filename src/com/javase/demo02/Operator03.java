package com.javase.demo02;
/**  
	++  -- 都可以存在有操作数的左右两边
	++ :本身+1   
		a++ ===> a=a+1 
	
	操作自己:++ -- 只影响你本身的结果,不影响其他人(不参与其他运算)
		++ 放在操作数的前面后者后面都是自身+1
		-- 放在操作数的前面后者后面都是自身-1
	
	操作别人
		++,-- 如果放在操作数的后面,是参与运算,再自身+1,-1   b--;
		++,-- 如果放在操作数的前面,现在自身+1,-1,再参与运算
*/
public class Operator03{ 
	//程序的入口
	public static void main(String[] args){
		int a=3; // a++   ++a   a-- --a
		a++;  //a=a+1;  4
		++a;  //a=a+1;  5
		System.out.println(a);
		--a;  //a=a-1;  4
		System.out.println("a="+a);
		
		int b=5;
		System.out.println(b--); //5  b=4
		System.out.println(--b);  //3  b=3
		
		
		a=6;
		int c=a++ + 2;
		System.out.println(a); //7
		System.out.println(c); //8
		
		b=3;
		c=1+  --b;
		System.out.println(b); //2
		System.out.println(c); //3
		
		int i=5;
		int result= i++ + ++i + i++ + i++ + ++i;
		System.out.println(i); // i=10 
		System.out.println(result); // result= 37 
		
		//-----练习
		int k=20;
		int j=8;
		int totle = k++ + j-- + --j + ++k + k++ + j++ + k-- + --k + j++;
		System.out.println("k="+k+",j="+j+",totle="+totle);   //
	}
}
