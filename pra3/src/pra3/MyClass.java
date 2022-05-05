package pra3;
import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Institution[] it=new Institution[4];
		for(int i=0;i<it.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			double d=sc.nextDouble();
			boolean e=sc.nextBoolean();
			it[i]=new Institution(a,b,c,d,e);
		}
		
		   sc.nextLine();
		   String loc=sc.nextLine();
		   double rating=sc.nextDouble();
		   int ans=getCountResearchBasedOnRating(it,rating,loc);
		   if(ans!=0) {
			   System.out.println(ans);
		   }
		   else {
			   System.out.println("No such Institutions");
		   }
		   
		   

	}
	public static int getCountResearchBasedOnRating(Institution[] it,double rating,String loc) {
		int c=0;
		for(int i=0;i<it.length;i++) {
			if(it[i].isResearchCentre() && it[i].getRating()>=rating && it[i].getInstitutionLocation().equalsIgnoreCase(loc)) {
				c++;
			}
		}
		
		return c;
		/*
		 * Institution[] it1=new Institution[c]; int j=0; for(int i=0;i<it.length;i++) {
		 * if(it[i].isResearchCentre() && it[i].getRating()>=rating) { it1[j]=it[i];
		 * j++; } }
		 */
		
		
		
	}

}
class Institution{
	int institutionId;
	String institutionName;
	String institutionLocation;
	double rating;
	boolean researchCentre;
	public Institution(int institutionId, String institutionName, String institutionLocation, double rating,
			boolean researchCentre) {
		super();
		this.institutionId = institutionId;
		this.institutionName = institutionName;
		this.institutionLocation = institutionLocation;
		this.rating = rating;
		this.researchCentre = researchCentre;
	}
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getInstitutionLocation() {
		return institutionLocation;
	}
	public void setInstitutionLocation(String institutionLocation) {
		this.institutionLocation = institutionLocation;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isResearchCentre() {
		return researchCentre;
	}
	public void setResearchCentre(boolean researchCentre) {
		this.researchCentre = researchCentre;
	}
	
	
	
}