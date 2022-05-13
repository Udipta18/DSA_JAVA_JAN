package slsiding_window;

import java.util.*;
public class Combination_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int[] arr= {2,3,6,7};
        int tar=7;
        List<Integer> li=new ArrayList<>();
        List<List<Integer>> li1=new ArrayList<>();
        print(arr,tar,0,li,li1);
	}
	
	public static void print(int[] arr,int tar,int idx, List<Integer> li,List<List<Integer>> li1) {
		
		
		if(tar==0) {
			li1.add(new ArrayList<>(li));
			return;
		}
		
		for(int i=idx;i<arr.length;i++) {
			if(tar>=arr[i]) {
				li.add(arr[i]);
				print(arr, tar-arr[i], idx, li, li1);
				li.remove(arr[i]);
			}
		}
	}

}
