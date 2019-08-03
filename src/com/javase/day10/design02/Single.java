package com.javase.day10.design02;
/*
 * ��ʮ�������ģʽ
 * 	����ģʽ: ��֤�����ֻ�ܹ���һ������
 * 		����ʽ: ���һ�μ���ʱ,�ʹ�������        ---�̰߳�ȫ
 * 		����ʽ: ���ù��ܻ�ȡ����ʱ,�Ŵ������� ---�̲߳���ȫ
 * 
 *  1.������˽�л�
 *  2.�ṩһ��˽�е�,��̬�ĸ��������
 *  3.��̬�Ĺ����ķ��ʷ�ʽ
 *  
 *  ����ʽ:
 */
public class Single {
	//2.�ṩһ��˽�е�,��̬�ĸ��������
	private static Single single=null;
	
	//1.������˽�л�,�ⲿ����ʹ��
	private Single(){
		
	}
	
	//3.��̬�Ĺ����ķ��ʷ�ʽ
	// A  B  
	/*public synchronized static Single newInstance(){
		if(single==null){
			single=new Single();
		}
		return single;
	}*/
	public static Single newInstance(){
		if(single==null){
			// A B
			synchronized(Single.class){
				if(single==null){
					single=new Single();
				}
			}
		}
		return single;
	}
	
	public void haha(){
		System.out.println("hhhhhhhhhhhhhh");
	}
	
}
