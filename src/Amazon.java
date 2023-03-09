
import java.util.Scanner;
class NonIndian extends Product 
{
	int duty;
	float dutyPerc;

	public NonIndian() {
		dutyPerc = 5;
	}

	void calculateDuty() {
		duty = (int) (price * dutyPerc) / 100;
	}

	void display() {
		printData();
		System.out.println(duty);
	}
}

class Product 
{
	String name;
	int price;
	int qty;

	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name,Product Price and Product Qty : ");
		name = sc.next();
		price = sc.nextInt();
		qty = sc.nextInt();
	}

	void printData() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(qty);
	}
}

class Indian extends Product 
{

	int discount;
	float disPerc;

	public Indian() {
		disPerc = 5;
	}

	void calculateDis() {
		discount = (int) (price * disPerc) / 100;
	}

	void display() {
		printData();
		System.out.println(discount);
	}
}

public class Amazon 
{
	public static void main(String args[]) 
	{
		Indian ind[] = new Indian[3];
		NonIndian n[] = new NonIndian[3];
		int indianCounter = 0;
		int nonIndianCounter = 0;

		Scanner sc = new Scanner(System.in);
		while (true) 
		{
			System.out.println("1-------Insert Data");
			System.out.println("2-------Display Data");
			System.out.println("3-------Exit");
			int choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("1--------Indian");
				System.out.println("2-------Non Indian");
				int subChoice = sc.nextInt();
				switch (subChoice) 
				{
				case 1:
					ind[indianCounter] = new Indian();
					ind[indianCounter].getData();
					ind[indianCounter].calculateDis();
					indianCounter++;
					break;
				case 2:
					n[nonIndianCounter] = new NonIndian();
					n[nonIndianCounter].getData();
					n[nonIndianCounter].calculateDuty();
					nonIndianCounter++;
					break;

				}
			case 2:
				System.out.println("Indian Products");
				for (int i = 0; i < indianCounter; i++) {
					ind[i].display();
				}
				for (int i = 0; i < nonIndianCounter; i++) {
					n[i].display();
				}
			case 3:
				System.exit(0);
				break;
			}
		}
	}
}
	