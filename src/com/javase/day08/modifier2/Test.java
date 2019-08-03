package com.javase.day08.modifier2;

import com.javase.day08.modifier.Fu;

public class Test {
	public static void main(String[] args) {
		Fu fu=new Fu();
		System.out.println(fu.pub);
		
		TestSon son=new TestSon();
		//System.out.println(son.pro); 
		son.demo();
	}
}
