
# Java Object-Oriented Programming Exercises

This repository contains hands-on Java exercises demonstrating **class design**, **encapsulation**, and **static members**. The demo includes a `Product` class and its corresponding `ProductDemo` runner that illustrate core object-oriented programming concepts.

---

## Packages and Key Files

- [Product.java](https://product.java/) — Product model with encapsulation, `equals` override, and decimal formatting.
- [ProductDemo.java](https://productdemo.java/) — Demo runner that creates `Product` instances and tests all functionality.

---

## Build (from the project folder)

```sh
javac Product.java ProductDemo.java
```

## Run

```sh
java ProductDemo
```

---

## Example Output

```text
Product 1 Information
 Name                   : Laptop
 Price                  : $999.99
 Product Code           : 12345

Product 2 Information
 Name                   : Laptop
 Price                  : $999.99
 Product Code           : 12345

Product 1 and
 Product 2 are equal    : true

Product 3 Information with product code
 Name                   : Tablet
 Price                  : $299.99
 Product Code           : 54321

Product 3 Information without product code
 Name                   : Tablet
 Price                  : $299.99

Total Product Count     : 4

Tax Amount for
 Product 1              : $99.999
```

---

## Key Features

- Encapsulation: All fields are private with public getter methods.
- Method Overloading: `printProductInfo()` has two versions (with and without product code).
- Static Members: `productCount` tracks total `Product` instances created.
- Equality Testing: Custom `equals()` method compares all attributes.
- Decimal Formatting: `formatThreeDecimals()` utility method for consistent number display.

---

## Usage Notes

- Use [`Product.formatThreeDecimals`](https://product.java/) for formatting numbers to three decimal places with grouping separators.
- [`Product.getProductCount`](https://product.java/) returns the number of created `Product` instances.
- [`Product.getTaxRate`](https://product.java/) and [`Product.getPrice`](https://product.java/) provide access to private fields.
- The `equals` method properly handles null checks and class comparisons.

---

## Class Structure

### Product Class
- Fields: `name`, `price`, `productCode` (all private)
- Static Fields: `productCount`, `TAX_RATE`
- Methods: Constructors, getters, `printProductInfo` (overloaded), `equals`, `formatThreeDecimals`

### ProductDemo Class
- Main Method: Creates multiple `Product` instances and demonstrates all features.
- Testing: Equality comparison, method overloading, static counter, tax calculation.

---

## Questions
For questions, contact Eddie or refer to course T0502 materials.
