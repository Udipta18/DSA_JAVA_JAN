
import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Stationery[] array=new Stationery[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();
			array[i]=new Stationery(a,b,c,d);
		}
		
		int id1=sc.nextInt();
		Stationery ans=findStationeryWithMaximumPrice(array);
		if(ans!=null) {
			System.out.println("id-"+ans.getId());
			System.out.println("quantity-"+ans.getQuantity());
			System.out.println("name-"+ans.getName());
			System.out.println("price-"+ans.getPtrice());
		}
		else {
			System.out.println("No Stationery found with mentioned attribute");
		}
		
		Stationery ans2=searchStationeryById(array,id1);
		if(ans2!=null) {
			System.out.println("id-"+ans2.getId());
			System.out.println("quantity-"+ans2.getQuantity());
			System.out.println("name-"+ans2.getName());
			System.out.println("price-"+ans2.getPtrice());
		}
		else {
			System.out.println("No Stationery found with mentioned attribute");
		}

	}
	public static Stationery findStationeryWithMaximumPrice(Stationery[] array) {
		int max=0;
		Stationery ans=null;
		for(int i=0;i<array.length;i++) {
			if(array[i].getPtrice()>max) {
				max=array[i].getPtrice();
				ans=array[i];
			}
		}
		
		return ans;
		
	}
	
	public static Stationery searchStationeryById(Stationery[] array,int id1) {
		Stationery ans2=null;
		for(int i=0;i<array.length;i++) {
			if(array[i].getId()==id1) {
				ans2=array[i];
			}
		}
		return ans2;
		
	}

}
class Stationery
{
	int id;
	int quantity;
	String name;
	int ptrice;
	public Stationery(int id, int quantity, String name, int ptrice) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.ptrice = ptrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPtrice() {
		return ptrice;
	}
	public void setPtrice(int ptrice) {
		this.ptrice = ptrice;
	}
	
}
