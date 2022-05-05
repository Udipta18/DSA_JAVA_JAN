package java1;
import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Flower[] fl=new Flower[4];
		for(int i=0;i<fl.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			int d=sc.nextInt();
			sc.nextLine();
			String e=sc.nextLine();
			fl[i]=new Flower(a,b,c,d,e);
		}
		String type=sc.nextLine();
		
		Flower ans=findMinPriceByType(fl,type);
		if(ans!=null) {
			System.out.println(ans.flowerId);
		}
		else {
			System.out.println("There is no flower with given type");
		}

	}
	
	public static Flower findMinPriceByType(Flower[] fl,String type) {
		int c=0;
		for(int i=0;i<fl.length;i++) {
			if(fl[i].getType().equalsIgnoreCase(type) && fl[i].getRating()>3) {
				c++;
			}
		}
		int j=0;
		Flower[] ans=new Flower[c];
		for(int i=0;i<fl.length;i++) {
			if(fl[i].getType().equalsIgnoreCase(type) && fl[i].getRating()>3) {
				ans[j]=fl[i];
				j++;
			}
		}
		Flower ans2=null;
		int price=100000;
		for(int i=0;i<ans.length;i++) {
			if(ans[i].getPrice()<price) {
				price=ans[i].getPrice();
				ans2=ans[i];
			}
		}
		
		if(c>0) {
			return ans2;
		}
		else
			return null;
	}

}
class Flower{
	int flowerId;
	String flowerName;
	int price;
	int rating;
	String type;
	
	public Flower(int flowerId, String flowerName, int price, int rating, String type) {
		super();
		this.flowerId = flowerId;
		this.flowerName = flowerName;
		this.price = price;
		this.rating = rating;
		this.type = type;
	}
	public int getFlowerId() {
		return flowerId;
	}
	public void setFlowerId(int flowerId) {
		this.flowerId = flowerId;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}