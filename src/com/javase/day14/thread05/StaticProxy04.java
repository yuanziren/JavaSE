package com.javase.day14.thread05;
/*
 * 静态代理:婚庆公司
 * 	真实角色
 * 	代理角色
 * 	代理行为
 * 	相同的接口
 */
public class StaticProxy04 {
	public static void main(String[] args) {
		You you=new You() ;
		Proxy proxy=new Proxy(you);
		proxy.marry();
		
		new Proxy(new You()).marry();
		
		/*
		Match match=new Match();  //同一场比赛
		Thread th=new Thread(match);
		th.start();
		new Thread(new Match()).start();
		 */
		
	}
}

//结婚
interface Marry{
	void marry();
}

//真实角色
class You implements Marry{

	@Override
	public void marry() {	
		System.out.println("你和猪八戒终于结婚了....");
	}
	
}

//代理角色
class Proxy implements Marry{
	You you;
	
	public Proxy(You you) {
		this.you=you;
	}
	
	@Override
	public void marry() {
		System.out.println("---------------");
		you.marry();
		System.out.println("---------------");
	}
	
}

