package com.javase.demo03;
/**  
	 ����java�е�break��continue
		break:
			����: ��ֹѭ��
			Ӧ�ó���:switch����ѭ�������
		continue:
			����:��������ѭ��,ֱ�ӽ��뵽��һ��ѭ��
			Ӧ�ó���:ѭ�����
*/
public class Demo07{ 
	//��������
	public static void main(String[] args){
		//��ӡ1~10֮�����,����3����3�ı���������
		for(int i=1;i<=10;i++){
			if(i%3==0){
				continue;
			}
			System.out.println(i);
		}
		int j=5;
		while(true){
			if(j==7){
				break;
			}
			System.out.println(j++);
		}
		
		//���Ĵ���
		//�����  [1,50]
		int ran=(int)(Math.random()*(50-1+1)+1);
		System.out.println(ran);
		int num=0;
		while(true){
			num++;
			if(ran==num){
				System.out.println("��Ϸ������,����ѧ��Ϊ"+num+"��ѧ����̨���ݽ�Ŀ");
				break;
			}
		}
		
		//��ӡ10~50֮��ǰ����ܱ�5��������
		int count=0;
		for(int i=10;i<=50;i++){
			if(i%5==0){
				System.out.println(i);
				count++;
				if(count==5){
					break;
				}
			}
		}
		
		for(int i=1;i<=10;i++){
			if(i%2==0){
				// ��ȫ����  
				//continue; //��ӡ5��
				//��ӡһ��
				break;
			}
			System.out.println("�Ϻ���ѧ�����!!!");
		}
		
		//��ϰ
		//A: �������Сд��ĸ,�ж��ǲ���Ԫ��  Ԫ��:aeiou
		//B: �������4��6�����1~10֮�����
	}
}
