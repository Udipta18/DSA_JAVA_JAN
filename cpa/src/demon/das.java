package demon;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class das {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		College[] col = new College[n];
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int con = sc.nextInt();
			sc.nextLine();
			String add = sc.nextLine();
			int pin = sc.nextInt();
			col[i] = new College(id, name, con, add, pin);
		}
		sc.nextLine();
		String address = sc.nextLine();
		College ans1 = findCollegeWithMaximumPincode(col);
		College ans2 = searchCollegeByAddress(col, address);

		if (ans1 != null) {

			System.out.println("id-" + ans1.getid());
			System.out.println("name-" + ans1.getname());
			System.out.println("contactNo-" + ans1.getcontact());
			System.out.println("address-" + ans1.getadd());
			System.out.println("pincode-" + ans1.getpin());
		} else {
			System.out.println("No College found with mentioned attribute.");
		}
		if (ans2 != null) {

			System.out.println("id-" + ans2.getid());
			System.out.println("name-" + ans2.getname());
			System.out.println("contactNo-" + ans2.getcontact());
			System.out.println("address-" + ans2.getadd());
			System.out.println("pincode-" + ans2.getpin());
		} else {
			System.out.println("No College found with mentioned attribute.");
		}

	}

	public static College findCollegeWithMaximumPincode(College[] v) {
		College ve = null;
		int pin = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i].getpin() > pin) {
				pin = v[i].getpin();
				ve = v[i];
			}
		}
		return ve;
	}

	public static College searchCollegeByAddress(College[] v, String address) {
		College ve = null;

		for (int i = 0; i < v.length; i++) {
			if (v[i].getadd().equalsIgnoreCase(address)) {
				ve = v[i];
			}
		}
		return ve;
	}
}

class College {
	int id;
	String name;
	int contactNo;
	String address;
	int pincode;

	public College(int id, String name, int contactNo, String address, int pincode) {
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.pincode = pincode;
	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public int getcontact() {
		return contactNo;
	}

	public String getadd() {
		return address;
	}

	public int getpin() {
		return pincode;
	}
}
