package com.javase.demo02;
/**  
	����java�е����������
		�Ƚϱ��ʽ?ֵ1:ֵ2;
		
		1.�Ƚϱ��ʽ  ֵΪboolean���͵ı��ʽ
		2.������Ϊtrue,ȡֵ1
		3.������Ϊfalse,ȥȡֵ2
		
*/
public class Operator07{ 
	//��������
	public static void main(String[] args){
		int a=11;
		System.out.println(a>0?"����0":"������0");
		
		//�ж����ֵ�Ƿ�Ϊż��  �ܱ�2����  %2==0
		String str=a%2==0?"ż��":"����";
		System.out.println(str);
	}
}
