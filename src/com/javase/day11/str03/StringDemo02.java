package com.javase.day11.str03;

import java.util.Arrays;

/*
 * String
	����:
		****char charAt(int index)  ����ָ���������� char ֵ�� *****
		int codePointAt(int index) ����ָ�����������ַ���Unicode ����㣩�� 
		int codePointBefore(int index) ����ָ������֮ǰ���ַ���Unicode ����㣩�� 
		****int compareTo(String anotherString)  ���ֵ�˳��Ƚ������ַ�����**** 
		int compareToIgnoreCase(String str)  ���ֵ�˳��Ƚ������ַ����������Ǵ�Сд�� 
		****concat(String str) ��ָ���ַ������ӵ����ַ����Ľ�β��****
		boolean contains(CharSequence s)  ���ҽ������ַ�������ָ���� char ֵ����ʱ������ true�� 
		static String copyValueOf(char[] data) ����ָ�������б�ʾ���ַ����е� String�� 
		boolean endsWith(String suffix)   ���Դ��ַ����Ƿ���ָ���ĺ�׺������ 
		boolean startsWith(String prefix)   ���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ�� 
		equals(Object anObject) �����ַ�����ָ���Ķ���Ƚϡ� 
 		boolean equalsIgnoreCase(String anotherString)  ���� String ����һ�� String �Ƚϣ������Ǵ�Сд�� 
		byte[] getBytes() ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte �����С� 
 		byte[] getBytes(String charsetName)  ʹ�ø����� charset ���� String ���뵽 byte ���У���������洢���µ� byte ���� 
		void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) ���ַ��Ӵ��ַ������Ƶ�Ŀ���ַ����顣 
		int indexOf(String str)   ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ��������� 
		int indexOf(String str)   ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ��������� 
 * 		int lastIndexOf(String str) ����ָ�����ַ����ڴ��ַ��������ұ߳��ִ��������� 
 * 		int length() ���ش��ַ����ĳ��ȡ� 
 * 		String replace(char oldChar, char newChar) ����һ���µ��ַ���������ͨ���� newChar �滻���ַ����г��ֵ����� oldChar �õ��ġ� 
 		String substring(int beginIndex)  ����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ����� 
 		String substring(int beginIndex, int endIndex)  ����һ�����ַ��������Ǵ��ַ�����һ�����ַ����� 
		char[] toCharArray()  �����ַ���ת��Ϊһ���µ��ַ����顣 
		String trim()      �����ַ����ĸ���������ǰ���հ׺�β���հס�
 *		static String valueOf(boolean b)   ���� boolean �������ַ�����ʾ��ʽ�� 
 * 		String toLowerCase()    ʹ��Ĭ�����Ի����Ĺ��򽫴� String �е������ַ���ת��ΪСд��
 * 		String toUpperCase() ʹ��Ĭ�����Ի����Ĺ��򽫴� String �е������ַ���ת��Ϊ��д��  
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String str="shsxtverygood";
		String str1="Shsxtverygood";
		//char charAt(int index)  ����ָ���������� char ֵ�� 
		System.out.println("charAt():"+str.charAt(3));
		//int codePointAt(int index) ����ָ�����������ַ���Unicode ����㣩��
		System.out.println("codePointAt():"+str.codePointAt(3));
		//int codePointBefore(int index) ����ָ������֮ǰ���ַ���Unicode ����㣩�� 
		System.out.println("codePointBefore():"+str.codePointBefore(3));
		//int compareTo(String anotherString)  ���ֵ�˳��Ƚ������ַ����� 
		System.out.println("compareTo():"+str.compareTo(str1));
		//int compareToIgnoreCase(String str)  ���ֵ�˳��Ƚ������ַ����������Ǵ�Сд�� 
		System.out.println("compareToIgnoreCase():"+str.compareToIgnoreCase(str1));  //0
		//concat(String str) ��ָ���ַ������ӵ����ַ����Ľ�β��
		System.out.println("concat():"+str.concat(str1));  //0
		// boolean contains(CharSequence s)   ���ҽ������ַ�������ָ���� char ֵ����ʱ������ true�� 
		System.out.println("contains():"+str.contains("sssssxt"));  //0
		
		//static String copyValueOf(char[] data) ����ָ�������б�ʾ���ַ����е� String�� 
		System.out.println("copyValueOf():"+(String.copyValueOf(new char[]{'1','3','5'}).length()));  //135
		//boolean endsWith(String suffix)   ���Դ��ַ����Ƿ���ָ���ĺ�׺������
		System.out.println("endsWith():"+str.endsWith("good"));  //true
		
		//void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) ���ַ��Ӵ��ַ������Ƶ�Ŀ���ַ����顣
		char[] ch=new char[10];
		str.getChars(5, 9, ch, 2);
		System.out.println(Arrays.toString(ch));
		
		//int indexOf(String str)   ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ��������� 
		System.out.println("indexOf():"+str.indexOf("s"));  //0
		//int lastIndexOf(String str) ����ָ�����ַ����ڴ��ַ��������ұ߳��ִ���������
		System.out.println("lastIndexOf():"+str.lastIndexOf("s"));  //true
		//String replace(char oldChar, char newChar) ����һ���µ��ַ���������ͨ���� newChar �滻���ַ����г��ֵ����� oldChar �õ��ġ�
		System.out.println("replace():"+str.replace('s','S'));  //true
		System.out.println(str);
		//String[] split(String "") ���ݸ����ָ�����ƥ���ִ��ַ����� 
		String user="uanme=����";
		String[] arr=user.split("=");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);
		//String substring(int beginIndex, int endIndex)  ����һ�����ַ��������Ǵ��ַ�����һ�����ַ����� 
		System.out.println("substring():"+str.substring(2,5));  //true
		
		//char[] toCharArray()  �����ַ���ת��Ϊһ���µ��ַ����顣 
		char[] arrChar=str.toCharArray();
		System.out.println(arrChar);
		//String trim()      �����ַ����ĸ���������ǰ���հ׺�β���հס� 
		String str10="  zhangsan ";
		System.out.println(str10.trim());
		
		//static String valueOf(boolean b)   ���� boolean �������ַ�����ʾ��ʽ�� 
		System.out.println(String.valueOf(false).length());  //"false"
	}
}
