package com.javase.day08.modifier;
/*
 * Ȩ�����η� : ���ʶ��������ݵ�Ȩ�޷�Χ��С
 * 					������			ͬ����				��ͬ������(�̳�)		������
 * 	 private         ��
 *   default		 ��   			 ��
 *   protected       ��				 ��	`					��
 *   public          ��				 ��	`					��				 ��
 *  
 *  1.Ȩ�����η��ǳ�Ա���η�,ֻ���������γ�Ա,�������ξֲ�
 *  2.default���γ�Ա��ʱ��ֻ����ʽ����,��Ϊ��Ĭ�ϵ�,������ʾ����
 *  3.ֻ��public,default(��ʽ����)�ܹ�������
 *  4.��public���ε�����һ��java�ļ���ֻ����һ��,����Ҫ�����ļ�����ͬ
 *  5.��private���ε����ݲ��ܱ��̳�
 *  6.���������ܱ��̳�
 *  7.��̬�����ݿ��Ա��̳�,ֻҪȨ�޹�
 *  
 *  ����̳и���,������ʹ�ø����еĳ�Ա
 */
public class Modifier {
	public static void main(String[] args) {
		Fu fu=new Fu();
		System.out.println("--->"+fu.d+"--->"+fu.pro+"--->"+fu.pub);
	}
}


