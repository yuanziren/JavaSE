package com.javase.day13.collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  ����
 *  	��ǿfor   
 *  	������ iterator()
 */
public class Demo02 {
	public static void main(String[] args) {
		//��ǰ������ֻ�ܴ洢�����д洢������ <String>
		Collection<Integer> c=new ArrayList<Integer>();
		//c.add("haha ");
		Collection<String> col=new ArrayList();  //�Ⱥ��ұߵķ��Ϳ���ʡ��
		col.add("��Ұҽ��");
		col.add("ŷ����");
		col.add("����");
		col.add("����ˮ");
//		col.add(false);
		
		//��ǿfor
		for(Object s:col){
			if(s instanceof String){
				System.out.println(((String) s).length());
			}
		}
		//�ӹ������ܹ�ȷ��������ֻ���ַ���
		for(String str:col){
			System.out.println(str);
		}
		System.out.println("------------");
		//������
		//Iterator<E> iterator() ����һ���ܹ�����|������ǰ��������ĵ���������
		Iterator<String> it=col.iterator();
		while(it.hasNext()){  //�жϺ����Ƿ���Ԫ��,������ڷ���true
			System.out.println(it.next().length()); //��ȡ��һ��Ԫ��
			System.out.println(it.next());
		}
		
		//���Ϳ�����ǿ������ȶ��ԺͿɶ���   
	}
}
