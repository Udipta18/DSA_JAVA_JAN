package slsiding_window;
import java.util.*;
public class non_repeating_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(print(str));

	}

	public static int print(String str) {
		int si=0;
		int ei=0;
		int[] arr=new int[256];
		int ans=0;
		
		while(ei<str.length()) {
			
			char ch=str.charAt(ei);
			arr[ch]+=1;
			
			while(arr[ch]>1) {
				char c=str.charAt(si);
				arr[c]-=1;
				si++;
			}
			
			ans=Math.max(ans, ei-si+1);
			
			ei++;
		}
		
		return ans;
	}
}
