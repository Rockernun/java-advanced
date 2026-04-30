package streamtest.todo;

import day11.stream2.student.todo.common.Product;
import java.util.Comparator;
import java.util.List;

public class Ex07_SortingTodo {
    public static void main(String[] args) {
        List<Product> products = List.of(new Product(1,"키보드","PC",45000,12), new Product(2,"마우스","PC",25000,0), new Product(3,"노트북","PC",1200000,3), new Product(4,"텀블러","LIFE",18000,30));
        // TODO 1: 가격 오름차순으로 정렬해 출력하세요.
        products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);

        System.out.println();

        // TODO 2: 재고 내림차순으로 정렬해 출력하세요.
        products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(System.out::println);

        System.out.println();

        // TODO 3: 카테고리 오름차순, 같은 카테고리에서는 가격 내림차순으로 정렬하세요.
        products.stream().sorted(Comparator.comparing(Product::getCategory)).sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(
                System.out::println);
    }
}

/**
 * Product{id=4, name='텀블러', category='LIFE', price=18000, stock=30}
 * Product{id=2, name='마우스', category='PC', price=25000, stock=0}
 * Product{id=1, name='키보드', category='PC', price=45000, stock=12}
 * Product{id=3, name='노트북', category='PC', price=1200000, stock=3}
 *
 * Product{id=3, name='노트북', category='PC', price=1200000, stock=3}
 * Product{id=1, name='키보드', category='PC', price=45000, stock=12}
 * Product{id=2, name='마우스', category='PC', price=25000, stock=0}
 * Product{id=4, name='텀블러', category='LIFE', price=18000, stock=30}
 *
 * Product{id=3, name='노트북', category='PC', price=1200000, stock=3}
 * Product{id=1, name='키보드', category='PC', price=45000, stock=12}
 * Product{id=2, name='마우스', category='PC', price=25000, stock=0}
 * Product{id=4, name='텀블러', category='LIFE', price=18000, stock=30}
 */