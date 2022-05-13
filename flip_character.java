package slsiding_window;

import java.util.*;

public class flip_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String str=sc.next();
		int flipa=flip(str,k,'a');
		int flipb=flip(str,k,'b');
		System.out.println(Math.max(flipa, flipb));
	}
	
	public static int flip(String str,int k,char ch) {
		int ei=0;
		int si=0;
		int flip=0;
		int ans=0;
		
		while(ei<str.length()) {
			
		     if(str.charAt(ei)==ch) {
		    	 flip++;
		     }
		     
		     while(flip>k && si<=ei) {
		    	 if(str.charAt(si)==ch) {
		    		 flip--;
		    	 }
		    	 si++;
		     }
		     
		     
		     ans=Math.max(ans, ei-si+1);
		     
		     ei++;
		}
		
		return ans;
	}

}
