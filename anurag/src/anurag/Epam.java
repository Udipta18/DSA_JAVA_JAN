package anurag;
import java.util.*;
public class Epam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     
     int n=sc.nextInt();
     int city=sc.nextInt();
     int[] arr=new int[n];
     while(city-- >0) {
    	 int start=sc.nextInt();
    	 int last=sc.nextInt();
    	 int num=sc.nextInt();
    	 for(int i=(start-1);i<=(last-1);i++) {
    		 arr[i]+=num;
    	 }
     }
     
       Arrays.sort(arr);
       System.out.println(arr[n-1]);
	}

}


