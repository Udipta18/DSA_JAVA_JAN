package slsiding_window;
import java.util.*;

public class digital_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		print(arr,target);

	}
	
	public static void print(int[] arr,int target) {
		int si=0;
		int ei=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				 si=i;
				 ei=i;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==target) {
						ei++;
					}
					else {
						
						break;
					}
				}
				
				break;
			}
		}
		if(si==0 )
			System.out.println("Not found");
		else
		System.out.println(si+" "+ei);
	}

}
