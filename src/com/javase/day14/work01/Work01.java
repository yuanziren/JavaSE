package com.javase.day14.work01;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
/**
 * 模拟签到： 1、准备一个空白本子 2、开始签到 3、签到结束 4、获取一共有多少人签到了 5、获取到所有的名单 6、查看班长在不在名单上
 * 
 * Date类 起始时间 判断时间过5分钟停止 容器:HashMap key=当时时间 value=名字
 * 
 * @author T F
 */
public class Work01 {
	public static void main(String[] args) {
		System.out.println("按下enter键开始签到");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		boolean flag = true;
		// AttendanceSheet sheet = new AttendanceSheet();
		// sheet.getAttendanceSheet();
		AttendanceHashSet sheet = new AttendanceHashSet();
		sheet.getAttendanceSheet();
		TreeSet<Person> set =sheet.set;
		for(Person p:set){
			System.out.println(p);
		}
		
		while (flag) {

			System.out.println("1.打印完整签到表\n2.查询签到情况");
			int num = sc.nextInt();
			if (num == 1) {
				sheet.getFullSheet();
				System.out.println("1.返回\t2.退出");
				int i = sc.nextInt();
				if (i == 2) {
					break;
				}
			} else if (num == 2) {
				sheet.isExist();
				System.out.println("1.返回\t2.退出");
				int i = sc.nextInt();
				if (i == 2) {
					break;
				}

			} else {
				System.out.println("输入错误");
				System.out.println("1.返回\t2.退出");
				int i = sc.nextInt();
				if (i == 2) {
					break;
				}
			}
		}
		sc.close();
	}

}

class AttendanceSheet {
	HashMap<String, String> map = new HashMap<>();// 容器存放时间和名字
	Date start = new Date();// 计时
	DateFormat date = new SimpleDateFormat("yyyy年 MM月 dd日  E HH:mm:ss");// 日期格式
	String name;
	int count;

	public void getAttendanceSheet() {
		System.out.println("开始签到");
		start = new Date();// 计时
		Scanner sc = new Scanner(System.in);
		while ((new Date().getTime() - start.getTime()) <= 30000) {
			name = sc.nextLine();
			map.put(date.format(new Date()), name);
			count++;
		}
		System.out.println("时间到,签到结束");
		sc.close();
	}

	public void getName() {

		for (String temp : map.keySet()) {
			System.out.println(map.get(temp));
		}
		System.out.println("总人数:\t" + count);
	}

	public void getFullSheet() {
		System.out.println("\t签到时间\t\t\t姓名");
		System.out.println("---------------------------------");
		for (String temp : map.keySet()) {
			System.out.println(temp + "\t" + map.get(temp));
		}
		System.out.println("总人数:\t" + count);
	}

	public void isExist() {
		System.out.println("请问要查找谁的名字");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for (String temp : map.keySet()) {
			if (map.get(temp).equals(name)) {
				System.out.println("姓名:" + name + "\t签到时间:" + temp);
				sc.close();	
				return;
			}
		}
		sc.close();
		System.out.println("未查询到" + name);
	}

}

class Person {
	Date time;
	String name;
	int ID;
	@Override
	public String toString() {
		return "Person [time=" + time + ", name=" + name + ", ID=" + ID + "]";
	}
}
// class Person implements Comparable<Person>{
// Date time;
// String name;
// int ID;
// @Override
// public int compareTo(Person o) {
// if(this.ID>o.ID){
// return -1;
// }else {
// return 1;
// }
// }
// }

class AttendanceHashSet {
	TreeSet<Person> set = new TreeSet<>((o1, o2) -> {
		if (o1.ID > o2.ID) {
			return -1;
		} else {
			return 1;
		}
	});
	Date start = new Date();// 计时
	DateFormat date = new SimpleDateFormat("yyyy年 MM月 dd日  E HH:mm:ss");// 日期格式
	int count;

	public void getAttendanceSheet() {
		System.out.println("开始签到");
		start = new Date();// 计时
		Scanner sc = new Scanner(System.in);
		int i=0;
		while ((new Date().getTime() - start.getTime()) <= 10000) {
			i++;
			Person p = new Person();
			p.name = sc.nextLine();
			p.time = new Date();
			p.ID=i;
			set.add(p);
			count++;
		}
		System.out.println("时间到,签到结束");
		//sc.close();  最后结束时候才关闭
	}

	public void getFullSheet() {
		System.out.println("-------------------------------------");
		System.out.println("\t签到时间\t\t\t姓名");
		System.out.println("-------------------------------------");
		for (Person p : set) {
			System.out.println(date.format(p.time) + "\t" + p.name);
		}
		System.out.println("-------------------------------------");
		System.out.println("总人数:\t" + count);
		System.out.println("-------------------------------------");
	}

	public void isExist() {
		System.out.println("请问要查找谁的名字");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for (Person p : set) {
			if (p.name.equals(name)) {
				System.out.println("姓名:" + name + "\t签到时间:" + date.format(p.time));
				sc.close();	
				return;
			}
		}
		System.out.println("未查询到" + name);
		sc.close();		
	}

}