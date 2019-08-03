package com.javase.day13.set4;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorImpl implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}
	
	public static void main(String[] args) {
		ComparatorImpl com = new ComparatorImpl();
		/**
		 * 1.通过Comparator实现类来比较
		 */
		//TreeSet<User> t = new TreeSet<>(com);
		/**
		 * 2.通过对象来比较
		 */
		//TreeSet<User> t = new TreeSet<>(new ComparatorImpl());
		/**
		 * 3.通过匿名内部类来实现比较
		 */
		/*TreeSet<User> t = new TreeSet<>(new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
		});*/
		/**
		 * 通过Lambda表达式来比较
		 */
		TreeSet<User> t = new TreeSet<>((o1,o2)->{
			return o1.getAge()-o2.getAge();
		});
		
		User user = new User("赵阿伟",24);
		User user2 = new User("王海滨",23);
		User user3 = new User("夏川",22);
		User user4 = new User("陶程凯",21);
		User user5 = new User("袁自忍",25);
		User user6 = new User("管飞",20);
		t.add(user);
		t.add(user2);
		t.add(user3);
		t.add(user4);
		t.add(user5);
		t.add(user6);
		System.out.println(t);
	}
	


}
