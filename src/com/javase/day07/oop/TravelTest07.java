package com.javase.day07.oop;
/*
 * ������Ϊ��ʱ��,
 * 	�ȷ����м�������   û�������Զ�����    û������ô����    ����|����     ����
 */
public class TravelTest07 {
	public static void main(String[] args) {
		//�ȴ������Ҷ���
		Country05 country=new Country05();
		country.name="�ϰ�";
		country.hotel="�����Ƶ�";
		
		//����һ���������
		Secretary06 sec=new Secretary06();
		sec.name="����ʦ";
		sec.gender="��";
		System.out.println(sec.gender);  //��
		
		sec.strategy(country.name);
		sec.book(country);
		
		System.out.println(sec.gender);  //Ů
	}
}
