package com.javase.day13.set4;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet:
 * 	底层实现:红黑树
 * 	优点:有序(升序,与存储顺序无关),查询效率高
 * 	缺点:但是没有HashSet效率高
 * 
 * 内部比较器:		实现Comparable接口,重写compareTo方法,自定义排序规则
 * 外部比较器|自定义比较器:  实现     
 * 
 */
public class TreeSet02 {
	public static void main(String[] args) {
//		TreeSet tree=new TreeSet();
//		TreeSet tree=new TreeSet(new MyCompare());
		//匿名内部类
		TreeSet tree=new TreeSet(new Comparator<User>(){
			@Override
			public int compare(User o1, User o2) {
				return o1.getAge()-o2.getAge();
			}
		});
		//Lambda表达式
		//TreeSet tree=new TreeSet((o1,o2)->{return ((User)o1).getAge()-((User)o2).getAge();});
		tree.add(new User("胡歌",30));
		tree.add(new User("彭于晏",36));
		tree.add(new User("梁朝伟",50));
		tree.add(new User("李亚鹏",49));
		tree.add(new User("吴彦祖",49));
		System.out.println(tree);
		
		
	}
}

//自定义比较器
class MyCompare implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o2.getAge()-o1.getAge();
	}
	
}

//class User implements Comparable<User>{
class User{
	private String name;
	private int age;
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	//自定义排序规则
	/*@Override
	public int compareTo(User o) {
		return this.age-o.age;
	}*/
}
