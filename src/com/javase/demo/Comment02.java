package com.javase.demo;
//单行注释
/*多行注释*/
/**文档注释*/
/**  
	1.什么是注释?
		解释说明的文字
	2.为什么要使用注释?
		对程序的解释说明
		便于后期维护
	3.注释的分类:
		单行注释
			作用域:只在当前行有效
			嵌套:可以嵌套单行注释,不可以嵌套多行注释和文档注释
			颜色:绿色
			位置:行的上面或者行尾
		多行注释
			作用域:多行有效
			嵌套:/*可以嵌套单行注释,不可以嵌套多行注释和文档注释
			颜色:绿色
			位置:类的上面或者方法的上面
		文档注释
			作用域:多行有效
			嵌套:可以嵌套单行注释,不可以嵌套多行注释和文档注释
			颜色:蓝黑色
			位置:类的上面或者方法的上面
			文档注释可以存在于生成的对应的类的API文档中
	注意:在注释中不要写无关紧要的内容
		 注释的内容不会被编译
*/
public class Comment02{   //类体
	//程序的入口/**逐行执行主方法中的代码*/
	public static void main(String[] args){
		
	}
}
