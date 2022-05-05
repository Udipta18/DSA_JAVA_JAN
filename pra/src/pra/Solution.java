package pra;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Account[] ac=new Account[n];
		for(int i=0;i<ac.length;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();
			ac[i]=new Account(a,b,c,d);
		}
		int num=sc.nextInt();
		Account ans=findAccWiMxBal(ac);
		if(ans!=null) {
			System.out.println("number-"+ans.getNumber());
			System.out.println("noOfAccountHolders-"+ans.getNoOfAccholder());
			System.out.println("acType-"+ans.getAcType());
			System.out.println("balance-"+ans.getBal());
		}
		else {
			System.out.println("No Account found with mentioned attribute");
		}
		
		Account ans2=seAccByNo(ac,num);
		
		if(ans2!=null) {
			System.out.println("number-"+ans2.getNumber());
			System.out.println("noOfAccountHolders-"+ans2.getNoOfAccholder());
			System.out.println("acType-"+ans2.getAcType());
			System.out.println("balance-"+ans2.getBal());
		}
		else {
			System.out.println("No Account found with mentioned attribute");
		}

	}
    public static Account findAccWiMxBal(Account[] ac) {
    	Account ans=null;
    	int max=Integer.MIN_VALUE;
    	for(int i=0;i<ac.length;i++) {
    		if(ac[i].getBal()>max) {
    			max=ac[i].getBal();
    			ans=ac[i];
    		}
    	}
    	return ans;
    }
    
    public static Account seAccByNo(Account[] ac,int num) {
    	Account ans1=null;
    	for(int i=0;i<ac.length;i++) {
    		if(ac[i].getNumber()==num) {
    			ans1=ac[i];
    		}
    	}
    	
    	return ans1;
    }
}
class Account {
	int number;
	int noOfAccholder;
	String acType;
	int bal;
	public Account(int number, int noOfAccholder, String acType, int bal) {
		super();
		this.number = number;
		this.noOfAccholder = noOfAccholder;
		this.acType = acType;
		this.bal = bal;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNoOfAccholder() {
		return noOfAccholder;
	}
	public void setNoOfAccholder(int noOfAccholder) {
		this.noOfAccholder = noOfAccholder;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	
}
