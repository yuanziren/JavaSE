package com.javase.demo;
/**  
	测试java中的转义字符
		有些字符在java中有特殊含义,如果你想要让这些字符表示本身的含义,可以使用转义字符 
		转义字符从反斜杠开始\
		\+要转义的字符
		
		\'
		\"
		\\
		
		\t 制表符  一个完整的制表符是8个空格,看前面的内容是否满足一整个制表符位,如果满足,重新开一个制表符位,如果不满足,补全成一整个制表符位
			一个中文2个空格,一个英文是一个空格
		\n 换行 与ln很像 把光标从这一行的行尾换到下一行的行首
		\b 退格|回删一格(\b后面内容覆盖前面内容)
		\r 回到行首
*/
public class ESCDemo09{   

	public static void main(String[] args){
		System.out.println("\"");
		System.out.println('\'');
		System.out.println('\\');
		
		System.out.println("上海尚学堂\t真棒!!!");
		System.out.println("上海\t尚学堂真棒!!!");
		System.out.println("\t上海尚学堂真棒!!!");
		System.out.println("上海尚学堂真棒!!!");
		System.out.println("上海尚学堂\n真棒!!!啊");
		System.out.println("上海尚学堂\b真棒!!!啊");
		System.out.println("上海尚学堂真棒!!!啊\b好");
		System.out.println("上海尚学堂真棒!!!\r你好");
	}

}
