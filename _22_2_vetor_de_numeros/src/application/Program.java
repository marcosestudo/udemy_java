package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o n�mero de elementos: ");
		int n = sc.nextInt();
		sc.nextLine();

		Product[] vect = new Product[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Nome " + (i + 1));
			String name = sc.nextLine();
			
			System.out.println("Pre�o " + (i + 1));
			double price = sc.nextDouble();
			sc.nextLine();
			
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);

		sc.close();
	}
}
