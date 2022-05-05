import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Doctor[] dc=new Doctor[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			double c=sc.nextDouble();
			int d=sc.nextInt();
			dc[i]=new Doctor(a,b,c,d);
		}
		
		sc.nextLine();
		String name=sc.nextLine();
		Doctor ans1=maxAgeDoctor(dc);
		if(ans1!=null) {
			System.out.println("id-"+ans1.getId());
		System.out.println("name-"+ans1.getName());
		System.out.println("salary-"+ans1.getSalary());
		System.out.println("age-"+ans1.getAge());}
		else {
			System.out.println("No Doctor found with mentioned attribute");
		}
		
		Doctor ans2=searchDoctorByName(dc,name);
		
		if(ans2!=null) {
			System.out.println("id-"+ans2.getId());
			System.out.println("name-"+ans2.getName());
			System.out.println("salary-"+ans2.getSalary());
			System.out.println("age-"+ans2.getAge());
		}
		else {
			System.out.println("No Doctor found with mentioned attribute");
		}
		

	}
	
	public static Doctor maxAgeDoctor(Doctor[] dc) {
		int min=0;
		Doctor ans=null;
		for(int i=0;i<dc.length;i++) {
			if(dc[i].getAge()>min) {
				min=dc[i].getAge();
				ans=dc[i];
			}
		}
		
		return ans;
	}
	
	public static Doctor searchDoctorByName(Doctor[] dc,String name) {
		Doctor ans=null;
		for(int i=0;i<dc.length;i++) {
			if(dc[i].getName().equalsIgnoreCase(name)) {
				ans=dc[i];
			}
		}
		
		return ans;
	}
	
	

}
class Doctor {
	int id;
	String name;
	double salary;
	int age;
	public Doctor(int id, String name, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
