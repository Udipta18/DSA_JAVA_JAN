import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Journal[] c=new Journal[n];
        for(int i=0;i<n;i++) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	sc.nextLine();
        	String c1=sc.nextLine();
        	String d=sc.nextLine();
        	double e=sc.nextDouble();
        	c[i]=new Journal(a,b,c1,d,e);
        }
           int pages=sc.nextInt();
          double ans= findAveragePagesOfJournal(c);
          if(ans!=0.0) {
        	  System.out.println("Average of pages "+ans);
          }
          else {
        	  System.out.println("No Journal found with mentioned attribute");
          }
          
          Journal ans2=searchJournalByPages(c,pages);
          if(ans2!=null) {
        	  System.out.println("id-"+ans2.getId());
        	  System.out.println("pages-"+ans2.getPages());
        	  System.out.println("title-"+ans2.getTitle());
        	  System.out.println("author-"+ans2.getAuthor());
        	  System.out.println("price-"+ans2.getPrice());
          }
          else {
        	  System.out.println("No Journal found with mentioned attribute");
          }
	}
   public static double  findAveragePagesOfJournal(Journal[] c) {
	   double avg=0.0;
	   int sum=0;
	   int count=0;
	   for(int i=0;i<c.length;i++) {
		   sum+=c[i].getPages();
		   count++;
	   }
	   
	   avg=sum/(count*1.0);
	   return avg;
   }
   
   public static Journal searchJournalByPages(Journal[] c,int pages) {
	   Journal j=null;
	   for(int i=0;i<c.length;i++) {
		   if(c[i].getPages()==pages) {
			   j=c[i];
		   }
	   }
	   
	   return j;
   }
}
class Journal{
	int id;
	int pages;
	String title;
	String author;
	double price;
	public Journal(int id, int pages, String title, String author, double price) {
		super();
		this.id = id;
		this.pages = pages;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
