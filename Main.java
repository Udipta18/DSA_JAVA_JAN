package slsiding_window;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tar=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		print(arr,tar);

	}
	
	public static void print(int[] arr,int tar) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
		         if(arr[i]==tar) {	
		        	 System.out.println(i);
		         }
		         
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr.length-2>=0) {
			if(tar<arr[i] && tar>arr[i-1]) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
}
