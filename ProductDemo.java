/**
 * ProductDemo.java
 * A demo of methods and objects
 * Author: Eddie C.
 * Date: 2025-10-13
 */

import static java.lang.System.*;

public class ProductDemo {

	public static void main(String args[]) {

		Product product1 = new Product("Laptop", 999.99, 12345); // Part 1
		Product product2 = new Product("Laptop", 999.99, 12345); // Part 2
		Product product3 = new Product("Tablet", 299.99, 54321); // Part 3.2
		Product product4 = new Product("Desktop", 5100.00, 84560); // Part 4.3

		out.println("Product 1 Information"); // part 1
		product1.printProductInfo(true);

		out.println("");

		out.println("Product 2 Information"); // part 2
		product2.printProductInfo(true);

		out.println("");
		out.println("Product 1 and \n Product 2 are equal \t: " + (product1.equals(product2)));

		out.println("");
		out.println("Product 3 Information with product code "); // part 2
		product3.printProductInfo(true);

		out.println("");
		out.println("Product 3 Information without product code"); // part 2
		product3.printProductInfo();

		out.println("");
		out.println("Total Product Count \t: " + Product.getProductCount());

		out.println("");
		out.println("Tax Amount for \n Product 1\t\t: $"
				+ Product.formatThreeDecimals(product1.getTaxRate() * product1.getPrice()));

				
	}

}
