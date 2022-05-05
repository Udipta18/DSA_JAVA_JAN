import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Truck[] tr=new Truck[n];
    for(int i=0;i<n;i++) {
    	int a=sc.nextInt();
    	sc.nextLine();
    	String b=sc.nextLine();
    	int c=sc.nextInt();
    	int d=sc.nextInt();
    	tr[i]=new Truck(a,b,c,d);
    }
    
     sc.nextLine();
     String name=sc.nextLine();
     Truck ans1=searchTruckByOwnerName(tr,name);
     if(ans1!=null){
    	 System.out.println(ans1.getId());
    	 System.out.println(ans1.getOwName());
    	 System.out.println(ans1.getCapacity());
    	 System.out.println(ans1.getRate());
     }
     else
    	 System.out.println("No Truck found with mentioned attribute");
     
     Truck ans2=findTruWithMinCap(tr);
     if(ans2!=null){
    	 System.out.println(ans2.getId());
    	 System.out.println(ans2.getOwName());
    	 System.out.println(ans2.getCapacity());
    	 System.out.println(ans2.getRate());
     }
     else
    	 System.out.println("No Truck found with mentioned attribute"); 
    
	}
	
	public static Truck searchTruckByOwnerName(Truck[] tr,String name) {
		Truck ans=null;
		for(int i=0;i<tr.length;i++) {
			if(tr[i].getOwName().equalsIgnoreCase(name)) {
				ans=tr[i];
			}
		}
		return ans;
		
	}
	
	public static Truck findTruWithMinCap(Truck[] tr) {
		int max=100000;
		Truck tr1=null;
		for(int i=0;i<tr.length;i++) {
			if(tr[i].getCapacity()<max) {
				max=tr[i].getCapacity();
				tr1=tr[i];
			}
		}
		
		return tr1;
	}

}
class Truck{
	int id;
	String owName;
	int capacity;
	int rate;
	public Truck(int id, String owName, int capacity, int rate) {
		super();
		this.id = id;
		this.owName = owName;
		this.capacity = capacity;
		this.rate = rate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwName() {
		return owName;
	}
	public void setOwName(String owName) {
		this.owName = owName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
}