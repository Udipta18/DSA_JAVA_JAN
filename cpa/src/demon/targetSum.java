package demon;
import java.util.*;
public class targetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int j=0;j<testcase;j++) {
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=sc.nextInt();
    	  
      }
      
      int target=sc.nextInt();
      findingPair(arr,target);
      
      }
      
      sc.nextLine();
	}
	
	
	public static void findingPair(int[] arr,int sum) {
		
		Arrays.sort(arr);
		
		int i=0;
		int l=arr.length-1;
		int a=0;
		int b=0;
		while(i<l) {
			if((arr[i]+arr[l])==sum) {
				//print(arr[i],arr[l]);
				int min=Integer.MAX_VALUE;
				int diff=Math.abs(arr[i]-arr[l]);
				
				if(diff<min) {
					min=diff;
					a=i;b=l;
				}
				
				i++;l--;
			}
			else
				if((arr[i]+arr[l])>sum) {
				l--;}
				else {
					i++;
				}
		
		}
		System.out.println();
		System.out.println("Deepak should buy roses whose prices are "+arr[a]+" and "+arr[b]);
	}
	
	/*
	 * public static void print(int i,int l) { //System.out.println(i+" and "+l);
	 * 
	 * }
	 */

}
