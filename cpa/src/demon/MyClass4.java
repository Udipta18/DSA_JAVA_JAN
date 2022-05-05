package demon;
import java.util.*;
public class MyClass4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int number=sc.nextInt();
  int c=1;
  int odd1=0;
  int even2=0;
    while(number>0) {
    	int das=number%10;
    	 if(c%2==0) {
    		 odd1+=das;
    	 }
    	 else {
    		 even2+=das;
    	 }
    	 number=number/10;
    	 c++;
    	 
	}
    
    if(odd1==even2) {
    	System.out.println("Sum are equal");
    }
    else {
    	System.out.println("Sum are not equal");
    }

}
}