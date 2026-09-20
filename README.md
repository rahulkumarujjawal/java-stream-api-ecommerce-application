🛒 𝗝𝗮𝘃𝗮 𝗦𝘁𝗿𝗲𝗮𝗺 𝗔𝗣𝗜 𝗘-𝗖𝗼𝗺𝗺𝗲𝗿𝗰𝗲 𝗣𝗿𝗼𝗷𝗲𝗰𝘁

🚀 A practical E-Commerce project built using Core Java and Java Stream API to understand modern collection processing and functional-style programming.

📌 𝗣𝗿𝗼𝗷𝗲𝗰𝘁 𝗢𝘃𝗲𝗿𝘃𝗶𝗲𝘄

This project is a simple E-Commerce application developed using Core Java and Java Stream API.
The main purpose of this project is to understand and practice how the Stream API can be used to process, filter, transform, sort, and collect product data in a clean and efficient way.
The project uses a list of e-commerce products and performs different operations such as filtering products, sorting products, finding products based on conditions, removing duplicates, and collecting results.

🔍 𝗙𝗶𝗹𝘁𝗲𝗿 𝗽𝗿𝗼𝗱𝘂𝗰𝘁 𝗱𝗮𝘁𝗮
🔄 𝗧𝗿𝗮𝗻𝘀𝗳𝗼𝗿𝗺 𝗱𝗮𝘁𝗮
📊 𝗦𝗼𝗿𝘁 𝗽𝗿𝗼𝗱𝘂𝗰𝘁𝘀
♻️ 𝗥𝗲𝗺𝗼𝘃𝗲 𝗱𝘂𝗽𝗹𝗶𝗰𝗮𝘁𝗲 𝘃𝗮𝗹𝘂𝗲𝘀
🔢 𝗖𝗼𝘂𝗻𝘁 𝗽𝗿𝗼𝗱𝘂𝗰𝘁𝘀
🔎 𝗦𝗲𝗮𝗿𝗰𝗵 𝗽𝗿𝗼𝗱𝘂𝗰𝘁𝘀
📦 𝗖𝗼𝗹𝗹𝗲𝗰𝘁 𝗽𝗿𝗼𝗰𝗲𝘀𝘀𝗲𝗱 𝗱𝗮𝘁𝗮
⚡ 𝗣𝗲𝗿𝗳𝗼𝗿𝗺 𝗼𝗽𝗲𝗿𝗮𝘁𝗶𝗼𝗻𝘀 𝗶𝗻 𝗮 𝗰𝗹𝗲𝗮𝗻 𝗮𝗻𝗱 𝗿𝗲𝗮𝗱𝗮𝗯𝗹𝗲 𝘄𝗮𝘆

The project uses a collection of E-Commerce products and applies different Stream API operations to process the data.

🚀 Technologies Used
☕ Java
🔥 Java Stream API
💡 Lambda Expressions
📚 Collections Framework
📋 List
🗂️ Set
🗺️ Map
🔢 Comparator
⚙️ Java 8+


🔥 Stream API Concepts Implemented


𝟭️⃣ 𝗳𝗶𝗹𝘁𝗲𝗿()
🔍 Used to filter products based on a specific condition.
products.stream()
        .filter(product -> product.getPrice() > 1000)
        .collect(Collectors.toList());
        
𝟮️⃣ 𝗺𝗮𝗽()
🔄 Used to transform product data from one form to another.
products.stream()
        .map(Product::getProductName)
        .collect(Collectors.toList());
        
𝟯️⃣ 𝘀𝗼𝗿𝘁𝗲𝗱()
📊 Used to sort products based on price, name, or other properties.
products.stream()
        .sorted(Comparator.comparing(Product::getPrice))
        .collect(Collectors.toList());
        
𝟰️⃣ 𝗱𝗶𝘀𝘁𝗶𝗻𝗰𝘁()
♻️ Used to remove duplicate product values.

products.stream()
        .map(Product::getProductName)
        .distinct()
        .collect(Collectors.toList());
𝟱️⃣ 𝗰𝗼𝗹𝗹𝗲𝗰𝘁()
📦 Used to collect Stream results into collections such as List and Set.
products.stream()
        .filter(product -> product.getPrice() > 1000)
        .collect(Collectors.toList());
𝟲️⃣ 𝗳𝗼𝗿𝗘𝗮𝗰𝗵()
🔁 Used to perform an operation on every product.
products.stream()
        .forEach(product -> System.out.println(product));

𝟳️⃣ 𝗰𝗼𝘂𝗻𝘁()
🔢 Used to count products based on a specific condition.
long count = products.stream()
        .filter(product -> product.getPrice() > 1000)
        .count();
        
𝟴️⃣ 𝗺𝗶𝗻() & 𝗺𝗮𝘅()
💰 Used to find the product with the minimum or maximum price.
🔻 Minimum Price
products.stream()
        .min(Comparator.comparing(Product::getPrice));
🔺 Maximum Price
products.stream()
        .max(Comparator.comparing(Product::getPrice));
9️⃣ 𝗳𝗶𝗻𝗱𝗙𝗶𝗿𝘀𝘁()
🔎 Used to find the first matching product.

products.stream()
        .filter(product -> product.getProductName().equals("Laptop"))
        .findFirst();
🔟 𝗮𝗻𝘆𝗠𝗮𝘁𝗰𝗵(), 𝗮𝗹𝗹𝗠𝗮𝘁𝗰𝗵() & 𝗻𝗼𝗻𝗲𝗠𝗮𝘁𝗰𝗵()
✅ Used to check conditions against product data.

products.stream()
        .anyMatch(product -> product.getPrice() > 50000);
🛍️ E-Commerce Operations

This project demonstrates different real-world E-Commerce data-processing operations:

🛒 Displaying products
🔍 Filtering products by price
🏷️ Filtering products by brand/category
📊 Sorting products
💰 Finding expensive products
💵 Finding low-cost products
♻️ Removing duplicate products
🔎 Searching products
🔢 Counting products
🔻 Finding minimum price
🔺 Finding maximum price
🔄 Transforming product information
📦 Collecting results into List and Set
