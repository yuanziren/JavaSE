package com.javase.day08.modifier2;

import com.javase.day08.modifier.Fu;

//不同包的子类


public class TestSon extends Fu{  //ctrl+1
	
	void demo(){
		System.out.println(pro+"--->"+pub); //继承关系使用

		Fu fu=new Fu();
		//System.out.println(fu.pro);  //直接访问权限使用不行  protected
		System.out.println(fu.pub);  
		
		test2();
	}
}

