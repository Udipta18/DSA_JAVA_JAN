package slsiding_window;

public class smallest_letter_greater_than_target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch={'c','f','j'};
		char target='d';
		int ans=(print(ch,target));
		if(ans==-1) {
			System.out.println(ch[0]);
		}
		else {
			System.out.println(ch[ans]);
		}

	}
	
	public static int print(char[] letters,char target) {
		int lo=0;
		int hi=letters.length-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(letters[mid]<=target) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		
		return lo;
	}

}
