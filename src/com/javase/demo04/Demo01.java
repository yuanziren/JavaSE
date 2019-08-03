package com.javase.demo04;
/**  
	  
*/
public class Demo01{ 
	//锟斤拷锟斤拷锟斤拷锟斤拷
	public static void main(String[] args){
		boolean flag=true;
		int num;
		if(flag==true){
			num=1;
		}else if(flag==false){
			num=0;
		}
		switch(flag+""){
			case "true":
			
		}
		
		boolean m = false;
		if(m = false){
			System.out.println("false");
		}else{
			System.out.println("true");
		}

		char x=100;
		switch(x) {
			case 100 :
				System.out.println("One hundred");
				break;
			case 200 :              
				System.out.println("Two hundred");                 
				break;
			case 300 :
				System.out.println( "Three hundred");
				break;
			default :
				System.out.println( "default");    
		}
		
		for(int i=0;i<10;i++){
			if (i%2!=0) 
				return; //锟斤拷锟斤拷锟斤拷锟斤拷
			System.out.print(i);
		}
		
		if(1==1){
			System.out.print("hhhh");
		}



	}
}
