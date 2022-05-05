import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          String a=sc.nextLine();
          String b=sc.nextLine();
			/*
			 * ueoghe ->String stalls ego ->String bet
			 */
			/*
			 * tplrqcnt tnc
			 */
          String ans="";
          int j=0;
          int i=0;
        	    while(j<a.length() && i<b.length()) {
        	    	char w=a.charAt(j);
        	    	char q=b.charAt(i);
        		  if(a.charAt(j)==b.charAt(i)) {
        			  ans+=b.charAt(i);
        			  i++;
        			  j++;
        		  }else {
        		  j++;
        		  }
        	  }
          
          
          if(ans.equals(b)) {
        	  System.out.println("win");
          }
          else {
        	  System.out.println("lose");
          }
	}

}
