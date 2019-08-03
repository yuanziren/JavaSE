package com.javase.day11.str03;

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
public class StringPractice {

	public static void main(String[] args) {
		String s1 = new String(" abc defg ");
		String s2 = new String("abcdef");
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('g'));
		System.out.println(s1.length());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,5));
		System.out.println(s1.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.replace('a', 'h'));
		System.out.println(s1);
		System.out.println(s1.replaceAll(s2,"ss"));
		System.out.println(s1);
		System.out.println(s2);
	}
}
