import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         NewsPaper[] news=new NewsPaper[n];
         for(int i=0;i<n;i++) {
        	 int a=sc.nextInt();
        	 sc.nextLine();
        	 String b=sc.nextLine();
        	 int c=sc.nextInt();
        	 int d=sc.nextInt();
        	 news[i]=new NewsPaper(a,b,c,d);
         }
         int publication=sc.nextInt();
         sc.nextLine();
         String name=sc.nextLine();
         
         int ans=findTotalPriceByPublicationYear(news,publication);
         if(ans!=0) {
        	 System.out.println(ans);
         }
         else {
        	 System.out.println("No Newspaper found with the mentioned attribute");
         }
         
         NewsPaper ans2=searchNewspaperByName(news,name);
         if(ans2!=null) {
        	 System.out.println("regNo"+"-"+ans2.getRegNo());
        	 System.out.println("name"+"-"+ans2.getName());
        	 System.out.println("publicationYear"+"-"+ans2.getPublicationYear());
        	 System.out.println("price"+"-"+ans2.getPrice());
         }
         else {
        	 System.out.println("No Newspaper found with given name");
         }
	}
public static int findTotalPriceByPublicationYear(NewsPaper[] news,int publication) {
	   int price=0;
	   int count=0;
	   for(int i=0;i<news.length;i++) {
		   if(news[i].getPublicationYear()==publication) {
			   count+=news[i].getPrice();
		   }
	   }
	   return count;
}
public static NewsPaper searchNewspaperByName(NewsPaper[] news ,String name) {
	NewsPaper nt=null;
	for(int i=0;i<news.length;i++) {
		if(news[i].getName().equalsIgnoreCase(name)) {
			nt=news[i];
		}
	}
	return nt;
}
}
class NewsPaper{
	int regNo;
	String name;
	int publicationYear;
	int price;
	public NewsPaper(int regNo, String name, int publicationYear, int price) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.publicationYear = publicationYear;
		this.price = price;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}