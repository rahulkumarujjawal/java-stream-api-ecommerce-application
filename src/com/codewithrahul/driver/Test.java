package com.codewithrahul.driver;

import com.codewithrahul.orderdetails.Order;
import com.codewithrahul.productdetails.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(

                new Product(101, "Laptop", "Electronics", "Apple", 90000, 5, 4.8),
                new Product(102, "Mobile", "Electronics", "Samsung", 50000, 10, 4.5),
                new Product(103, "Mouse", "Accessories", "Logitech", 1500, 50, 4.2),

                new Product(104, "Keyboard", "Accessories", "Logitech", 3000, 30, 4.3),
                new Product(106, "Headphone", "Accessories", "Sony", 8000, 20, 4.7),
                new Product(107, "Mobile", "Electronics", "Apple", 80000, 7, 4.9));

        List<Order> orders = Arrays.asList(

                new Order(1001, "Rahul-ujjawal-sharma", "COMPLETED", 95000, Arrays.asList(products.get(0), products.get(2))),
                new Order(1002, "Sural-lal-Savera", "PENDING", 53000, Arrays.asList(products.get(1), products.get(3))),
                new Order(1003, "Sanjiv-kumar", "COMPLETED", 88000, Arrays.asList(products.get(4), products.get(5))),
                new Order(1004, "Chhotu-Sharma", "CANCELLED", 80000, Arrays.asList(products.get(5))));

        // 1. filter()
        // Find products above ₹50,000

        System.out.println("\n--- FILTER ---");
        products.stream().filter(product -> product.getPrice() > 50000)
                .forEach(Name -> System.out.println(Name));


        
        // 2. map()
        // Get only product names

        System.out.println("\n--- MAP ---");

        products.stream().map(product->product.getName())
                .forEach(name -> System.out.println(name));

        // 3. sorted()
        // Sort products by price

        System.out.println("\n--- SORTED ---");

        products.stream().sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(product -> System.out.println(product));

        // 4. distinct()
        // Get unique product names

        System.out.println("\n--- DISTINCT ---");

        products.stream().map(Product::getName).distinct().forEach(name -> System.out.println(name));

        // 5. limit()
        // Get first 3 products

        System.out.println("\n--- LIMIT ---");

        products.stream().limit(3).forEach(product -> System.out.println(product));

        // 6. skip()
        // Skip first 3 products

        System.out.println("\n--- SKIP ---");

        products.stream().skip(3).forEach(product -> System.out.println(product));

        // 7. peek()
        // Debug / inspect data

        System.out.println("\n--- PEEK ---");

        products.stream().filter(product -> product.getPrice() > 50000)

                .peek(product -> System.out.println("After filter: " + product.getName()))

                .map(Product::getName)

                .peek(name -> System.out.println("After map: " + name))

                .forEach(name -> System.out.println("Final: " + name));

        // 8. flatMap()
        // Get ALL products from ALL orders

        System.out.println("\n--- FLAT MAP ---");

        orders.stream().flatMap(order -> order.getProducts().stream()).forEach(product -> System.out.println(product));

        // 9. collect()
        // Products above ₹50,000 into List

        System.out.println("\n--- COLLECT ---");

        List<Product> expensiveProducts = products.stream().filter(product -> product.getPrice() > 50000)
                .collect(Collectors.toList());

        System.out.println(expensiveProducts);

        // 10. count()
        // Count electronics

        System.out.println("\n--- COUNT ---");

        long electronicsCount = products.stream().filter(product -> product.getCategory().equals("Electronics"))
                .count();

        System.out.println("Electronics count = " + electronicsCount);

        // 11. min()
        // Cheapest product

        System.out.println("\n--- MIN ---");

        Optional<Product> cheapest = products.stream().min(Comparator.comparingDouble(Product::getPrice));

        cheapest.ifPresent(product -> System.out.println("Cheapest = " + product));

        /*
         * // ================================================== // 12. max() // Most
         * expensive product // ==================================================
         *
         * System.out.println("\n--- MAX ---");
         *
         * Optional<Product> expensive = products.stream() .max(
         * Comparator.comparingDouble( Product::getPrice ) );
         *
         * expensive.ifPresent(product -> System.out.println( "Most expensive = " +
         * product ));
         *
         */

        // 13. reduce()
        // Total product price

        System.out.println("\n--- REDUCE ---");

        double totalPrice = products.stream().map(Product::getPrice).reduce(0.0, (a, b) -> a + b);

        System.out.println("Total Price = ₹" + totalPrice);

        // 14. findFirst()
        // First Apple product

        System.out.println("\n--- FIND FIRST ---");

        Optional<Product> firstApple = products.stream().filter(product -> product.getBrand().equals("Apple"))
                .findFirst();

        firstApple.ifPresent(product -> System.out.println(product));

        // 15. findAny()
        // Find any Logitech product

        System.out.println("\n--- FIND ANY ---");

        Optional<Product> anyLogitech = products.stream().filter(product -> product.getBrand().equals("Logitech"))
                .findAny();

        anyLogitech.ifPresent(product -> System.out.println(product));

        // 16. anyMatch()
        // Is there any product above ₹1 lakh?

        System.out.println("\n--- ANY MATCH ---");

        boolean anyAboveOneLakh = products.stream().anyMatch(product -> product.getPrice() > 100000);

        System.out.println("Any product above 1 lakh = " + anyAboveOneLakh);

        // 17. allMatch()
        // Are all products rating above 4?

        System.out.println("\n--- ALL MATCH ---");

        boolean allRatingAboveFour = products.stream().allMatch(product -> product.getRating() > 4);

        System.out.println("All rating above 4 = " + allRatingAboveFour);

        // 18. noneMatch()
        // Is there NO product below ₹500?

        System.out.println("\n--- NONE MATCH ---");

        boolean noCheapProduct = products.stream().noneMatch(product -> product.getPrice() < 500);

        System.out.println("No product below ₹500 = " + noCheapProduct);

        // 19. groupingBy()
        // Group products by category

        System.out.println("\n--- GROUPING BY ---");

        Map<String, List<Product>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        productsByCategory.forEach((category, productList) -> System.out.println(category + " = " + productList));

        // 20. partitioningBy()
        // Expensive vs normal products

        System.out.println("\n--- PARTITIONING BY ---");

        Map<Boolean, List<Product>> expensivePartition = products.stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice() > 50000));

        System.out.println("Expensive = " + expensivePartition.get(true));

        System.out.println("Normal = " + expensivePartition.get(false));

        // 21. toMap()
        // Product ID -> Product Name

        System.out.println("\n--- TO MAP ---");

        Map<Integer, String> productMap = products.stream().collect(Collectors.toMap(Product::getId, Product::getName));

        System.out.println(productMap);

        // 22. joining()
        // All product names in one String

        System.out.println("\n--- JOINING ---");

        String productNames = products.stream().map(Product::getName).collect(Collectors.joining(", "));

        System.out.println(productNames);

        // 23. groupingBy() + counting()
        // How many products in each category?

        System.out.println("\n--- GROUPING + COUNTING ---");

        Map<String, Long> categoryCount = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));

        System.out.println(categoryCount);

        // 24. Order Stream
        // Completed orders above ₹50,000
        // Get customer names
      

        System.out.println("\n--- REAL ORDER PIPELINE ---");

        List<String> customers = orders.stream()

                // Kaun chahiye?
                .filter(order -> order.getStatus().equals("COMPLETED"))

                // Amount condition
                .filter(order -> order.getAmount() > 50000)

                // Order ko customer name mein convert karo
                .map(Order::getCustomerName)

                // Duplicate customer remove
                .distinct()

                // Alphabetical order
                .sorted()

                // Maximum 5 customers
                .limit(5)

                // Final result
                .collect(Collectors.toList());

        System.out.println(customers);

        // 25. flatMap + filter + map + distinct  Completed orders ke products

        System.out.println("\n--- COMPLETED ORDER PRODUCTS ---");

        List<String> completedProductNames = orders.stream()

                .filter(order -> order.getStatus().equals("COMPLETED"))

                .flatMap(order -> order.getProducts().stream())

                .map(Product::getName)

                .distinct()

                .sorted()

                .collect(Collectors.toList());

        System.out.println(completedProductNames);

    
        // 26. Order total using reduce()

        System.out.println("\n--- TOTAL ORDER AMOUNT ---");

        double totalOrderAmount = orders.stream()

                .map(Order::getAmount)

                .reduce(0.0, (a, b) -> a + b);

        System.out.println("Total Order Amount = ₹" + totalOrderAmount);

        // 27. forEach()
        // Send order update

        System.out.println("\n--- ORDER UPDATE ---");

        orders.stream().filter(order -> order.getStatus().equals("COMPLETED")).forEach(order -> System.out
                .println("Email sent to " + order.getCustomerName() + " for Order " + order.getOrderId()));
    }
    }

