package com.javase.day11.innerclass02;
/*
 * jdk1.8������ Lambda���ʽ
 * 	Ŀ��:�������ڲ���
 * �﷨:
 * 	() -> {}
 * 	():���󷽷��Ĳ����б�
 *  ->: Lambda����,��ͷ����
 *  {}:���󷽷��ķ�����ʵ��
 *  
 *  Lambdaʹ��ǰ��:����ʽ�ӿ�
 *  ����ʽ�ӿ�:ֻ��һ�����󷽷��Ľӿ�
 *  ��⺯��ʽ�ӿ�:@FunctionalInterface
 */
public class LambdaDemo {
	public static void main(String[] args) {
		A a=new A(){
			@Override
			public void test() {
				System.out.println("�����ڲ���....");
			}
		};
		a.test();
		
		
		//1.д��
		A lambda=()-> {System.out.println("�����ڲ���....");};
		lambda.test();
		
		//2.�����󷽷��в���,�����������Ϳ���ʡ��
		//B b=c->{System.out.println("hehehhehee"+c);};
		
		//3.�����󷽷��в���ֻ��һ����ʱ��,ǰ���()����ʡ��,�������������
		//B b= (c,d) ->{System.out.println("hehehhehee"+c);};
		
		//4.�������з���ֵ,����ֻ��һ��return����ʱ��,return��ǰ��{}������ʡ��
		/*B b= (c,d) -> "����";
		System.out.println(b.test1(3, 5));*/
		
		//5.�����������ֻ��һ���ʱ��,ǰ���{}����ʡ��
		B b= (c,d) ->System.out.println("11111111111");
		System.out.println("22222");
	}
}

@FunctionalInterface
interface A{
	void test();
//	void test1();
}

interface B{
	void test1(int a,int b);
}