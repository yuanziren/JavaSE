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
		 * 1.ͨ��Comparatorʵ�������Ƚ�
		 */
		//TreeSet<User> t = new TreeSet<>(com);
		/**
		 * 2.ͨ���������Ƚ�
		 */
		//TreeSet<User> t = new TreeSet<>(new ComparatorImpl());
		/**
		 * 3.ͨ�������ڲ�����ʵ�ֱȽ�
		 */
		/*TreeSet<User> t = new TreeSet<>(new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
		});*/
		/**
		 * ͨ��Lambda���ʽ���Ƚ�
		 */
		TreeSet<User> t = new TreeSet<>((o1,o2)->{
			return o1.getAge()-o2.getAge();
		});
		
		User user = new User("�԰�ΰ",24);
		User user2 = new User("������",23);
		User user3 = new User("�Ĵ�",22);
		User user4 = new User("�ճ̿�",21);
		User user5 = new User("Ԭ����",25);
		User user6 = new User("�ܷ�",20);
		t.add(user);
		t.add(user2);
		t.add(user3);
		t.add(user4);
		t.add(user5);
		t.add(user6);
		System.out.println(t);
	}
	


}
