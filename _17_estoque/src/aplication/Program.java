package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		Product product1 = new Product();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		product1.name = sc.nextLine();
		System.out.print("Pre�o: ");
		product1.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		product1.quantity = sc.nextInt();
		
		System.out.printf("%s, $%.2f, %d unidades, total: $%.2f%n%n", product1.name, product1.price, product1.quantity, product1.totalValueInStock());
		
		System.out.print("Quantidade a ser adicionada ao estoque: ");
		product1.addProducts(sc.nextInt());
		System.out.printf("%s, $%.2f, %d unidades, total: $%.2f%n%n", product1.name, product1.price, product1.quantity, product1.totalValueInStock());
		
		System.out.print("Quantidade a ser removida do estoque: ");
		product1.removeProducts(sc.nextInt());
		System.out.printf("%s, $%.2f, %d unidades, total: $%.2f%n%n", product1.name, product1.price, product1.quantity, product1.totalValueInStock());
		
		sc.close();
	}

}
