package com.javase.day11.innerclass02;
/*
 * 匿名内部类
 * 	为了简化代码,实现类子类没有使用多次的情况,可以使用匿名内部类简化
 */
public class Demo {
	public static void main(String[] args) {
		//Car car=new Car();
		new Impl().run();
		
		System.out.println("====================");
		//匿名内部类
		//1.没有引用指向 直接调用,用完销毁
		new Car(){  //匿名内部类的类体,这个类体没有名字  Car匿名内部类实现的接口
			@Override
			public void run() {
				System.out.println("3个轱辘的玛莎在跑...");
			}
		}.run();
		System.out.println("====================");
		Car car2 = new Car() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("4个轱辘的玛莎在跑...");
			}
		};
		car2.run();
		System.out.println("====================");
		
		//2.引用指向  多态  多次调用
		Smoking s=new Smoking() {
			
			@Override
			public void smoke() {
				System.out.println("边唱歌变抽烟...");
			}

			@Override
			public void toSmokeCircle() {
				System.out.println("吐心形的烟圈...");
			}
		};
		s.smoke();
		s.toSmokeCircle();
		
		//多态
		Car car=new Impl();
		
		Zi zi=new Zi();
		
		Smoking ss=new Smoking(){

			@Override
			public void smoke() {
			}

			@Override
			public void toSmokeCircle() {
				System.out.println("边敲代码边抽烟...");
			}
			
		};
		
		//3. 匿名内部类  当做方法的参数使用
		test(new Smoking(){
			@Override
			public void smoke() {
			}

			@Override
			public void toSmokeCircle() {
				System.out.println("边敲代码边抽烟...");
			}
		});
	}
	
	//匿名内部类可以作为方法的参数
	public static void test(Smoking s){  //多态接收
		s.toSmokeCircle();
	}
	
}

//实现类  Impl
class Impl implements Car{
	@Override
	public void run() {
		System.out.println("2个轱辘的玛莎在跑...");
	}
	
}

//接口
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
		System.out.println("啦啦啦啦啦啦啦啦啦");
	}
	
}
abstract class Smoking{
	public abstract void smoke();
	public abstract void toSmokeCircle();
}
