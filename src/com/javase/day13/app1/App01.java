package com.javase.day13.app1;

import java.util.Arrays;

/*
 * ����: �洢�������
 * 	1.���鶨��
 * 	2.����������ͬ
 * 	3.����
 * ����: �洢�������
 * 	������ϵ:
 * 
 * �Զ����������  : �����������������,���ż��ٶ���С
 * ֻ�� �洢�ַ������͵�����
 */
public class App01 {
	public static void main(String[] args) {
		//1.�����Զ���������Ķ���
		MyContainer my=new MyContainer();
		System.out.println(my.size());
		
		//2.  add("����˪")  �������
		my.add("����˪");
		my.add("ˬ��ˮ");
		my.add("ȫ����Һ");
		System.out.println(my.size());
		
		//3.  get(index); ����������ѯ ��ѯָ������λ�õ�����
		System.out.println(my.get(0));
		System.out.println(my.get(1));
		System.out.println(my.get(2));
		
		//4.  delete(index);  ɾ��ĳ������λ�õ�����
		my.delete(1);
		System.out.println(my);
		
		//5.  alter(index,data); �޸�ĳ������λ�õ�����
		
		
	}
}

//�Զ���������
class MyContainer{
	private String[] arr;  //�洢���������ݵ�����
	private int size;  //���������ݵĸ���
	
	public MyContainer() {
		arr=new String[0];
	}

	/**
	 * ɾ������
	 * @param index ����
	 */
	public void delete(int index) {
		if(index<0 || index>=size){
			throw new ArrayIndexOutOfBoundsException("����Խ��"+index);
		}
		//1.����ԭ����
		String[] temp=arr;
		//2.����������
		arr=new String[size-1];
		//3.��������
		for(int i=0;i<size;i++){
			if(i<index){
				arr[i]=temp[i];
			}else if(i==index){
				continue;
			}else{
				arr[i-1]=temp[i];
			}
		}
		size--;
	}

	/**
	 * ��ӹ���
	 * @param value  ������Ҫ��ӵ�����
	 */
	public void add(String value) {
		//����ԭ����
		String[] temp=arr;  
		//���ݺ��������
		arr=new String[size+1];
		//����  ��ԭ�������ó����ݷŵ���������
		for(int i=0;i<size;i++){
			arr[i]=temp[i];
		}
		//������������ֵ�������
		arr[size]=value;
		size++;
	}
	
	/**
	 * ��ȡ����
	 * index : ����
	 */
	public String get(int index){
		if(index<0 || index>=size){
			throw new ArrayIndexOutOfBoundsException("����Խ��"+index);
		}
		return arr[index];
	}
	
	//��ȡ����
	public int size(){
		return this.size;
	}

	@Override
	public String toString() {
		return "MyContainer [arr=" + Arrays.toString(arr) + ", size=" + size + "]";
	}
	
	
	
}
