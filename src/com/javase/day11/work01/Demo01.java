package com.javase.day11.work01;
/*
 * Student: ����27��ͬѧ��ģ����
 */
public class Demo01 {
	public static void main(String[] args) {
		Teacher teacher=new Teacher("��Ϊ",18,"javase");
		Teacher teacher2=new Teacher("����",20,"javaweb");
		Student stu=new Student("����",19,teacher2);
		stu.study();
	}
}

class Student{
	private String name;
	private int age;
	
	static String School="��ѧ��";
	
	private Teacher teachername;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}	
	
	public Student(String name, int age, Teacher teachername) {
		super();
		this.name = name;
		this.age = age;
		this.teachername = teachername;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getSchool() {
		return School;
	}

	public static void setSchool(String school) {
		School = school;
	}

	/*public Teacher getTeachername() {
		return teachername;
	}

	public void setTeachername(Teacher teachername) {
		this.teachername = teachername;
	}*/

	//ѧϰ
	public void study(){
		teachername.teach();
	}
	
	
}

class Teacher{
	private String name;
	private int age;
	private String subject;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}



	public void teach(){
		System.out.println(name+"�����ʦ�ڴ���"+subject+"��֪ʶ");
	}

}