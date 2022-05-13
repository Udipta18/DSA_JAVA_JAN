package slsiding_window;
import java.util.*;
public class palindrome_partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		List<String> li=new ArrayList<>();
		List<List<String>> li1=new ArrayList<>();
		print(str,li,li1);
				
				
				

	}
	
	public static void print(String str,List<String> li,List<List<String>> li1) {
		
		
		if(str.length()==0){
			li1.add(new ArrayList<>(li));
		}
		
		for(int i=1;i<=str.length();i++) {
			String s=str.substring(0,i);
			if(isPalindrome(s)) {
				li.add(s);
				print(str.substring(i), li, li1);
				li.remove(li.size()-1);
			}
		}
	}
	
	public static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		return true;
	}

}
