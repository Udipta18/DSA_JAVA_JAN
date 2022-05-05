import java.util.*;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Theatre[] th=new Theatre[4];
        for(int i=0;i<4;i++) {
        	int a=sc.nextInt();
        	sc.nextLine();
        	String b=sc.nextLine();
        	int c=sc.nextInt();
        	int d=sc.nextInt();
        	sc.nextLine();
        	String e=sc.nextLine();
        	th[i]=new Theatre(a,b,c,d,e);
        	
        			
        }
        
        int num=sc.nextInt();
        sc.nextLine();
        String ty=sc.nextLine();
        
        int ans=getTheaterCapacity(th,num);
        if(ans>0) {
        	System.out.println(ans);
        }
        else {
        	System.out.println("Theatre Number is incorrect");
        }
        
        Theatre ans2=getSecLoThRat(th,ty);
        if(ans2!=null) {
        	System.out.println(ans2.getName());
        	System.out.println(ans2.getRat());
        }
        else
        	System.out.println("No such Theatre");
	}
	
	public static int getTheaterCapacity(Theatre[] th,int num) {
		int ans=0;
		for(int i=0;i<th.length;i++) {
			if(th[i].getNumber()== num) {
				ans=th[i].getCap();
			}
		}
		
		return ans;
		
	}
	
	public static  Theatre getSecLoThRat(Theatre[] th,String ty) {
		int c=0;
		for(int i=0;i<th.length;i++) {
			if(th[i].getType().equalsIgnoreCase(ty)) {
				c++;
			}
		}
		
		int j=0;
		Theatre[] th1=new Theatre[c];
		for(int i=0;i<th.length;i++) {
			if(th[i].getType().equalsIgnoreCase(ty)) {
				th1[j]=th[i];
				j++;
			}
		}
		
		 for(int l=1;l<th1.length;l++) {
			 for(int k=0;k<th1.length-l;k++) {
				 if(th1[k]!=null &&th1[k+1]!=null) {
				 if(th1[k].getRat()>th1[k+1].getRat()) {
					 Theatre temp=th1[k];
					 th1[k]=th1[k+1];
					 th1[k+1]=temp;
				 }
				 }
			 }
		 }
		
		 if(c>0) {
			 if(th1.length>1)
			 return th1[1];
			 else
				 return th1[0];
			 }
			 else 
				 return null;
	}
	
	

}
class Theatre {
	int number;
	String Name;
	int cap;
	int rat;
	String type;
	public Theatre(int number, String name, int cap, int rat, String type) {
		super();
		this.number = number;
		Name = name;
		this.cap = cap;
		this.rat = rat;
		this.type = type;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public int getRat() {
		return rat;
	}
	public void setRat(int rat) {
		this.rat = rat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
