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
		
		SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = inputDateFormat.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String orderStatus = sc.next().toUpperCase();
		System.out.print("How many itens to this order? ");
		Integer itemQuantity = sc.nextInt();
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus));
		for (int i = 1; i <= itemQuantity; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();

			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, product.getPrice());
			orderItem.setProduct(product);
			order.addItem(orderItem);
		}

		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + outputDateFormat.format(order.getMoment()));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + client.getName() + " (" + inputDateFormat.format(client.getBirthDate()) + ") - " + client.getEmail());
		System.out.println("Order items:");
		for (OrderItem orderItem : order.getOrderItems()) {
			System.out.println(orderItem.getProduct().getName() + ", $" + orderItem.getProduct().getPrice()
					+ ", Quantity: " + orderItem.getQuantity() + ", Subtotal: $" + orderItem.subTotal());
		}
		
		System.out.println("Total price: $" + order.total());
		
		sc.close();

	}

}
