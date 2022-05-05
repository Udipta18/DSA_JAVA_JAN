package anurag;

4
105
Nisha
35
26
107
Uma
15
32
112
delma
15
23
101
manu
43
24
23
import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         student[] st=new student[n];
         for(int i=0;i<n;i++) {
        	 int a=sc.nextInt();
        	 sc.nextLine();
        	 String b=sc.nextLine();
        	 int c=sc.nextInt();
        	 int d=sc.nextInt();
        	 st[i]=new student(a,b,c,d);
         }
         
         int age=sc.nextInt();
         student ans=findStudentWithMaximumAge(st);
         if(ans!=null) {
        	 System.out.println("id"+"-"+ans.getId());
        	 System.out.println("name"+"-"+ans.getName());
        	 System.out.println("marks"+"-"+ans.getMarks());
        	 System.out.println("age"+"-"+ans.getAge());
         }
         
         student ans2=searchStudentByAge(st,age);
         if(ans2!=null) {
        	 System.out.println("id"+"-"+ans2.getId());
        	 System.out.println("name"+"-"+ans2.getName());
        	 System.out.println("marks"+"-"+ans2.getMarks());
        	 System.out.println("age"+"-"+ans2.getAge());
         }
         else {
        	 System.out.println("No Student found with mentioned age");
         }
	}
	public static student findStudentWithMaximumAge(student[] st) {
		int max=Integer.MIN_VALUE;
		student st1=null;
		for(int i=0;i<st.length;i++) {
			if(st[i].getAge()>max) {
				max=st[i].getAge();
				st1=st[i];
			}
		}
		
		return st1;
	}
 
	public static student searchStudentByAge(student[] st,int age) {
		student st2=null;
		 for(int i=0;i<st.length;i++) {
			 if(st[i].getAge()==age) {
				 st2=st[i];
			 }
		 }
		 return st2;
	}
	
}
 class student{
	 int id;
	 String name;
	 int marks;
	 int age;
	public student(int id, String name, int marks, int age) {
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
