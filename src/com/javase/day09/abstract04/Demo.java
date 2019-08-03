package com.javase.day09.abstract04;
//子类Demo,不确定当前继承的抽象方法如何实现
public abstract class Demo extends Develop{

	@Override
	public void work(){
		System.out.println("Demo实现了Develop的抽象方法");
	};
	
	void haha(){
		System.out.println("按需新增的haha");
	}
}
