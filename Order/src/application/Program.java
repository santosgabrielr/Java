package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth_date = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birth_date);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		Integer qtd_items = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < qtd_items; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String product_name = sc.nextLine();
			System.out.print("Product price: ");
			double product_price = sc.nextDouble();
			
			Product product = new Product(product_name, product_price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			sc.nextLine();
			
			OrderItem orderItem = new OrderItem(quantity, product_price, product);
			
			order.addItem(orderItem);
		
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.print(order);
		
		sc.close();
	}
	
}
