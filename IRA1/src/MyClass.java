import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Music[] mu=new Music[4];
		for(int i=0;i<mu.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			double d=sc.nextDouble();
			mu[i]=new Music(a,b,c,d);
		}
		 int count=sc.nextInt();
		 double duration =sc.nextDouble();
		 
		 int ans1=findAvgOfCount(mu,count);
		 if(ans1!=0) {
			 System.out.println(ans1);
		 }
		 else {
			 System.out.println("No playlist Found");
		 }
		
		 Music[] ans2=sortTypeByDuration(mu,duration);
		 if(ans2!=null) {
			 for(int i=0;i<ans2.length;i++) {
				 System.out.println(ans2[i].getType());
			 }
			
		 }
		 else {
			 System.out.println("No playlist found with mentioned attribute");
		 }

	}
  
	public static int findAvgOfCount(Music[] mu,int count) {
		int c=0;
		int avg=0;
		int sum=0;
		 for(int i=0;i<mu.length;i++) {
			 if(mu[i].getCount()>count) {
				 sum+=mu[i].getCount();
				 c++;
			 }
		 }
		 
		 avg=sum/c;
		 
		 return avg;
		 
	}
	
	public static Music[] sortTypeByDuration(Music[] mu,double duration) {
		int c=0;
		for(int i=0;i<mu.length;i++) {
			if(mu[i].getDuration()>duration) {
				c++;
			}
		}
		int j=0;
		Music[] ma=new Music[c];
		for(int i=0;i<mu.length;i++) {
			if(mu[i].getDuration()>duration) {
				ma[j]=mu[i];
				j++;
			}
		}
		 for(int l=1;l<ma.length;l++) {
			 for(int k=0;k<ma.length-l;k++) {
				 if(ma[k]!=null &&ma[k+1]!=null) {
				 if(ma[k].getDuration()>ma[k+1].getDuration()) {
					 Music temp=ma[k];
					 ma[k]=ma[k+1];
					 ma[k+1]=temp;
				 }
				 }
			 }
		 }
		 if(c>0) {
			 return ma;
			 }
			 else 
				 return null;
			 
		
	}
}
 class Music{
	 int playlistNo;
	 String type;
	 int count;
	 double duration;
	public Music(int playlistNo, String type, int count, double duration) {
		super();
		this.playlistNo = playlistNo;
		this.type = type;
		this.count = count;
		this.duration = duration;
	}
	public int getPlaylistNo() {
		return playlistNo;
	}
	public void setPlaylistNo(int playlistNo) {
		this.playlistNo = playlistNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	 
 }
