import java.util.*;


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Gift[] arr=new Gift[5];
		for(int i=0;i<5;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			sc.nextLine();
			String d=sc.nextLine();
			arr[i]=new Gift(a,b,c,d);
		}
		
		String br=sc.nextLine();
		Gift ans1=getLowestPricedGiftBYBrand(arr,br);
		if(ans1!=null) {
			System.out.println(ans1.giftId);
			System.out.println(ans1.giftName);
			System.out.println(ans1.price);
			System.out.println(ans1.brand);
		}
		else {
			System.out.println("No such gift found");
		}
		
		Gift ans2=getThirdHighestPricedGift(arr);
		if(ans2!=null) {
			System.out.println(ans2.giftId);
			System.out.println(ans2.giftName);
			System.out.println(ans2.price);
			System.out.println(ans2.brand);
		}
		else
		{
			System.out.println("No such gift found");
		}
	}
	
	public static Gift getLowestPricedGiftBYBrand(Gift[] gf,String br) {
		Gift ans=null;
		int c=0;
		
		for(int i=0;i<gf.length;i++) {
			if(gf[i].getBrand().equalsIgnoreCase(br)) {
				c++;
			}
		}
		int j=0;
		Gift[] sg1=new Gift[c];
		for(int i=0;i<gf.length;i++) {
			if(gf[i].getBrand().equalsIgnoreCase(br)) {
				sg1[j]=gf[i];
				j++;
			}
		}
		 for(int l=1;l<sg1.length;l++) {
			 for(int k=0;k<sg1.length-l;k++) {
				 if(sg1[k]!=null &&sg1[k+1]!=null) {
				 if(sg1[k].getPrice()>sg1[k+1].getPrice()) {
					 Gift temp=sg1[k];
					 sg1[k]=sg1[k+1];
					 sg1[k+1]=temp;
				 }
				 }
			 }
		 }
		 
		 if(c>0) {
			 ans=sg1[0];
			 return ans;
		 }
		 else {
			 return ans;
		 }
	}
	
	public static Gift getThirdHighestPricedGift(Gift[] sg1) {
		Gift ans2=null;
		for(int l=1;l<sg1.length;l++) {
			 for(int k=0;k<sg1.length-l;k++) {
				 if(sg1[k]!=null &&sg1[k+1]!=null) {
				 if(sg1[k].getPrice()>sg1[k+1].getPrice()) {
					 Gift temp=sg1[k];
					 sg1[k]=sg1[k+1];
					 sg1[k+1]=temp;
				 }
				 }
			 }
		 }
		int a=sg1.length-3;
		//for(int m=a;m>=0;m--) {
			if(sg1[a].getPrice()<1000) {
				if(sg1[a].getPrice()%2!=0) {
					ans2=sg1[a];
				}
			}
		
		return ans2;
	}
	

}
class Gift {
	int giftId;
	String giftName;
	int price;
	String brand;
	public Gift(int giftId, String giftName, int price, String brand) {
		super();
		this.giftId = giftId;
		this.giftName = giftName;
		this.price = price;
		this.brand = brand;
	}
	public int getGiftId() {
		return giftId;
	}
	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}
	public String getGiftName() {
		return giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}