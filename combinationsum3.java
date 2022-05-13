package slsiding_window;

import java.util.ArrayList;
import java.util.List;

public class combinationsum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] bl=new boolean[9];
		int nofq=3;
		int sum=0;
		int target=1;
		List<Integer> li=new ArrayList<>();
        List<List<Integer>> li1=new ArrayList<>();
            print(bl, nofq, 0, 0,sum, li, li1,target);
            System.out.println(li1);
	}
	
	public static void print(boolean[] bl,int nofq,int cqs,int idx,int sum,List<Integer> li,List<List<Integer>> li1,int target) {
		
		

		if(nofq==cqs) 
			{
			if(sum==target) {
				
				li1.add(new ArrayList<>(li));
				return;
			}
			else {
				return;
			}
			
		}
		
		
		for(int i=idx;i<bl.length;i++) {
			if(bl[i]==false) {
				bl[i]=true;
				li.add(i+1);
				print(bl,nofq,cqs+1,i+1,sum+(i+1),li,li1,target);
				li.remove(li.size()-1);
				bl[i]=false;
				
			}
		}
	}
}
