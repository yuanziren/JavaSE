package com.javase.demo02;
/**  
	����Ƚ��ַ��������Ƿ���Ⱦ�����equals
	�ַ���1.equals(�ַ���2)  ==>��������ַ�����ȷ���true,�������ȷ���false

	����java�е�switch��� :��ֵ�ж�
	
		switch(���ʽ){
			case ֵ1:
				�����1;
				break;
			case ֵ2:
				�����2;
				break;
				.....
			default:
				�����n;
				break;
		}
		
		ִ������:
			1,������ʽ
			2.��case���ֵ�Ƚ�,�����ֵ1���,��ִ�������1,����break����,�������ȼ������±Ƚ�
			3.��ֵ2�Ƚ�,��ִ�������2,����break����,�������ȼ������±Ƚ�
			.....
			4.�������������������,��ִ��default�е����� (default����ʡ��)
			
		
		
		���ʽ:һ����һ������
			  ���ʽ�Ľ������������,ֻ��Ϊbyte,short,int,char,ö��(1.5������),�ַ���(1.7����)
		break:�����дbreak,�ᷢ��case��͸,�ӵ�ǰ��������������忪ʼ,һ������ִ�����е������,�����ж��Ƿ���������,ֱ��������һ��break;���������Ľ���λ��
		default:λ�ÿ��Ըı�,����������λ��,һ��������
		
		switch��if֮�����ѡ��:
			switch:��ֵ�ж�
			if:�����ж�
		
*/
public class Switch13{ 
	//��������
	public static void main(String[] args){
		String s1="��Ϊ1";
		String s2="��Ϊ";
		System.out.println(s1.equals(s2));
		
		String flag="�ϵ�";
		switch(flag){
			default:
				System.out.println("�ټ�");
				break;
			case "���":
				System.out.println("���ͣһͣ");
				break;
			case "�̵�":
				System.out.println("�̵���");
				break;
			case "�Ƶ�":
				System.out.println("�ƵƵ�һ��");
				break;

		}
		
		int i=100;
		switch(i/10){
			case 1:
				System.out.println("1");
				System.out.println("...");
				break;
			case 10:
				System.out.println("10");
				break;
		}
		
		//---ʹ��switch���,��boolean���͵ı�������ֵ�ж�
		boolean b=false;
		
		
	}
}
