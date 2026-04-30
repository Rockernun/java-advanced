package streamtest.todo;

import day11.stream2.student.todo.common.Product; import java.util.List;
public class Ex05_FilteringTodo {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1,"키보드","PC",45000,12),
                new Product(2,"마우스","PC",25000,0),
                new Product(3,"텀블러","LIFE",18000,30),
                new Product(4,"키보드","PC",45000,12)
        );

        // TODO 1: 재고가 1개 이상인 상품만 출력하세요.
        products.stream().filter(p -> p.getStock() >= 1).forEach(System.out::println);

        System.out.println();

        // TODO 2: 카테고리가 PC인 상품만 출력하세요.
        products.stream().filter(p -> p.getCategory().equals("PC")).forEach(System.out::println);

        System.out.println();

        // TODO 3: 상품명만 추출한 뒤 distinct()로 중복 이름을 제거해 출력하세요.
        products.stream().map(Product::getName).distinct().forEach(System.out::println);
    }
}

/**
 * Product{id=1, name='키보드', category='PC', price=45000, stock=12}
 * Product{id=3, name='텀블러', category='LIFE', price=18000, stock=30}
 * Product{id=4, name='키보드', category='PC', price=45000, stock=12}
 *
 * Product{id=1, name='키보드', category='PC', price=45000, stock=12}
 * Product{id=2, name='마우스', category='PC', price=25000, stock=0}
 * Product{id=4, name='키보드', category='PC', price=45000, stock=12}
 *
 * 키보드
 * 마우스
 * 텀블러
 */
