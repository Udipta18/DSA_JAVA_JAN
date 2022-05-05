import java.util.*;


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      Toy[] tt=new Toy[5];
      for(int i=0;i<5;i++) {
    	  int a=sc.nextInt();
    	  sc.nextLine();
    	 String  b=sc.nextLine();
    	  //sc.nextLine();
    	  String c=sc.nextLine();
    	  double d=sc.nextDouble();
    	  double e=sc.nextDouble();
    	  tt[i]=new Toy(a,b,c,d,e);
      }
        sc.nextLine();
       String ct1=sc.nextLine();
       String ct2=sc.nextLine();
      double ans1= findAveragePricePerCategory(tt,ct1);
      if(ans1!=0.0) {
    	  System.out.println(ans1);
      }
      else {
    	  System.out.println("Category doesn't exist");
      }
      
      Toy ans2=findToyWithHighestPrice(tt,ct2);
      if(ans2!=null) {
    	  System.out.println(ans2.getToyId());
    	  System.out.println(ans2.getToyNamae());
    	  System.out.println(ans2.getCategory());
      }
      else {
    	  System.out.println("No Match found for the Category");
      }
      
	}
	public static double findAveragePricePerCategory(Toy[] tt,String ct) {
		double avg=0.0;
		int count=0;
		double sum=0.0;
		for(int i=0;i<tt.length;i++) {
			if(tt[i].getCategory().equalsIgnoreCase(ct)) {
				sum+=tt[i].getPrice();
				count++;
			}
		}
		
		avg=sum/count;
		if(count>0) {
			return avg;
		}
		else
		return 0.0;
	}
	
	public static Toy findToyWithHighestPrice(Toy[] tt,String ct) {
		int c=0;
		for(int i=0;i<tt.length;i++) {
			if(tt[i].getCategory().equalsIgnoreCase(ct)) {
				c++;
			}
		}
		
		Toy[] tt1=new Toy[c];
		double price=0.0;
		int j=0;
		for(int i=0;i<tt.length;i++) {
			if(tt[i].getCategory().equalsIgnoreCase(ct)) {
				price=(tt[i].getPrice()*tt[i].getDiscount())/100;
				tt[i].setPrice(price);
				tt1[j]=tt[i];
				j++;
				
			}
		}
		
		 for(int l=1;l<tt1.length;l++) {
			 for(int k=0;k<tt1.length-l;k++) {
				 if(tt1[k]!=null &&tt1[k+1]!=null) {
				 if(tt1[k].getPrice()>tt1[k+1].getPrice()) {
					 Toy temp=tt1[k];
					 tt1[k]=tt1[k+1];
					 tt1[k+1]=temp;
				 }
				 }
			 }
		 }
		 if(c>0) {
			 return tt1[c-1];
			 }
			 else 
				 return null;
	}

}
class Toy{
	int toyId;
	String toyNamae;
	String category;
	double price;
	double discount;
	public Toy(int toyId, String toyNamae, String category, double price, double discount) {
		super();
		this.toyId = toyId;
		this.toyNamae = toyNamae;
		this.category = category;
		this.price = price;
		this.discount = discount;
	}
	public int getToyId() {
		return toyId;
	}
	public void setToyId(int toyId) {
		this.toyId = toyId;
	}
	public String getToyNamae() {
		return toyNamae;
	}
	public void setToyNamae(String toyNamae) {
		this.toyNamae = toyNamae;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}