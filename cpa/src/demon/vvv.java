package demon;
import java.util.*;

public class vvv {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		
		int n=sc1.nextInt();
		
		int temp=n;
		int count=0;
		while(temp>0) {
			int n1=temp%10;
			count++;
			temp/=10;
		}
		
		 
		int[] arr1=new int[count+1];
		int[] arr2=new int[count+1];
		
		for(int i=1;i<=count;i++) {       
			int rem=n%10;
			arr1[i]=rem;
			n=n/10;
		}
	
		for(int i=1;i<=count;i++) {
			int num=arr1[i];
			arr2[num]=i;
		}
		
		for(int i=count;i>=1;i--) {
			System.out.print(arr2[i]);
		}
		
		/*
		 * for(int i=0;i<5;i++) { System.out.print(arr[i]); }
		 */
	}

}
public static Student searchStudentByAge(Student[] st,int age) {
	 Student st2=null;
	 for(int i=0;i<st.length;i++) {
		 if(st[i].getAge()==age) {
			 st2=st[i];
		 }
	 }
	 return st2;
}
