package com.javase.demo02;/**  
	����java�е��߼������
		�߼�������������ߵĲ�����������ֵΪboolean�ı��ʽ
		& ��   �������������һ��false,�����Ϊfalse
		| ��   ֻҪ��һ��Ϊtrue����true,������Ϊfalse����false
		! ��   ȡ��  !true  !false
		^ ���  ������������ͬΪfalse��ͬΪtrue
		
		�߼�����&,|һ��,�ж�·������:���ǰ��Ľ�����ܹ��������ձ��ʽ�Ľ��,����Ľ�����ִ��
		&& �������������һ��false,�����Ϊfalse
		|| ֻҪ��һ��Ϊtrue����true,������Ϊfalse����false
		�Ƽ�ʹ�ö�·��,���·��
		
*/
public class Operator06{ 
	//��������
	public static void main(String[] args){
		System.out.println("-------&---------");
		System.out.println(true & true);  //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		System.out.println("-------|---------");
		System.out.println(true | true);  //true
		System.out.println(true | false); //true
		System.out.println(false | true); //true
		System.out.println(false | false); //false
		
		System.out.println("-------!---------");
		System.out.println(!true);  //false
		System.out.println(!false); //true
		
		System.out.println("-------^---------");
		System.out.println(true ^ true);  //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(false ^ false); //false
		
	}
}
