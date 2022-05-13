package slsiding_window;

public class remove_duplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] nums= {0,0,1,1,1,1,2,3,3};
     System.out.println(print(nums));
	}
	
	public static int print(int[] nums) {
		int i=0;
		int length=0;
		for(int j=1;j<=nums.length;j++) {
			int no=nums[j-1];
			int count=0;
			while(j<nums.length && nums[j]==nums[j-1]) {
				j++;
				count++;
			}
			length=Math.min(2, count+1);
			while(length-->0) {
				nums[i]=no;
				i++;
			}
		}
		
		return i;  
	}

}
