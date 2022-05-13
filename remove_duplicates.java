package slsiding_window;

public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		   int[] nums= {0,0,1,1,1,2,2,3,3,4};
		    
		 System.out.println(print(nums)); 
		
	}
	
	public static int print(int[] nums) {
		int i=0;
		for(int j=1;j<nums.length;j++) {
			if(nums[j]!=nums[j-1]) {
				i++;
				nums[i]=nums[j];
			}
		}
		
		return i+1;
	}

}
