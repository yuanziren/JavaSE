package com.javase.day11.innerclass02;
/*
 * �����ڲ���
 * 	Ϊ�˼򻯴���,ʵ��������û��ʹ�ö�ε����,����ʹ�������ڲ����
 */
public class Demo {
	public static void main(String[] args) {
		//Car car=new Car();
		new Impl().run();
		
		System.out.println("====================");
		//�����ڲ���
		//1.û������ָ�� ֱ�ӵ���,��������
		new Car(){  //�����ڲ��������,�������û������  Car�����ڲ���ʵ�ֵĽӿ�
			@Override
			public void run() {
				System.out.println("3����ꤵ���ɯ����...");
			}
		}.run();
		System.out.println("====================");
		Car car2 = new Car() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("4����ꤵ���ɯ����...");
			}
		};
		car2.run();
		System.out.println("====================");
		
		//2.����ָ��  ��̬  ��ε���
		Smoking s=new Smoking() {
			
			@Override
			public void smoke() {
				System.out.println("�߳�������...");
			}

			@Override
			public void toSmokeCircle() {
				System.out.println("�����ε���Ȧ...");
			}
		};
		s.smoke();
		s.toSmokeCircle();
		
		//��̬
		Car car=new Impl();
		
		Zi zi=new Zi();
		
		Smoking ss=new Smoking(){

			@Override
			public void smoke() {
			}

			@Override
			public void toSmokeCircle() {
				System.out.println("���ô���߳���...");
			}
			
		};
		
		//3. �����ڲ���  ���������Ĳ���ʹ��
		test(new Smoking(){
			@Override
			public void smoke() {
			}

			@Override
			public void toSmokeCircle() {
				System.out.println("���ô���߳���...");
			}
		});
	}
	
	//�����ڲ��������Ϊ�����Ĳ���
	public static void test(Smoking s){  //��̬����
		s.toSmokeCircle();
	}
	
}

//ʵ����  Impl
class Impl implements Car{
	@Override
	public void run() {
		System.out.println("2����ꤵ���ɯ����...");
	}
	
}

//�ӿ�
interface Car{
	void run();
}

class Zi extends Smoking{

	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toSmokeCircle() {
		System.out.println("������������������");
	}
	
}
abstract class Smoking{
	public abstract void smoke();
	public abstract void toSmokeCircle();
}
