package com.javase.array;
/*
 * 测试Java中的二维数组
	数组中嵌套数组
	
	二维数组的声明:
		数据类型[][] 数组名; --推荐使用
		数据类型 数组名[][];
		数据类型[] 数组名[];
		
	二维数组的创建:
		数据类型[][] 数组名=new 数据类型[一维的长度][二维的长度];
		数据类型[][] 数组名=new 数据类型[一维的长度][];
			数组名[一维的索引]=new 数据类型[二维的长度];  --创建一维数组的方式都可以
		数据类型[][] 数组名=new 数据类型[][]{{1,2},{1,2,3},{1},{1,2,3,4}};
		
	二维数组的遍历:
		双重for循环
 */
public class Array04 {
	public static void main(String[] args){
		
		int[][] arr=new int[3][2];
		System.out.println(arr[2][0]);
		
		String[][] arr2=new String[3][];
		arr2[0]=new String[]{"你","好"};
		arr2[1]=new String[]{"你","好","小","盆","友"};
		arr2[2]=new String[]{"小","盆","友"};
		//arr2[1]={"你","好","小","盆","友"};  简略写法不可以
		System.out.println(arr2[1][3]);
		
		int[][] arr3=new int[][]{{1,2},{1,2,3},{1},{1,2,3,4}};
		System.out.println(arr3[1][0]);
		
		int[][] arr4={{1,2},{1,2,3},{1},{1,2,3,4}};
		System.out.println(arr4[3][3]);
		
		//普通for遍历二维数组  
		//外层循环变量i是外层一维数组的索引
		for(int i=0;i<=arr4.length-1;i++){
			//int[] newarr=arr4[i];
			/*
			for(int j=0;j<=arr4[i].length-1;j++){
				System.out.println(arr4[i][j]);
			}
			*/
			for(int a:arr4[i]){
				System.out.println(a);
			}
		}
		
		//增强  //外层for循环遍历二维数组中的外层一维数组
		for(String[] str:arr2){
			for(String s:str){
				System.out.println(s);
			}
		}
		
	}
	
	
}
