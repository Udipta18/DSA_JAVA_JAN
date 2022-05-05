import java.util.*;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Arena[] ar=new Arena[4];
		for(int i=0;i<ar.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			int d=sc.nextInt();
			sc.nextLine();
			String e=sc.nextLine();
			ar[i]=new Arena(a,b,c,d,e);
		}
		
		int id=sc.nextInt();
		sc.nextLine();
		String ty=sc.nextLine();
		int ans1=getArenaCapacity(ar,id);
		if(ans1>0) {
			System.out.println(ans1);
		}
		else {
			System.out.println("Arena Id is incorrect");
		}
		
		Arena ans2=getSecondHighestArenaRating(ar,ty);
		if(ans2!=null) {
			System.out.println(ans2.getArenaId());
			System.out.println(ans2.getArenaRating());
		}
		else {
			System.out.println("No such Arena");
		}

	}
 
	 public static int getArenaCapacity(Arena[] ar,int id) {
		 int ans=0;
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i].getArenaId()==id) {
				 ans=ar[i].getArenaCapacity();
			 }
		 }
		 
		 return ans;
	 }
	 
	 public static Arena getSecondHighestArenaRating(Arena[] ar,String ty) {
		 
		 int c=0;
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i].getArenaType().equalsIgnoreCase(ty)) {
				 c++;
			 }
		 }
		 int j=0;
		 Arena[] ans1=new Arena[c];
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i].getArenaType().equalsIgnoreCase(ty)) {
				 ans1[j]=ar[i];
				 j++;
			 }
		 }
		 
		 for(int l=1;l<ans1.length;l++) {
			 for(int k=0;k<ans1.length-l;k++) {
				 if(ans1[k]!=null &&ans1[k+1]!=null) {
				 if(ans1[k].getArenaRating()>ans1[k+1].getArenaRating()) {
					 Arena temp=ans1[k];
					 ans1[k]=ans1[k+1];
					 ans1[k+1]=temp;
				 }
				 }
			 }
		 }
		 
		 if(c>0)
			 return ans1[c-2];
		 else
			return null;
		 
	 }
	 
	 
}
 class  Arena{
	 
	 int arenaId;
	 String arenaName;
	 int arenaCapacity;
	 int arenaRating;
	 String arenaType;
	public Arena(int arenaId, String arenaName, int arenaCapacity, int arenaRating, String arenaType) {
		super();
		this.arenaId = arenaId;
		this.arenaName = arenaName;
		this.arenaCapacity = arenaCapacity;
		this.arenaRating = arenaRating;
		this.arenaType = arenaType;
	}
	public int getArenaId() {
		return arenaId;
	}
	public void setArenaId(int arenaId) {
		this.arenaId = arenaId;
	}
	public String getArenaName() {
		return arenaName;
	}
	public void setArenaName(String arenaName) {
		this.arenaName = arenaName;
	}
	public int getArenaCapacity() {
		return arenaCapacity;
	}
	public void setArenaCapacity(int arenaCapacity) {
		this.arenaCapacity = arenaCapacity;
	}
	public int getArenaRating() {
		return arenaRating;
	}
	public void setArenaRating(int arenaRating) {
		this.arenaRating = arenaRating;
	}
	public String getArenaType() {
		return arenaType;
	}
	public void setArenaType(String arenaType) {
		this.arenaType = arenaType;
	}
	 
	 
	 
 }
