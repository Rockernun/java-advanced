package lambda.todo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator 함수형 인터페이스: 객체의 정렬 기준을 정의하는 함수형 인터페이스
 * compare(T o1, T o2)
 * 결과가 음수이면 앞의 객체가 먼저, 양수이면 뒤에 있는 객체가 먼저 정렬된다.
 */
public class Ex06ComparatorLambdaTodo {
    static class Product {
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String toString() {
            return name + ": " + price;
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("맥북 프로", 3000000);
        Product product2 = new Product("아이패드 프로", 2000000);
        Product product3 = new Product("에어팟 프로", 300000);

        products.add(product1);
        products.add(product2);
        products.add(product3);

//        products.sort((p1, p2) -> Integer.compare(p1.price, p2.price));
        products.sort(Comparator.comparingInt(p -> p.price));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}

/**
 * 에어팟 프로: 300000
 * 아이패드 프로: 2000000
 * 맥북 프로: 3000000
 */