
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  Item[] it=new Item[n];
  for(int i=0;i<n;i++) {
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  sc.nextLine();
	  String c=sc.nextLine();
	  int d=sc.nextInt();
	  it[i]=new Item(a,b,c,d);
  }
       int id=sc.nextInt();
       Item ans1=findItWtMax(it);
       if(ans1!=null) {
    	   System.out.println("id-"+ans1.getId());
    	   System.out.println("quantity-"+ans1.getQty());
    	   System.out.println("name-"+ans1.getNm());
    	   System.out.println("price-"+ans1.getPr());
       }
       else {
    	   System.out.println("No item found with mentioned attribute");
       }
       
       Item ans2=searItById(it,id);
       if(ans2!=null) {
    	   System.out.println("id-"+ans2.getId());
    	   System.out.println("quantity-"+ans2.getQty());
    	   System.out.println("name-"+ans2.getNm());
    	   System.out.println("price-"+ans2.getPr());
       }
       else {
    	   System.out.println("No item found with mentioned attribute");
       }
	}
	public static Item findItWtMax(Item[] it) {
		int min=0;
		Item itt=null;
		for(int i=0;i<it.length;i++) {
			if(it[i].getPr()>min) {
				min=it[i].getPr();
				itt=it[i];
			}
		}
		
		return itt;
	}
	
	public static Item searItById(Item[] it,int id) {
		Item itt=null;
		for(int i=0;i<it.length;i++) {
			if(it[i].getId()==id) {
				itt=it[i];
			}
		}
		return itt;
	}

}
class  Item{
	int id;
	int qty;
	String nm;
	int pr;
	public Item(int id, int qty, String nm, int pr) {
		super();
		this.id = id;
		this.qty = qty;
		this.nm = nm;
		this.pr = pr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public int getPr() {
		return pr;
	}
	public void setPr(int pr) {
		this.pr = pr;
	}
	
	
	
}
