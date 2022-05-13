package slsiding_window;
import java.util.*;
public class subset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2};
		Arrays.sort(nums);
		List<Integer> li=new ArrayList<>();
        List<List<Integer>> li1=new ArrayList<>(); 
        print(nums,0,li,li1);
       // return li1;
        System.out.println(li1);

	}
	
	 public static void print(int[] nums,int idx, List<Integer> li, List<List<Integer>> li1){
	        
	        li1.add(new ArrayList<>(li));
	        
	        //print(nums,idx+1,li,li1);
	        
	        for(int i=idx;i<nums.length;i++) {
	        	if(i!=idx && nums[i]==nums[i-1])
	        		continue;
	        	li.add(nums[i]);
		        print(nums,i+1,li,li1);
		        li.remove(li.size()-1);
	        }
	        
	    }

}
