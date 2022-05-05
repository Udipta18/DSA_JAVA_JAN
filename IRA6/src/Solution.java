import java.util.*;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         Hotel[] ht=new Hotel[4];
         for(int i=0;i<ht.length;i++) {
        	 int a=sc.nextInt();
        	 sc.nextLine();
        	 String b=sc.nextLine();
        	 int c=sc.nextInt();
        	 int d=sc.nextInt();
        	 sc.nextLine();
        	 String e=sc.nextLine();
        	 ht[i]=new Hotel(a,b,c,d,e);
         }
         
         String city=sc.nextLine();
         Hotel ans=findHighestPaidByCity(ht,city);
         if(ans!=null) {
        	 System.out.println(ans.getHotelId());
        	 System.out.println(ans.getHtName());
        	 System.out.println(ans.getAge());
        	 System.out.println(ans.getRoomTariff());
        	 System.out.println(ans.getCity());
         }
         else {
        	 System.out.println("No such hotel found");
         }
         
         Hotel[] ans2=findHotelWithEvenRoomTariff(ht);
         if(ans2!=null) {
        	 for(int i=0;i<ans2.length;i++) {
        		 System.out.println(ans2[i].getHotelId());
        	 }
         }
         else {
        	 System.out.println("No such hotel found");
         }
	}
	
	
	public static Hotel findHighestPaidByCity(Hotel[] ht,String city) {
		int c=0;
		for(int i=0;i<ht.length;i++) {
			if(ht[i].getCity().equalsIgnoreCase(city)) {
				c++;
			}
		}
		
		int j=0;
		Hotel[] ht1=new Hotel[c];
		for(int i=0;i<ht.length;i++) {
			if(ht[i].getCity().equalsIgnoreCase(city)) {
				ht1[j]=ht[i];
				j++;
			}
		}
		
		Hotel ans=null;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<ht1.length;i++) {
			if(ht1[i].getAge()>max) {
				max=ht1[i].getAge();
				ans=ht1[i];
			}
		}
		
		if(c>0)
		  return ans;
		else
		return null;
		
	}
	
	
	public static Hotel[] findHotelWithEvenRoomTariff(Hotel[] ht) {
		int c=0;
		for(int i=0;i<ht.length;i++) {
			if(ht[i].getRoomTariff()%2==0) {
				c++;
			}
		}
		
		Hotel[] ht1 =new Hotel[c];
		int j=0;
		for(int i=0;i<ht.length;i++) {
			if(ht[i].getRoomTariff()%2==0) {
				ht1[j]=ht[i];
				j++;
			}
		}
		
		for(int l=1;l<ht1.length;l++) {
			 for(int k=0;k<ht1.length-l;k++) {
				 if(ht1[k]!=null &&ht1[k+1]!=null) {
				 if(ht1[k].getRoomTariff()<ht1[k+1].getRoomTariff()) {
					 Hotel temp=ht1[k];
					 ht1[k]=ht1[k+1];
					 ht1[k+1]=temp;
				 }
				 }
			 }
		 }
		
		if(c>0) {
			 return ht1;
			 }
			 else 
				 return null;
			 
		
		
		
	}
	

}
class Hotel {
	int hotelId;
	String htName;
	int age;
	int roomTariff;
	String city;
	public Hotel(int hotelId, String htName, int age, int roomTariff, String city) {
		super();
		this.hotelId = hotelId;
		this.htName = htName;
		this.age = age;
		this.roomTariff = roomTariff;
		this.city = city;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHtName() {
		return htName;
	}
	public void setHtName(String htName) {
		this.htName = htName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoomTariff() {
		return roomTariff;
	}
	public void setRoomTariff(int roomTariff) {
		this.roomTariff = roomTariff;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
