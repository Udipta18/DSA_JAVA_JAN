package java1;
import java.util.*;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {4,6,7,9,0};
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
        	if(i+1!=arr.length) {
			int a=Math.abs(arr[i]-arr[i+1]);
			list.add(a);
        	}
		}
        
        Collections.sort(list);
        int diff=list.get(0);
        
        for (int i = 0; i < arr.length; i++) {
        	if(i+1!=arr.length) {
    			int a=Math.abs(arr[i]-arr[i+1]);
    			if(a==diff) {
    				System.out.println(arr[i]+" "+arr[i+1]);
    			}
        	}
			
		}
	}

}
