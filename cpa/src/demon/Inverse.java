package demon;
import java.util.*;
public class Inverse {
	
	
	    public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc=new Scanner(System.in);
	        int  n1=sc.nextInt();
	        int[] arr=new int[n1];
	        int[] arr1=new int[n1];
	        for(int i=0; i<arr.length; i++){
	            arr[i]=sc.nextInt(); 
	        }
	        
	          reverse(arr,n1,arr1);
	          for(int ar:arr1){
	              System.out.print(ar+" ");
	          }
	    }

	    public static void reverse(int[] arr,int n1,int[] arr1){
	       for(int i=0;i<n1;i++){
	           int temp=arr[i];
	           arr1[temp]=i;
	       }
	    }
	}

