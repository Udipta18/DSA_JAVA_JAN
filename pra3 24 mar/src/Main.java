import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Box[] bx=new Box[n];
		for(int i=0;i<bx.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			double c=sc.nextDouble();
			bx[i]=new Box(a,b,c);
		}
		
		int id=sc.nextInt();
		
		double ans=findAvgQtyOfBo(bx);
		if(ans!=0.0) {
			System.out.println("Average quantity:"+ans);
		}
		else
		{
			System.out.println("No Box found with mentioned attribute");
		}
		
		Box ans2=searchBoxById(bx,id);
		
		if(ans2!=null) {
			System.out.println("Id-"+ans2.getId());
			System.out.println("name-"+ans2.getName());
			System.out.println("quantity-"+ans2.getQty());
		}
		else {
			System.out.println("No Box found with mentioned attribute");
		}

	}
	
	public static double findAvgQtyOfBo(Box[] bx) {
		double avg=0.0;
		double sum=0.0;
		int c=0;
		for(int i=0;i<bx.length;i++) {
			sum+=bx[i].getQty();
			c++;
		}
		
		if(c>0) {
			avg=sum/c;
			return avg;
		}
		else
			return avg;
	}
	
	public static Box searchBoxById(Box[] bx,int id) {
		Box ans=null;
		for(int i=0;i<bx.length;i++) {
			if(bx[i].getId()==id) {
			ans=bx[i];
			}
		}
		
		return ans;
	}

}
class Box {
	int id;
	String name;
	double qty;
	public Box(int id, String name, double qty) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	
	
}