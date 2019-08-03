package com.javase.day07.oop;
/*
 * 秘书类
 * 	属性: 姓名   性别
 * 	功能: 订酒店   查攻略  订机票
 * 
 */
public class Secretary06 {
	//姓名 
	String name;
	//性别
	String gender;
	
	//查攻略  
	//返回值 :不需要返回值          参数:String countryName
	public void strategy(String countryName){
		gender="女";
		System.out.println(name+"在给你查去"+countryName+"的攻略...");
	}
	
	//订酒店
	public void book(Country05 country){  //Country05 country=new Country05();
		System.out.println(name+"正在为您预定"+country.name+"的"+country.hotel);
	}
}
