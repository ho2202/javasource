package oop;

import java.time.LocalDate;

public class ProductEx1 {
    public static void main(String[] args) {

        Product product1 = new Product();

        product1.pCode = "p123";
        product1.pName = "운동화";
        product1.price = 1234;
        product1.regiDate = LocalDate.now();

        System.out.println(product1);

    }
}
