import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  FruitSt[] fr=new FruitSt[n];
  for(int i=0;i<n;i++) {
	  int a=sc.nextInt();
	  sc.nextLine();
	  String b=sc.nextLine();
	  String c=sc.nextLine();
	  int d=sc.nextInt();
	  fr[i]=new FruitSt(a,b,c,d);
  }
        int no=sc.nextInt();
        FruitSt ans1=getFruitByNo(fr,no);
        if(ans1!=null) {
        	System.out.println(ans1.getItNo());
        	System.out.println(ans1.getNa());
        	System.out.println(ans1.getColor());
        	System.out.println(ans1.getPrice());
        }
        else
          System.out.println("No fruits found");
       
        FruitSt ans2=getMaxPr(fr);
        
        if(ans2!=null) {
        	System.out.println(ans2.getItNo());
        	System.out.println(ans2.getNa());
        	System.out.println(ans2.getColor());
        	System.out.println(ans2.getPrice());
        }
        else
          System.out.println("No fruits found");
	}
    
	public static FruitSt getFruitByNo(FruitSt[] fr,int no) {
		FruitSt fs=null;
		for(int i=0;i<fr.length;i++) {
			if(fr[i].getItNo()==no) {
				fs=fr[i];
			}
		}
		return fs;
		
	}
	
	public static FruitSt getMaxPr(FruitSt[] fr) {
		int min=0;
		FruitSt fs=null;
		for(int i=0;i<fr.length;i++) {
			if(fr[i].getPrice()>min) {
				min=fr[i].getPrice();
				fs=fr[i];
			}
		}
		return fs;
	}
}
class  FruitSt{
	int itNo;
	String na;
	String color;
	int price;
	public FruitSt(int itNo, String na, String color, int price) {
		super();
		this.itNo = itNo;
		this.na = na;
		this.color = color;
		this.price = price;
	}
	public int getItNo() {
		return itNo;
	}
	public void setItNo(int itNo) {
		this.itNo = itNo;
	}
	public String getNa() {
		return na;
	}
	public void setNa(String na) {
		this.na = na;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
