import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockManager sm = new StockManager();

        while (true) {
            System.out.println("\n=== STOCK MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Add Supplier");
            System.out.println("5. View Suppliers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            
            switch (ch) {
                case 1:
                    System.out.print("Enter ID: "); int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: "); String name = sc.nextLine();
                    System.out.print("Enter Quantity: "); int qty = sc.nextInt();
                    System.out.print("Enter Price: "); double price = sc.nextDouble();
                    sm.addProduct(new Product(id, name, qty, price));
                    break;
                case 2:
                    sm.listProducts();
                    break;
                case 3:
                    System.out.print("Enter Product ID: "); int pid = sc.nextInt();
                    System.out.print("Enter New Quantity: "); int nqty = sc.nextInt();
                    sm.updateQuantity(pid, nqty);
                    break;
                case 4:
                    System.out.print("Enter Supplier ID: "); int sid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: "); String sname = sc.nextLine();
                    System.out.print("Enter Contact: "); String contact = sc.nextLine();
                    sm.addSupplier(new Supplier(sid, sname, contact));
                    break;
                case 5:
                    sm.listSuppliers();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
