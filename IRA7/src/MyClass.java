import java.util.*;
public class MyClass {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 Customer[] cs=new Customer[n];
		 for(int i=0;i<n;i++) {
			 int a=sc.nextInt();
			 sc.nextLine();
			 String b=sc.nextLine();
			 double c=sc.nextDouble();
			 int d=sc.nextInt();
			 cs[i]=new Customer(a,b,c,d);
		 }
		 double sal=sc.nextDouble();
		 double ans1=findAvgSal(cs);
		 if(ans1!=0.0) {
			 System.out.println("Average of salary "+ans1);
		 }
		 else {
			 System.out.println("No Customer found with mentioned attribute");
		 }
		 Customer ans2=searcCusBySal(cs,sal);
		 if(ans2!=null) {
			 System.out.println("id-"+ans2.getId());
			 System.out.println("name-"+ans2.getName());
			 System.out.println("salary-"+ans2.getPrice());
			 System.out.println("age-"+ans2.getAge());
		 }
		 else {
			 System.out.println("No Customer found with mentioned attribute");
		 }
	}
	
	public static  double findAvgSal(Customer[] cs) {
		int c=0;
		double sum=0.0;
		double ans=0.0;
		for(int i=0;i<cs.length;i++) {
			sum+=cs[i].getPrice();
			c++;
		}
		if(c>0) {
			ans=sum/c;
			
		}
		return ans;
			
	}
	
	public static Customer searcCusBySal(Customer[] cs,double sal) {
		Customer ans2=null;
		for(int i=0;i<cs.length;i++) {
			if(cs[i].getPrice()==sal) {
				ans2=cs[i];
			}
		}
		return ans2;
	}
}
class Customer{
	int id;
	String name;
	double price;
	int age;
	public Customer(int id, String name, double price, int age) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.age = age;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
