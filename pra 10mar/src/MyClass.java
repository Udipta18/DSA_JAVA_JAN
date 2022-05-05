import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   Book[] bk=new Book[n];
   for(int i=0;i<n;i++) {
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   sc.nextLine();
	   String c=sc.nextLine();
	   String d=sc.nextLine();
	   double e=sc.nextDouble();
	   bk[i]=new Book(a,b,c,d,e);
   }
      double ans=findAveragePagesOfBook(bk);
      if(ans!=0.0) {
    	  System.out.println("Average of pages:"+ans);
      }
      else {
    	  System.out.println("No Book found with mentioned attribute");
      }
      
      Book ans2=findBookWithMinimumId(bk);
      if(ans2!=null) {
    	  System.out.println("id-"+ans2.getId());
    	  System.out.println("pages-"+ans2.getPages());
    	  System.out.println("author-"+ans2.getAuthor());
    	  System.out.println("title-"+ans2.getTitle());
    	  System.out.println("price-"+ans2.getPrice());
      }
      else {
    	  System.out.println("No Book found with mentioned attribute");
      }
      
	}
	
	public static double findAveragePagesOfBook(Book[] bk) {
		int c=0;
		int sum=0;
		double avg=0.0;
		for(int i=0;i<bk.length;i++) {
			sum+=bk[i].getPages();
			c++;
		}
		if(c>0)
		avg=sum/(c*1.0);
		
		return avg;
	}
	
	public static Book findBookWithMinimumId(Book[] bk) {
		int min=10000;
		Book ans=null;
		for(int i=0;i<bk.length;i++) {
			if(bk[i].getId()<min) {
				min=bk[i].getId();
				ans=bk[i];
			}
		}
		return ans;
	}

}
class Book{
	int id;
	int pages;
	String title;
	String author;
	double price;
	public Book(int id, int pages, String title, String author, double price) {
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
