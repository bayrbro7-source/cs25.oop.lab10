package dl4;

import java.util.*;
import java.util.stream.*;

public class ProductAnalyzer {
    public static Map<String, List<Product>> analyze(List<Product> products) {
        return products.stream()
                .filter(p -> p.getPrice() > 1000)
                .sorted((p1, p2) -> Integer.compare(p2.getPrice(), p1.getPrice()))
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("gutal", "huwtsas", 1500),
            new Product("tsamtsa", "huwtsas", 1200),
            new Product("nom", "erdeme", 800)
        );

        Map<String, List<Product>> result = analyze(products);
        result.forEach((cat, list) -> System.out.println(cat + ": " + list));
    }
}

