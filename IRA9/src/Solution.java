import java.util.*;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    //int n=sc.nextInt();
    Sapling[] sp=new Sapling[4];
    for(int i=0;i<sp.length;i++) {
    	int a=sc.nextInt();
    	sc.nextLine();
    	String b=sc.nextLine();
    	int c=sc.nextInt();
    	int d=sc.nextInt();
    	sp[i]=new Sapling(a,b,c,d);
    }
    
        int c=sc.nextInt();
         int pr=sc.nextInt();
         
         int ans1=findAvgOfCount(sp,c);
         if(ans1!=0) {
        	 System.out.println(ans1);
         }
         else
        	 System.out.println("No record found");
         
         Sapling[] ans2=sortNameByPrice(sp,pr);
         if(ans2!=null) {
        	 for(int i=0;i<ans2.length;i++) {
        		 System.out.println(ans2[i].getName());
        	 }
         }
         else
        	 System.out.println("No record found with mentioned attribute");
         
	}
	public static int findAvgOfCount(Sapling[] sp,int c) {
		int avg=0;
		int sum=0;
		int co=0;
		for(int i=0;i<sp.length;i++) {
			if(sp[i].count<c) {
				sum+=sp[i].count;
				co++;
			}
		}
		
		if(co>0)
		{
			avg=sum/co;
			return avg;
		}
		else
			return 0;
		
		
	}
	
	public static Sapling[] sortNameByPrice(Sapling[] sp,int pr) {
		int c=0;
		for(int i=0;i<sp.length;i++) {
			if(sp[i].getPrice()<pr) {
				c++;
			}
		}
		
		Sapling[] an=new Sapling[c];
		int j=0;
		for(int i=0;i<sp.length;i++) {
			if(sp[i].getPrice()<pr) {
				an[j]=sp[i];
				j++;
			}
		}
		
		 for(int l=1;l<an.length;l++) {
			 for(int k=0;k<an.length-l;k++) {
				 if(an[k]!=null &&an[k+1]!=null) {
				 if(an[k].getPrice()>an[k+1].getPrice()) {
					 Sapling temp=an[k];
					 an[k]=an[k+1];
					 an[k+1]=temp;
				 }
				 }
			 }
		 }
		 
		 if(c>0) {
			 return an;
			 }
			 else 
				 return null;
		
	}

}
class Sapling{
	int id;
	String name;
	int count;
	int price;
	public Sapling(int id, String name, int count, int price) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
