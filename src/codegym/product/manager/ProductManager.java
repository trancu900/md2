package codegym.product.manager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        productList.add(new Product(1, "A", 9807));
        productList.add(new Product(2, "A", 934827));
        productList.add(new Product(4, "A", 9817));
        productList.add(new Product(5, "A", 93207));
    }

    public void addProduct() {
        //System.out.println("nhap id:");
        // int id = Integer.parseInt(scanner.nextLine());
        long id = System.currentTimeMillis() / 1000;
        System.out.println(id);
        System.out.println("Nhap Ten sp:");
        String name = scanner.nextLine();

        System.out.println("Nhap gia:");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        productList.add(product);
    }

    public void showProducts() {
        System.out.printf("%-12s%-12s%-12s\n", "Id", "Ten SP", "Gia");
        for (Product product : productList) {
            System.out.printf("%-12s%-12s%-12s\n", product.getId(), product.getName(), product.getPrice());
        }
    }

    public void sortByPriceASC() {
        List<Product> newProductList = new ArrayList<>(productList);
        Comparator<Product> priceASC = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o1.getPrice() - o2.getPrice();
                return result == 0 ? 0 : (result > 0 ? 1 : -1);

            }
        };
        newProductList.sort(priceASC);
        System.out.printf("%-12s%-12s%-12s\n", "Id", "Ten SP", "Gia");
        for (Product product : newProductList) {
            System.out.printf("%-12s%-12s%-12s\n", product.getId(), product.getName(), product.getPrice());
        }
    }

    public void search() {
//        String query = "dsf";
//        for (Product product : productList) {
//          if (product.getName().contains(query))
//        }
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.showProducts();
        productManager.sortByPriceASC();
        productManager.showProducts();
    }
}
