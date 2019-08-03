package com.javase.array;
/*
 * ��������
	ð������  ѡ������
	ѡ������Ч�ʽϸ�
	
 */
public class ArraySort07 {
	public static void main(String[] args){
		int[] arr={5,2,7,8,3};	
		int[] arr1=bubble(arr);
		//print(choice(arr));
		//print(choice2(arr));
		
		print(arr1);
		//����������   ð������
		System.out.println(search(arr1,7));
		
	}
	/*
		ǰ��:����������
		���ַ� ����   �ҵ�ָ�������������е����������� ���û�ҵ�����-1
	*/
	public static int search(int[] arr,int value){
		//��С��Χ����
		int min=0;
		//������ݵ�����
		int max=arr.length-1;
		//�м�λ������
		int mid=(min+max)/2;
		
		while(value!=arr[mid]){
			if(value>arr[mid]){
				min=mid+1;
			}else{
				max=mid-1;
			}
			if(min>max){
				return -1;
			}
			
			mid=(min+max)/2;
		}
		
		return mid;
	}
	
	
	/*
		ѡ������:ÿһ��ȷ��һ����������,��������ݺ��������ÿһ������ȥ�Ƚ�,�����������н���,����������������
		int[] arr={5,2,7,8,3};
		��һ��: ����Ϊ0λ����Ϊ����   8,2,5,7,3
		�ڶ���: ����Ϊ1λ����Ϊ����     7,2,5,3
		������: ����Ϊ2λ����Ϊ����       5,2,3
		������: ����Ϊ3λ����Ϊ����         3,2
		һ����arr.length������,�Ƚ�  arr.length-1��   i :0~arr.length-2
	*/
	public static int[] choice(int[] arr){
		//���ѭ��i��������,ÿһ������Ϊ�������ݵ�������
		for(int i=0;i<arr.length-1;i++){
			//���������ݱȽϵ��������ݵ������仯��Χ
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i] < arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	/*
		�Ż��汾ѡ������:
			ÿһ�����ֻ����һ��,�ҵ���С�Ļ������Ľ��н���
			����һ���м����,�����洢��һ�����ҵ�������|��С��ֵ������
	*/
	public static int[] choice2(int[] arr){
		//���ѭ��i��������,ÿһ������Ϊ�������ݵ�������
		for(int i=0;i<arr.length-1;i++){
			//���������ݱȽϵ��������ݵ������仯��Χ
			int max=i;  //����ÿһ����Ϊ�������ݶ�������
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[max] < arr[j]){
					max=j;
				}
			}
			
			if(max!=i){
				int temp=arr[i];
				arr[i]=arr[max];
				arr[max]=temp;
			}
		}
		return arr;
	}
	
	/*
		ð������:ÿ��������֮����бȽ�һ��,�ҳ����Ļ�����С�Ľ��н���   ������
		int[] arr={5,2,7,8,3};	
		��һ��: 2,5,7,3,8   �Ƚϳ��������ݷ���������λ��		i=0
		�ڶ���: 2,5,3,7												i=1
		������: 2,3,5												i=2
		������: 2,3													i=3
		
		��һ���в���Ƚ����ݵĸ���  arr.length-i
	*/
	public static int[] bubble(int[] arr){
		//���ѭ�� i���ƱȽ�����
		for(int i=0;i<arr.length-1;i++){
			//m ÿһ����,ÿ�������ݱȽ�,��ǰ�����ݵ�����   m,m+1����������λ�õ����ݽ��бȽ�
			for(int m=0;m<arr.length-i-1;m++){
				if(arr[m] > arr[m+1]){
					int temp=arr[m];
					arr[m]=arr[m+1];
					arr[m+1]=temp;
				}
			}
		}
		return arr;
	}
	
	
	//����int����
	public static void print(int[] arr){
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
