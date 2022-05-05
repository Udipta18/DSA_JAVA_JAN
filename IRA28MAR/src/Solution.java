import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PhotoFrame[] ph=new PhotoFrame[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			sc.nextLine();
			String d=sc.nextLine();
			ph[i]=new PhotoFrame(a,b,c,d);
			
		}
		
		String mat=sc.nextLine();
		double ans1=getAvgArByPhtFra(ph,mat);
		if(ans1>0.0) {
			System.out.println(ans1);
		}
		else
			System.out.println("No such Photo Frame available");
		

		PhotoFrame ans2= findPhFrWtSecLarBr(ph);
		if(ans2!=null) {
			System.out.println("id-"+ans2.getId());
			System.out.println("Length-"+ans2.getLength());
			System.out.println("Breadth-"+ans2.getBre());
			System.out.println("Material-"+ans2.getMat());
		}
		else
			System.out.println("No such Photo Frame available");
	}
	
	public static  double getAvgArByPhtFra(PhotoFrame[] pf,String mat) {
		int c=0;
		double ans=0.0;
		double  sum=0.0;
		int area=0;
		for(int i=0;i<pf.length;i++) {
			if(pf[i].getMat().equalsIgnoreCase(mat)) {
				c++;
				area=pf[i].getBre()*pf[i].getLength();
				sum+=area;
			}
		}
		if(c>0) {
			ans=sum/c;
		}
		
		if(ans<25) {
			return 0.0;
		}
		else
			return ans;

	}
	
	public static PhotoFrame findPhFrWtSecLarBr(PhotoFrame[] tt1) {
		 for(int l=1;l<tt1.length;l++) {
			 for(int k=0;k<tt1.length-l;k++) {
				 if(tt1[k]!=null &&tt1[k+1]!=null) {
				 if(tt1[k].getBre()>tt1[k+1].getBre()) {
					 PhotoFrame temp=tt1[k];
					 tt1[k]=tt1[k+1];
					 tt1[k+1]=temp;
				 }
				 }
			 }
		 }
		 
		 PhotoFrame ans2=tt1[tt1.length-2];
		 if(ans2.getLength()<5 && ans2.getBre()<5) {
			 return null;
		 }
		 else
			 return ans2;
		 
	}
	
	
}
class PhotoFrame{
	int id;
	int length;
	int bre;
	String mat;
	public PhotoFrame(int id, int length, int bre, String mat) {
		super();
		this.id = id;
		this.length = length;
		this.bre = bre;
		this.mat = mat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	
	
}
