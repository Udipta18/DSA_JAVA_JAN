package demon;
import java.util.*;
public class MyClass2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Fruits[] f2=new Fruits[4];
        for(int i=0;i<f2.length;i++) {
        	int a=sc.nextInt();
        	sc.nextLine();
        	String b=sc.nextLine();
        	int c=sc.nextInt();
        	int d=sc.nextInt();
        	f2[i]=new Fruits(a,b,c,d);
        }
        
         int rating=sc.nextInt();
         Fruits ans=findMaximumPriceByRating(f2,rating);
         if(ans==null) {
        	 System.out.println("No such Fruit");
         }
         else {
        	 System.out.println(ans.getFruitId());
         }
        
	}

	  public static Fruits findMaximumPriceByRating(Fruits[] fr,int rating) {
		  int c=0;
		  for(int i=0;i<fr.length;i++) {
			  if(fr[i].getRating()>rating) {
				  c++;
			  }
		  }
		  Fruits[] fr1=new Fruits[c];
		  int j=0;
		  for(int i=0;i<fr.length;i++) {
			  if(fr[i].getRating()>rating) {
				  fr1[j]=fr[i];
				  j++;
			  }
		  }
		  
		  int frprice=Integer.MIN_VALUE;
		  Fruits fans=null;
		  for(int i=0;i<c;i++) {
			  if(fr1[i].getPrice()>frprice) {
				  frprice=fr[i].getPrice();
				fans=fr1[i];  
			  }
		  }
		  
		  return fans;
	  }
}
  class Fruits{
	  int fruitId;
	  String fruitName;
	  int price;
	  int rating;
	  
		public Fruits(int fruitId, String fruitName, int price, int rating) {
			super();
			this.fruitId = fruitId;
			this.fruitName = fruitName;
			this.price = price;
			this.rating = rating;
		}
		
	public int getFruitId() {
		return fruitId;
	}
	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	  
  }