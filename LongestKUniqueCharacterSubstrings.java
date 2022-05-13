package slsiding_window;
import java.util.*;
public class LongestKUniqueCharacterSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-- >0) {
			 String str=sc.next();
		     int n=sc.nextInt();
		     System.out.println(print(str,n));
		}

	}
	
	public static int print(String str,int n) {
		int ei=0;
		int si=0;
		int ans=-1;
		int unique_count=0;
		int[] arr=new int[256];
		
		while(ei<str.length()) {
			
			char ch=str.charAt(ei);
			if(arr[ch]==0) {
				unique_count++;
			}
			
			arr[ch]=arr[ch]+1;
			
			while(unique_count>n) {
				char c=str.charAt(si);
				arr[c]-=1;
				if(arr[c]==0) {
					unique_count--;
				}
				
				si++;
			}
			
			if(unique_count==n)
			ans=Math.max(ans, ei-si+1);
			
			
			ei++;
		}
		
		return ans;
	}

}
