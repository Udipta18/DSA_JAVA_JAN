package slsiding_window;

import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		 char c = sc.next().charAt(0);
		 remove(s,c);

	}
	
	public static void remove(String str,char ch)
	{
		char[] ch1=str.toCharArray();
		ArrayList<Character> li=new ArrayList<>();
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch) {
				li.add(ch1[i]);
			}
		}
		for(int i=0;i<li.size();i++)
		System.out.print(li.get(i));
	}
}
