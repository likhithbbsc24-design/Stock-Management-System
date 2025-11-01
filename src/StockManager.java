import java.util.*;

public class StockManager {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Supplier> suppliers = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added successfully!");
    }

    public void listProducts() {
        if (products.isEmpty()) System.out.println("No products found!");
        else products.forEach(System.out::println);
    }

    public void updateQuantity(int id, int newQty) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setQuantity(newQty);
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void addSupplier(Supplier s) {
        suppliers.add(s);
        System.out.println("Supplier added successfully!");
    }

    public void listSuppliers() {
        if (suppliers.isEmpty()) System.out.println("No suppliers found!");
        else suppliers.forEach(System.out::println);
    }
}
