package com.javase.demo;
/**  
	����java�е�ת���ַ�
		��Щ�ַ���java�������⺬��,�������Ҫ����Щ�ַ���ʾ����ĺ���,����ʹ��ת���ַ� 
		ת���ַ��ӷ�б�ܿ�ʼ\
		\+Ҫת����ַ�
		
		\'
		\"
		\\
		
		\t �Ʊ��  һ���������Ʊ����8���ո�,��ǰ��������Ƿ�����һ�����Ʊ��λ,�������,���¿�һ���Ʊ��λ,���������,��ȫ��һ�����Ʊ��λ
			һ������2���ո�,һ��Ӣ����һ���ո�
		\n ���� ��ln���� �ѹ�����һ�е���β������һ�е�����
		\b �˸�|��ɾһ��(\b�������ݸ���ǰ������)
		\r �ص�����
*/
public class ESCDemo09{   

	public static void main(String[] args){
		System.out.println("\"");
		System.out.println('\'');
		System.out.println('\\');
		
		System.out.println("�Ϻ���ѧ��\t���!!!");
		System.out.println("�Ϻ�\t��ѧ�����!!!");
		System.out.println("\t�Ϻ���ѧ�����!!!");
		System.out.println("�Ϻ���ѧ�����!!!");
		System.out.println("�Ϻ���ѧ��\n���!!!��");
		System.out.println("�Ϻ���ѧ��\b���!!!��");
		System.out.println("�Ϻ���ѧ�����!!!��\b��");
		System.out.println("�Ϻ���ѧ�����!!!\r���");
	}

}
