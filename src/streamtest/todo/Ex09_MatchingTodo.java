package streamtest.todo;

import day11.stream2.student.todo.common.Product; import java.util.List;

public class Ex09_MatchingTodo {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1,"키보드","PC",45000,12),
                new Product(2,"마우스","PC",25000,0),
                new Product(3,"텀블러","LIFE",18000,30)
        );

        // TODO 1: 모든 상품의 가격이 1000원 이상인지 검사하세요.
        boolean isAllProductsAreGreaterThanOneThousand = products.stream().allMatch(p -> p.getPrice() >= 1000);
        System.out.println("모든 상품이 1000원 이상입니까? " + isAllProductsAreGreaterThanOneThousand);

        // TODO 2: 하나라도 품절 상품이 있는지 검사하세요.
        boolean isAnyProductIsSoldOut = products.stream().anyMatch(p -> p.getStock() == 0);
        System.out.println("품절 상품이 하나라도 있습니까? " + isAnyProductIsSoldOut);

        // TODO 3: FOOD 카테고리 상품이 하나도 없는지 검사하세요.
        boolean isNoFoodCategory = products.stream().noneMatch(p -> p.getCategory().equals("FOOD"));
        System.out.println("Food 카테고리 상품이 하나도 없습니까? " + isNoFoodCategory);
    }
}

/**
 * 모든 상품이 1000원 이상입니까? true
 * 품절 상품이 하나라도 있습니까? true
 * Food 카테고리 상품이 하나도 없습니까? true
 */