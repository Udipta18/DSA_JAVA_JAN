package java2;
import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int c=0;
      String str=sc.nextLine();
      for(int i=0;i<str.length();i++) {
    	  if(str.charAt(i)==' ') {
    		  c++;
    	  }
    	  
      }
      if(c>0) {
		  System.out.println(c);
	  }
	  else
		  System.out.println("No Spaces");
	}

}
