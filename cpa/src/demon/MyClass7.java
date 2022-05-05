package demon;
import java.util.*;
public class MyClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Student[] st=new Student[n];
         for(int i=0;i<n;i++) {
        	 int a=sc.nextInt();
        	 sc.nextLine();
        	 String b=sc.nextLine();
        	 int c=sc.nextInt();
        	 int d=sc.nextInt();
        	 st[i]=new Student(a,b,c,d);
         }
         
         int id=sc.nextInt();
         Student ans=findStudentWithMaximumAge(st);
         if(ans!=null) {
        	 System.out.println("id"+"-"+ans.getId());
        	 System.out.println("name"+"-"+ans.getName());
        	 System.out.println("marks"+"-"+ans.getMarks());
        	 System.out.println("age"+"-"+ans.getAge());
         }
         
         Student ans2=searchStudentById(st,id);
         if(ans2!=null) {
        	 System.out.println("id"+"-"+ans2.getId());
        	 System.out.println("name"+"-"+ans2.getName());
        	 System.out.println("marks"+"-"+ans2.getMarks());
        	 System.out.println("age"+"-"+ans2.getAge());
         }
         else {
        	 System.out.println("No Student found with mentioned attribute");
         }
	}
	public static Student findStudentWithMaximumAge(Student[] st) {
		int max=Integer.MIN_VALUE;
		Student st1=null;
		for(int i=0;i<st.length;i++) {
			if(st[i].getAge()>max) {
				max=st[i].getAge();
				st1=st[i];
			}
		}
		
		return st1;
	}
 
	 public static Student searchStudentById(Student[] st,int id) {
		 Student st2=null;
		 for(int i=0;i<st.length;i++) {
			 if(st[i].getId()==id) {
				 st2=st[i];
			 }
		 }
		 return st2;
	 }
	
}
 class Student{
	 int id;
	 String name;
	 int marks;
	 int age;
	public Student(int id, String name, int marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
 }