package pra3; 
import java.util.*;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Window[] wn=new Window[4];
		for(int i=0;i<4;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			double c=sc.nextDouble();
			double d=sc.nextDouble();
			wn[i]=new Window(a,b,c,d);
		}
		
		sc.nextLine();
		String name=sc.nextLine();
		double fc=sc.nextDouble();
		double ans1=findAirLeakageByName(wn,name);
		if(ans1!=0.0) {
			System.out.println(ans1);
		}
		else
			System.out.println("No Window found");
		
		Window[] ans2=sortWindowByUFactor(wn,fc);
		
		  if(ans2!=null) {
        	  for(int i=0;i<ans2.length;i++) {
        		  System.out.println(ans2[i].getWindowName());
        		 
        		 
        	  }
        	  
          }
          else {
        	  System.out.println("No Window matches with mentioned criteria");
          }

	}

	  public static double findAirLeakageByName(Window[] wn,String name) {
		  double ans=0.0;
		  for(int i=0;i<wn.length;i++) {
			  if(wn[i].windowName.equalsIgnoreCase(name)) {
				  ans=wn[i].getAirLeakage();
			  }
		  }
		  
		  return ans;
	  }
	  
	  public static Window[] sortWindowByUFactor(Window[] wn,double fc) {
		  int c=0;
		  for(int i=0;i<wn.length;i++) {
			  if(wn[i].getuFactor()<fc) {
				  c++;
				  
			  }
			  
		  }
		  
		  Window[] wn1=new Window[c];
		  int j=0;
		  for(int i=0;i<wn.length;i++) {
			  if(wn[i].getuFactor()<fc) {
				  wn1[j]=wn[i];
				  j++;
				  
			  }
			  
		  }
		  
		  for(int l=1;l<wn1.length;l++) {
				 for(int k=0;k<wn1.length-l;k++) {
					 if(wn1[k]!=null &&wn1[k+1]!=null) {
					 if(wn1[k].getuFactor()>wn1[k+1].getuFactor()) {
						 Window temp=wn1[k];
						 wn1[k]=wn1[k+1];
						 wn1[k+1]=temp;
					 }
					 }
				 }
			 }
		  
		  if(c>0) {
				 return wn1;
				 }
				 else 
					 return null;
		  
		  
	  }
}
class Window
{
	int modelId;
	String windowName;
	double uFactor;
	double airLeakage;
	public Window(int modelId, String windowName, double uFactor, double airLeakage) {
		super();
		this.modelId = modelId;
		this.windowName = windowName;
		this.uFactor = uFactor;
		this.airLeakage = airLeakage;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getWindowName() {
		return windowName;
	}
	public void setWindowName(String windowName) {
		this.windowName = windowName;
	}
	public double getuFactor() {
		return uFactor;
	}
	public void setuFactor(double uFactor) {
		this.uFactor = uFactor;
	}
	public double getAirLeakage() {
		return airLeakage;
	}
	public void setAirLeakage(double airLeakage) {
		this.airLeakage = airLeakage;
	}
	
	
	
}
