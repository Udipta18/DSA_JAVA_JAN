package slsiding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinationsum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		Arrays.sort(arr);
		List<Integer> li=new ArrayList<>();
        List<List<Integer>> li1=new ArrayList<>();
        print(arr,target,0,li,li1);

	}
	
	public static void print(int[] arr,int target,int idx,List<Integer> li, List<List<Integer>> li1) {
		
		
		
		for(int i=idx;i<arr.length;i++) {
			if(i!=idx && arr[i]==arr[i-1]) {
				continue;
			}
			
			if(target>=arr[i]) {
				li.add(target);
				print(arr,target-arr[i],idx+1,li,li1);
				li.remove(li.size()-1);
			}
			
			
		}
	}

}
