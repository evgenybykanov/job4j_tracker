package ru.job4j.pojo;

public class ShopDrop {
    public static void main(String[] args) {
        Product[] products = new Product[10];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());

        }
        System.out.println();
        products[1] = products[2];
        products[2] = null;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
    public static Product[] leftShift(Product[] products, int index) {
        for (index = 0; index < products.length; index++) {
            if ((index == products.length - 1)) {
                products[index] = null;
                break;
            }
            products[index] = products[index + 1];
        }
        return products;

    }
}
