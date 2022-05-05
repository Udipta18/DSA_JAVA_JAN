package demon;
import java.util.*;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int testcase = sc.nextInt();
			for (int j = 0; j < testcase; j++) {
				int n = sc.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();

				}

				int target = sc.nextInt();
				
				findingPair(arr, target);

			}
	}
		

		public static void findingPair(int[] arr, int sum) {

//			Arrays.sort(arr); // no need 

			int minDiff = 0; // mindiff for tracing indexes with minimum difference
			int a = 0; // For storing indexes of our result
			int b = 0;

			for (int i = 0; i < arr.length; i++) {   // checking each pairs that is possible
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] + arr[j] == sum) {   // checking for the target sum
						if (arr[i] >= arr[j]) {        // storing the absolute min diff
							int diff = arr[i] - arr[j];
							if (diff < minDiff) {
								a = j;
								b = i;
								minDiff = diff;
							}
						} else {
							int diff = arr[j] - arr[i];
							if (diff < minDiff) {
								a = i;
								b = j;
								minDiff = diff;
							}
						}
					}
				}
			}
			// After iterating to each pairs and store required index in a and b
			System.out.println();
			System.out.println("Deepak should buy roses whose prices are " + arr[a] + " and " + arr[b] + ".");
		

	}

}

