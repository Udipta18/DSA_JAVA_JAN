package demon;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class demon {
	public static void main(String args[]) throws Exception {
		int number;
		String name;
		double price;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vehicle[] v = new Vehicle[n];
		for (int i = 0; i < n; i++) {
			number = sc.nextInt();
			sc.nextLine();
			name = sc.nextLine();
			price = sc.nextDouble();
			v[i] = new Vehicle(number, name, price);
		}
		sc.nextLine();
		name = sc.nextLine();
		Vehicle ans1 = findVehicleWithMinimumPrice(v);
		Vehicle ans2 = searchVehicleByName(v, name);

		if (ans1 != null) {
			System.out.println("number-" + ans1.getnum());
			System.out.println("name-" + ans1.getname());
			System.out.println("price-" + ans1.getprice());

		} else {
			System.out.println("No Vehicle found with mentioned attribute");
		}

		if (ans2 != null) {
			System.out.println("number-" + ans2.getnum());
			System.out.println("name-" + ans2.getname());
			System.out.println("price-" + ans2.getprice());

		} else {
			System.out.println("No Vehicle found with mentioned attribute");
		}
	}

	public static Vehicle findVehicleWithMinimumPrice(Vehicle[] vl) {
		Vehicle v = null;
		Double price = 100000.0;
		for (int i = 0; i < vl.length; i++) {
			if (vl[i].getprice() < price) {
				price = vl[i].getprice();
				v = vl[i];
			}
		}
		return v;

	}

	public static Vehicle searchVehicleByName(Vehicle[] vl, String name) {
		Vehicle v = null;

		for (int i = 0; i < vl.length; i++) {
			if (vl[i].getname().equalsIgnoreCase(name)) {
				v = vl[i];
			}
		}
		return v;

	}
}

class Vehicle {

	int number;
	String name;
	double price;

	public Vehicle(int number, String name, double price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}

	public int getnum() {
		return number;
	}

	public String getname() {
		return name;
	}

	public double getprice() {
		return price;
	}
}
