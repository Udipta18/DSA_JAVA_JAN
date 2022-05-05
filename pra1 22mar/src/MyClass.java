import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  Account[] ac=new Account[n];
  for(int i=0;i<n;i++) {
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  sc.nextLine();
	  String c=sc.nextLine();
	  int d=sc.nextInt();
	  ac[i]=new Account(a,b,c,d);
  }
     sc.nextLine();
     String ty=sc.nextLine();
     Account ans=findAccWithMaxHold(ac);
     if(ans!=null) {
    	 System.out.println("number-"+ans.getNumber());
    	 System.out.println("noOfAccountHolders-"+ans.getNoOfAccHolders());
    	 System.out.println("acType-"+ans.getTy());
    	 System.out.println("balance-"+ans.getBal());
     }
     else
    	 System.out.println("No Account found with mentioned attribute ");
     Account ans2=searchAccByAcType(ac,ty);
     if(ans2!=null) {
    	 System.out.println("number-"+ans2.getNumber());
    	 System.out.println("noOfAccountHolders-"+ans2.getNoOfAccHolders());
    	 System.out.println("acType-"+ans2.getTy());
    	 System.out.println("balance-"+ans2.getBal());
     }
     else
    	 System.out.println("No Account found with mentioned attribute ");
     
	}
	
	public static Account findAccWithMaxHold(Account[] ac) {
		int min=0;
		Account ac1=null;
		for(int i=0;i<ac.length;i++) {
			if(ac[i].getNoOfAccHolders()>min) {
				min=ac[i].getNoOfAccHolders();
				ac1=ac[i];
			}
		}
		return ac1;
	}
	
	public static Account searchAccByAcType(Account[] ac,String ty) {
		Account ac1=null;
		for(int i=0;i<ac.length;i++) {
			if(ac[i].getTy().equalsIgnoreCase(ty)) {
				ac1=ac[i];
			}
		}
		return ac1;
	}

}
class Account{
	int number;
	int noOfAccHolders;
	String ty;
	int bal;
	public Account(int number, int noOfAccHolders, String ty, int bal) {
		super();
		this.number = number;
		this.noOfAccHolders = noOfAccHolders;
		this.ty = ty;
		this.bal = bal;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNoOfAccHolders() {
		return noOfAccHolders;
	}
	public void setNoOfAccHolders(int noOfAccHolders) {
		this.noOfAccHolders = noOfAccHolders;
	}
	public String getTy() {
		return ty;
	}
	public void setTy(String ty) {
		this.ty = ty;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	
}
