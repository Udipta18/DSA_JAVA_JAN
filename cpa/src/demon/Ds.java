package demon;
import java.util.*;

public class Ds {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 Toy[] t=new Toy[n];
		 for(int i=0;i<n;i++) {
			 
			 int a=sc.nextInt();
			 sc.nextLine();
			 String b=sc.nextLine();
			 double c=sc.nextDouble();
			 t[i]=new Toy(a,b,c);
		 }
		 
		 int id=sc.nextInt();
		 
		 double ans1=findAverageQuantityOfToy(t);
		 Toy ans2=searchToyById(t,id);
		 
		 if(ans1>0) {
			 System.out.println("Average quantity"+":"+ans1);
		 }
		 else {
			 System.out.println("No Toy found with the mentioned attribute");
		 }
		 
		 if(ans2!= null) {
			 System.out.println("id"+"-"+ans2.getId());
			 System.out.println("name"+"-"+ans2.getName());
			 System.out.println("quantity"+"-"+ans2.getQuantity());
		 }
		 else {
			 System.out.println("Average quantity"+":"+"No Toy found with the mentioned attribute");

		 }

	}
	
	
	public static double findAverageQuantityOfToy(Toy[] arr) {
		double avg=0;
		int c=arr.length;
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i].getQuantity();
		}
		avg=(sum/c)*(1.0);
		return avg;
	}
	
	public static Toy searchToyById(Toy[] a,int id) {
		Toy t1=null;
		for(int i=0;i<a.length;i++) {
			if(a[i].getId()==id) {
				t1=a[i];
			}
		}
		
		return t1;
	}

}
 class Toy{
	private int id;
	private String name;
	private double quantity;
	
	public Toy(int id, String name, double quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
 }