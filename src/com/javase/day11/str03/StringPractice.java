package com.javase.day11.str03;

/*
 * String
	方法:
		****char charAt(int index)  返回指定索引处的 char 值。 *****
		int codePointAt(int index) 返回指定索引处的字符（Unicode 代码点）。 
		int codePointBefore(int index) 返回指定索引之前的字符（Unicode 代码点）。 
		****int compareTo(String anotherString)  按字典顺序比较两个字符串。**** 
		int compareToIgnoreCase(String str)  按字典顺序比较两个字符串，不考虑大小写。 
		****concat(String str) 将指定字符串连接到此字符串的结尾。****
		boolean contains(CharSequence s)  当且仅当此字符串包含指定的 char 值序列时，返回 true。 
		static String copyValueOf(char[] data) 返回指定数组中表示该字符序列的 String。 
		boolean endsWith(String suffix)   测试此字符串是否以指定的后缀结束。 
		boolean startsWith(String prefix)   测试此字符串是否以指定的前缀开始。 
		equals(Object anObject) 将此字符串与指定的对象比较。 
 		boolean equalsIgnoreCase(String anotherString)  将此 String 与另一个 String 比较，不考虑大小写。 
		byte[] getBytes() 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。 
 		byte[] getBytes(String charsetName)  使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组 
		void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 将字符从此字符串复制到目标字符数组。 
		int indexOf(String str)   返回指定子字符串在此字符串中第一次出现处的索引。 
		int indexOf(String str)   返回指定子字符串在此字符串中第一次出现处的索引。 
 * 		int lastIndexOf(String str) 返回指定子字符串在此字符串中最右边出现处的索引。 
 * 		int length() 返回此字符串的长度。 
 * 		String replace(char oldChar, char newChar) 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 
 		String substring(int beginIndex)  返回一个新的字符串，它是此字符串的一个子字符串。 
 		String substring(int beginIndex, int endIndex)  返回一个新字符串，它是此字符串的一个子字符串。 
		char[] toCharArray()  将此字符串转换为一个新的字符数组。 
		String trim()      返回字符串的副本，忽略前导空白和尾部空白。
 *		static String valueOf(boolean b)   返回 boolean 参数的字符串表示形式。 
 * 		String toLowerCase()    使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
 * 		String toUpperCase() 使用默认语言环境的规则将此 String 中的所有字符都转换为大写。  
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
