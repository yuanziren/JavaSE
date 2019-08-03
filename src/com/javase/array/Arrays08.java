package com.javase.array;
/*
 * Arrays 操作数组工具类  
	使用:
		1.导包
		2.Arrays.方法名(参数);
 */
 //1.导包
 import java.util.Arrays;
public class Arrays08 {
	public static void main(String[] args){
		int[] arr={5,2,7,8,3};
		int[] arr2={5,3,7,8,3};
		//1.static String toString(int[] a)  返回指定数组内容的字符串表示形式。 
		System.out.println(Arrays.toString(arr));
		
		//2.static boolean equals(int[] a, int[] a2)  如果两个指定的 int 型数组彼此相等，则返回 true。 
		//先比较长度,长度相同再比较内容
		System.out.println(Arrays.equals(arr,arr2));
		
		//3.static void sort(int[] a) 对指定的 int 型数组按数字升序进行排序。 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//4.static int binarySearch(int[] a, int key) 二分法查找   如果它包含在数组中，则返回搜索键的索引；否则返回 (-(插入点) - 1)
		System.out.println(Arrays.binarySearch(arr,10));  //-6
		
		String[] arr3={"因为","吴乐","王强","王涛","肖明"};
		//5.static <T> String[] copyOf(T[] original, int newLength) 复制指定的数组，截取或用 null 填充（如有必要），以使副本具有指定的长度。 
		System.out.println(Arrays.toString(Arrays.copyOf(arr3,3)));
		
		//6.static <T> String[]  copyOfRange(T[] original, int from, int to)  将指定数组的指定范围复制到一个新数组。  to结束位置索引取不到 
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr3,1,6)));
		
		boolean[] arr4=new boolean[6];
		System.out.println(Arrays.toString(arr4));
		
		//7.static void fill(boolean[] a, boolean val) 将指定的 boolean 值分配给指定 boolean 型数组的每个元素。 
		//Arrays.fill(arr4,true);
		//System.out.println(Arrays.toString(arr4));
		
		//8.static void fill(boolean[] a, int fromIndex, int toIndex, boolean val) 将指定的 boolean 值分配给指定 boolean 型数组指定范围中的每个元素。 
		//toIndex结束位置索引取不到
		Arrays.fill(arr4,1,3,true);
		System.out.println(Arrays.toString(arr4));
	}
}
