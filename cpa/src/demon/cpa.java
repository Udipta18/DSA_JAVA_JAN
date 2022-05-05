package demon;
import java.util.*;
public class cpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     Footwear[] ft=new Footwear[5];
     for(int i=0;i<5;i++) {
    	 int a=sc.nextInt();
    	 sc.nextLine();
    	 String b=sc.nextLine();
    	 String c=sc.nextLine();
    	 int d=sc.nextInt();
    	 ft[i]=new Footwear(a,b,c,d);
     }
       
       sc.nextLine();
       
       String type=sc.nextLine();
       String name=sc.nextLine();
     
    int ans1=   getCountByType(ft,type);
    Footwear ans2=   getSecondHighestPriceByBrand(ft,name);
     if(ans1>0) {
    	 System.out.println(ans1);
     }
     else {
    	 System.out.println("invalid");
     }
     
     if(ans2!=null) {
    	 System.out.println(ans2.getId());
    	 System.out.println(ans2.getName());
    	 System.out.println(ans2.getPrice());
    	 
     }
     else {
    	 System.out.println("invalid");
     }
	}
	
	public static int getCountByType(Footwear[] ft,String type) {
		int count=0;
		for(int i=0;i<ft.length;i++) {
			if(ft[i].getType().equalsIgnoreCase(type)) {
				count++;
			}
		}
		
		return count;
	}
	
	public static Footwear getSecondHighestPriceByBrand(Footwear[] ft,String name) {
		int count=0;
		
		for(int i=0;i<ft.length;i++) {
			if(ft[i].getName().equalsIgnoreCase(name)) {
				
				
				count++;
			}
		}
		if(count==0) return null;
		Footwear[] sort=new Footwear[count];
		int j=0;
		for(int i=0;i<ft.length;i++) {
			if(ft[i].getName().equalsIgnoreCase(name)) {
				
				sort[j]=ft[i];
				j++;
			}
		}
//	Arrays.sort(sort);
		
		// pass
				for (int  turn = 1; turn< 4; turn++) {

					for (int i = 0; i < sort.length - turn; i++) {
						if(sort[i]!=null &&sort[i+1]!=null){// 6-1
						if (sort[i].getPrice() > sort[i + 1].getPrice()) {
							Footwear t = sort[i];
							sort[i] = sort[i + 1];
							sort[i + 1] = t;
						}

					}
					}
	
		
	}
				return sort[count-2];
				
	}

}

 class Footwear{
	 int Id;
	 
	String name;
	 String type;
	 int price;
	 
	 public Footwear(int id, String name, String type, int price) {
			super();
			Id = id;
			this.name = name;
			this.type = type;
			this.price = price;
		}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
 }

