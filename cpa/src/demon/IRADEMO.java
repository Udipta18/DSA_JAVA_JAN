package demon;
import java.util.*;

public class IRADEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Song[] sg=new Song[5];
		for(int i=0;i<sg.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			double d=sc.nextDouble();
			sg[i]=new Song(a,b,c,d);
		}
		   sc.nextLine();
        String artist1=sc.nextLine();
        String artist2=sc.nextLine();
        
        double ans=findSongDurationForArtist(sg, artist1);
          if(ans!=0.0) {
        	  System.out.println(ans);
          }
          else {
        	  System.out.println("There are no songs with given artist");
          }
          
          Song[] ans1=getSongsInAscendingOrder(sg, artist2);
         
          if(ans1!=null) {
        	  for(int i=0;i<ans1.length;i++) {
        		  System.out.println(ans1[i].getSongId());
        		  System.out.println(ans1[i].getTitle());
        		 
        	  }
        	  
          }
          else {
        	  System.out.println("There are no songs with given artist");
          }
	}

	 public static double findSongDurationForArtist(Song[] sg,String artist) {
		 double sum=0;
		 for(int i=0;i<sg.length;i++) {
			 if(sg[i].getArtist().equalsIgnoreCase(artist)) {
				 sum+=sg[i].getDuration();
			 }
		 }
		 return sum;
	 }
	 public static Song[] getSongsInAscendingOrder(Song[] sg,String title) {
		 int c=0;
          for(int i=0;i<sg.length;i++) {		 
        	  if(sg[i].getArtist().equalsIgnoreCase(title)) {
        		  c++;
        	  }
          }
          int j=0;
		 Song[] sg1=new Song[c];
		    for(int i=0;i<sg.length;i++) {		 
	        	  if(sg[i].getArtist().equalsIgnoreCase(title)) {
	        		  sg1[j]=sg[i];
	        		  j++;
	        	  }
	          }
		 for(int l=1;l<sg1.length;l++) {
			 for(int k=0;k<sg1.length-l;k++) {
				 if(sg1[k]!=null &&sg1[k+1]!=null) {
				 if(sg1[k].getDuration()>sg1[k+1].getDuration()) {
					 Song temp=sg1[k];
					 sg1[k]=sg1[k+1];
					 sg1[k+1]=temp;
				 }
				 }
			 }
		 }
		 if(c>0) {
		 return sg1;
		 }
		 else 
			 return null;
		 
	 }
}
class Song{
	int songId;
	String title;
	String artist;
	double duration;
	public Song(int songId, String title, String artist, double duration) {
		super();
		this.songId = songId;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
}