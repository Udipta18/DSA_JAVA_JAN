package slsiding_window;

import java.util.ArrayList;
import java.util.List;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] bl=new boolean[4];
		int nofq=2;
		List<Integer> li=new ArrayList<>();
        List<List<Integer>> li1=new ArrayList<>();
        print(bl,nofq,0,0,li,li1);

	}
	
	public static void print(boolean[] bl,int nofq,int cqs,int idx,List<Integer> li,List<List<Integer>> li1) {
		
		
		if(nofq==cqs) {
			li1.add(new ArrayList<>(li));
			return;
		}
		
		for(int i=0;i<bl.length;i++) {
			if(bl[i]==false) {
				bl[i]=true;
				li.add(i+1);
				print(bl,nofq,cqs+1,idx+1,li,li1);
				li.remove(li.size()-1);
				bl[i]=false;
				
			}
		}
	}

}
