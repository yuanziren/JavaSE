package com.javase.day08.modifier2;

import com.javase.day08.modifier.Fu;

//��ͬ��������


public class TestSon extends Fu{  //ctrl+1
	
	void demo(){
		System.out.println(pro+"--->"+pub); //�̳й�ϵʹ��

		Fu fu=new Fu();
		//System.out.println(fu.pro);  //ֱ�ӷ���Ȩ��ʹ�ò���  protected
		System.out.println(fu.pub);  
		
		test2();
	}
}

