/**
 * Product.java
 * Represents a product with name, price, and product code.
 * Author: Eddie C.
 * Date: 2025-10-13
 */

import static java.lang.System.*;

public class Product {

	private String name;
	private double price;
	private int productCode;
	private static final double TAX_RATE = 0.10;

	private static int productCount = 0;

	/**
	 * Gets the product's tax rate.
	 * 
	 * @return the tax rate for the product
	 */
	public double getTaxRate() {
		return TAX_RATE;
	}

	/**
	 * Gets the product's price.
	 * 
	 * @return the price of the product
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Gets the number of Products created.
	 * 
	 * @return the number of Products
	 */
	public static int getProductCount() {
		return productCount;
	}

	/**
	 * Constructs a Product with the name, price, and product code.
	 * 
	 * @param name        the product name
	 * @param price       the product's price
	 * @param productCode the product code
	 */
	Product(String name, double price, int productCode) {
		this.name = name;
		this.price = price;
		this.productCode = productCode;
		productCount++;
	}

	/**
	 * Prints the basic product information to the standard output.
	 * Displays the product name and price in a formatted manner.
	 * 
	 * @example Example output:
	 *          Name : Product Name
	 *          Price : $19.99
	 */
	public void printProductInfo() {
		out.println(" Name\t\t\t: " + name +
				"\n Price\t\t\t: $" + price);
	}

	/**
	 * Prints product information with an option to include additional details.
	 * When moreInfo is true, also displays the product code along with the basic
	 * information.
	 * 
	 * @param moreInfo if true, includes product code in the output; if false,
	 *                 only displays name and price.
	 * 
	 * @example Example output when moreInfo is true:
	 *          Name : Product Name
	 *          Price : $19.99
	 *          Product Code : 12345
	 */
	public void printProductInfo(boolean moreInfo) {
		printProductInfo();
		if (moreInfo) {
			out.println(" Product Code \t\t: " + productCode);
		}
	}

	// overriding default equals method
	/**
	 * Compares this product to the specified object for equality.
	 * Returns true if the given object is also a Product and has the same
	 * name, price, and product code as this product.
	 *
	 * @param obj the object to compare with this product for equality
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		// checking is the references are equal
		if (this == obj)
			return true;

		// check if the classes are different or null
		if (obj == null || this.getClass() != obj.getClass())
			return false;

		// comparing individual attributes
		Product itemCompared = (Product) obj;
		return this.name.equals(itemCompared.name) &&
				this.price == itemCompared.price &&
				this.productCode == itemCompared.productCode;
	}

	/**
	 * Formats a decimal number to three decimal places with grouping separators.
	 * Returns a string representation of the number formatted according to the
	 * default locale's number formatting rules.
	 *
	 * @param decimal the decimal number to be formatted
	 * @return a formatted string representation of the number with three decimal
	 *         places and grouping separators (commas for thousands)
	 * 
	 * @throws IllegalArgumentException if the decimal value is NaN or infinite
	 * 
	 * @example
	 *          // Returns "1,234.568"
	 *          formatThreeDecimals(1234.56789);
	 * 
	 * @example
	 *          // Returns "0.000"
	 *          formatThreeDecimals(0.0);
	 * 
	 * @example
	 *          // Returns "999,999.999"
	 *          formatThreeDecimals(999999.9994);
	 */
	public static String formatThreeDecimals(double decimal) {
		return String.format("%,.3f", decimal);
	}
}
