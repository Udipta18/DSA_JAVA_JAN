package slsiding_window;

public class sort_color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] nums= {2,1,2};
         print(nums);
         for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
        
	}
	
	public static void print(int[] nums) {
		int left=0;
		int right=nums.length-1;
		int mid=0;
		while(mid<=right) {
			if(nums[mid]==2) {
				reverse(nums,mid,right);
				right--;
			}
			else
			if(nums[mid]==0) {
				reverse(nums,mid,left);
				left++;
				mid++;
			}
			else {
				mid++;
			}
		}
	}
	
	public static void reverse(int[] nums,int i ,int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}

}
