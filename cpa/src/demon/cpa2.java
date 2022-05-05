package demon;

import java.util.*;

public class cpa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Sim[] sims = new Sim[5];

		for (int i = 0; i < 5; i++) {

			int a = sc.nextInt();
			sc.nextLine();

			String b = sc.nextLine();

			double c = sc.nextDouble();
			sc.nextLine();

			double d = sc.nextDouble();
			sc.nextLine();

			String e = sc.nextLine();

			sims[i] = new Sim(a, b, c, d, e);

		}

		String circle1 = sc.nextLine();

		String circle2 = sc.nextLine();

		Sim[] ans = transferCustomerCircle(sims, circle1, circle2);

		if (ans != null)

		{

			for (int i = 0; i < ans.length; i++) {

				System.out.println(
						ans[i].simId + " " + ans[i].customerName + " " + ans[i].circle + " " + ans[i].ratePerSecond);

			}

		}

	}

	public static Sim[] transferCustomerCircle(Sim[] sim, String circle1, String circle2) {
		int count = 0;
		for (int i = 0; i < sim.length; i++) {
			if (sim[i].getCircle().equalsIgnoreCase(circle1)) {
				// sim[i].setCircle(circle2);

				count++;
			}
		}
		if (count == 0) {
			return null;
		}
		int j = 0;
		Sim[] sort = new Sim[count];
		for (int i = 0; i < sim.length; i++) {
			if (sim[i].getCircle().equalsIgnoreCase(circle1)) {
				sim[i].setCircle(circle2);
				sort[j] = sim[i];
				j++;

			}
		}
		/*
		 * for(int i=0;i<sim.length;i++) {
		 * if(sim[i].getCircle().equalsIgnoreCase(circle1)){ sim[i].setCircle(circle2);
		 * 
		 * //count++; } }
		 */
		for (int turn = 1; turn < sort.length; turn++) {

			for (int i = 0; i < sort.length - turn; i++) {
				if (sort[i] != null && sort[i + 1] != null) {// 6-1
					if (sort[i].getRatePerSecond() < sort[i + 1].getRatePerSecond()) {
						Sim t = sort[i];
						sort[i] = sort[i + 1];
						sort[i + 1] = t;
					}

				}
			}

		}
		return sort;

	}

}

class Sim {

	int simId;

	String customerName;

	double balance;

	double ratePerSecond;

	String circle;

	// parametrized constructor

	public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {

		this.simId = simId;

		this.customerName = customerName;

		this.balance = balance;

		this.ratePerSecond = ratePerSecond;

		this.circle = circle;

	}

	// getter and setter

	public int getSimId() {

		return simId;

	}

	public void setSimId(int simId) {

		this.simId = simId;

	}

	public String getCustomerName() {

		return customerName;

	}

	public void setCustomerName(String customerName) {

		this.customerName = customerName;

	}

	public double getBalance() {

		return balance;

	}

	public void setBalance(double balance) {

		this.balance = balance;

	}

	public double getRatePerSecond() {

		return ratePerSecond;

	}

	public void setRatePerSecond(double ratePerSecond) {

		this.ratePerSecond = ratePerSecond;

	}

	public String getCircle() {

		return circle;

	}

	public void setCircle(String circle) {

		this.circle = circle;

	}

}
