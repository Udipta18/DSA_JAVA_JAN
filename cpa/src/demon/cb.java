package demon;
import java.util.*;
public class cb{

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int n =sc.nextInt();
			int[] arr = new int[n];
			for(int i=0 ; i<arr.length ;i++) {
				arr[i] = sc.nextInt();
			}
			
	        System.out.println(maximum(arr));
		}
		public static int maximum(int[] arr) {
			int max = arr[0];
			for(int  i=1 ;i<arr.length ;i++) {
				if(arr[i]> max) {
					max = arr[i];
				}
			}
			return max;
		}
}