package com.javase.day09.work01;

public class Test {
	public static void main(String[] args) {
		Cate cate1=new Cate(1,"ϴ��ˮ");
		Cate cate2=new Cate(2,"Ⱦ����");
		Cate cate3=new Cate(3,"������");
		Goods goods=new Goods();
		goods.setName("����400ml");
		goods.setCate(cate1);
		
		goods.test();
		System.out.println(goods.getCate());;
	}
}

class Goods{
	private String name;
	//���
	private Cate cate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cate getCate() {
		return cate;
	}
	public void setCate(Cate cate) {
		this.cate = cate;
	}
	
	public Goods() {
	}
	
	public void test(){
		System.out.println(name);
		System.out.println(cate.getName());
		System.out.println(cate.getNum());
	}
}

//��Ʒ�����
class Cate{
	private int num;
	private String name;
	
	public Cate(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public Cate() {
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cate [num=" + num + ", name=" + name + "]";
	}
	

}