import java.util.*;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Crop[] cr=new  Crop[4];
		for(int i=0;i<cr.length;i++) {
			String a=sc.next();
			String b=sc.next();
			String c=sc.next();
			double d=sc.nextDouble();
			cr[i]=new Crop(a,b,c,d);
		}
		
		sc.nextLine();

		String ty=sc.nextLine();
		double month=sc.nextDouble();
	
		 double ans=avgPerByCrop(cr,ty);
          
		 if(ans>0.0) {
			 System.out.println(ans);
		 }
		 else
			 System.out.println("There is no such Crop available.");

		 
		 Crop[] ans2=sorCrByPe(cr,month);

         if(ans2!=null) {
       	  for(int i=0;i<ans2.length;i++) {
       		  System.out.println(ans2[i].getName());
       		  System.out.println(ans2[i].getMon());
       		 
       	  }
       	  
         }
         else {
       	  System.out.println("No Crop found.");
         }
	}
	
	public static double avgPerByCrop(Crop[] r,String ty) {
		double ans=0.0;
		int c=0;
		for(int i=0;i<r.length;i++) {
			if(r[i].getType().equalsIgnoreCase(ty)) {
			ans+=r[i].getMonth();
			c++;
		}
		}		
		if(c<0.0)
			return ans;
		else {
			ans=ans/(c*1.0);
			return ans;
		}
	}
	
	public static Crop[] sorCrByPe(Crop[] cr,double month) {
		int c=0;
		for(int i=0;i<cr.length;i++) {
			if(cr[i].getMonth()<month) {
				c++;
			}
		}
		
		Crop[] cr1=new Crop[c];
		int j=0;
		
		for(int i=0;i<cr.length;i++) {
			if(cr[i].getMonth()<month) {
				cr1[j]=cr[i];
				j++;
			}
		}
		
		 for(int l=1;l<cr1.length;l++) {
			 for(int k=0;k<cr1.length-l;k++) {
				 if(cr1[k]!=null &&cr1[k+1]!=null) {
				 if(cr1[k].getMonth()>cr1[k+1].getMonth()) {
					 Crop temp=cr1[k];
					 cr1[k]=cr1[k+1];
					 cr1[k+1]=temp;
				 }
				 }
			 }
		 }
		 if(c>0) {
		 return cr1;
		 }
		 else 
			 return null;
	}

}

class  Crop{
	
	String type;
	String name;
	String mon;
	double month;
	public Crop(String type, String name, String mon, double month) {
		super();
		this.type = type;
		this.name = name;
		this.mon = mon;
		this.month = month;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	public double getMonth() {
		return month;
	}
	public void setMonth(double month) {
		this.month = month;
	}
	
	
	
}
