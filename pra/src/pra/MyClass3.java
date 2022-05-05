package pra;
import java.util.*;
public class MyClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int temp=a;
   int sum=0;
   
     while(a>0) {
    	 int b=a%10;
    	 int c=(int)Math.pow(b,3);
    	 sum+=c;
    	 a=a/10;
    	 
     }
     if(sum==temp && temp%2==0) {
    	 System.out.println("True");
     }
     else
    	 System.out.println("False");
	}

}
