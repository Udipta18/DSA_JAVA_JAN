import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Grains[] grain=new Grains[4];
		for(int i=0;i<4;i++) {
			
			String a=sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			//sc.nextLine();
			int d=sc.nextInt();
			sc.nextLine();
			
			grain[i]=new Grains(a,b,c,d);
			
		}
		//sc.nextLine();
		String state=sc.nextLine();
		String name=sc.nextLine();
		int ans1=findTotalGrainsForGivenState(grain,state);
        if(ans1!=0) {
        	System.out.println(ans1);
        }
        else {
        	System.out.println("No Grains available for the given state");
        }
        
        Grains ans2=getGrainsForGivenName(grain,name);
        if(ans2!=null) {
        	System.out.println(ans2.getGrainId()+"-"+ans2.getGrainName()+"-"+ans2.getState());
        }
        else {
        	System.out.println("No Grains with matching names are found");
        }
	}
   public static int findTotalGrainsForGivenState(Grains[] gr,String state) {
	   int sum=0;
	   for(int i=0;i<gr.length;i++) {
		   if(gr[i].getState().equalsIgnoreCase(state)) {
			   sum+=gr[i].getQtyInQuimtal();
		   }
	   }
	   return sum;
   }
   public static Grains getGrainsForGivenName(Grains[] gr,String name) {
	   Grains gr2=null;
	   for(int i=0;i<gr.length;i++) {
		   if(gr[i].getGrainName().equalsIgnoreCase(name)) {
			   gr2=gr[i];
		   }
	   }
	   
	   return gr2;
   }
}
 class Grains{
	 String grainId;
	 String grainName;
	 String state;
	 int qtyInQuimtal;
	public Grains(String grainId, String grainName, String state, int qtyInQuimtal) {
		super();
		this.grainId = grainId;
		this.grainName = grainName;
		this.state = state;
		this.qtyInQuimtal = qtyInQuimtal;
	}
	public String getGrainId() {
		return grainId;
	}
	public void setGrainId(String grainId) {
		this.grainId = grainId;
	}
	public String getGrainName() {
		return grainName;
	}
	public void setGrainName(String grainName) {
		this.grainName = grainName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getQtyInQuimtal() {
		return qtyInQuimtal;
	}
	public void setQtyInQuimtal(int qtyInQuimtal) {
		this.qtyInQuimtal = qtyInQuimtal;
	}
	 
 }