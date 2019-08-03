package com.javase.demo;
/**  
	测试java中的标识符
	什么是标识符:
		在java中一切起名字饿地方的名字都是标识符
		标识符的命名规则
			组成:数字,字母,下滑线_,美元符号$任意组合而成,数字不能开头
			严格区分大小写
			标识符不能使用关键字
			
		标识符的命名规范
			见名知意
			驼峰命名原则
				包:全部小写  
					单级包:就是一个包|文件夹   shangxuetang
					多级包: 使用.分隔级别      shang.xue.tang
				类|接口:每个单词的首字母大写 ShangXueTang
				方法|变量:第一个单词首字母小写,第二个单词开始每个单词的首字母大写  shangXueTang
				常量:全部大写 每个单词之间使用_分隔 SHANG_XUE_TANG
			
*/
public class Identifier03{   
	
	public static void main(String[] args){
		int a=3;
		int A=5;
		System.out.println(a);
		System.out.println(A);
	}
	
	public static void haha(){}
}
