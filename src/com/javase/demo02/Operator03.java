package com.javase.demo02;
/**  
	++  -- �����Դ����в���������������
	++ :����+1   
		a++ ===> a=a+1 
	
	�����Լ�:++ -- ֻӰ���㱾��Ľ��,��Ӱ��������(��������������)
		++ ���ڲ�������ǰ����ߺ��涼������+1
		-- ���ڲ�������ǰ����ߺ��涼������-1
	
	��������
		++,-- ������ڲ������ĺ���,�ǲ�������,������+1,-1   b--;
		++,-- ������ڲ�������ǰ��,��������+1,-1,�ٲ�������
*/
public class Operator03{ 
	//��������
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
		
		//-----��ϰ
		int k=20;
		int j=8;
		int totle = k++ + j-- + --j + ++k + k++ + j++ + k-- + --k + j++;
		System.out.println("k="+k+",j="+j+",totle="+totle);   //
	}
}
