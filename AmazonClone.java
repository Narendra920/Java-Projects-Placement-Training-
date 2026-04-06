import java.util.*;

class Product {
    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class AmazonClone {
    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<Product> cart = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample products
        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Phone", 20000));
        products.add(new Product(3, "Headphones", 2000));

        while(true) {
            System.out.println("\n1.View Products 2.Add to Cart 3.View Cart 4.Checkout 5.Exit");
            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    for(Product p : products)
                        System.out.println(p.id + " " + p.name + " ?" + p.price);
                    break;

                case 2:
                    System.out.print("Enter product id: ");
                    int id = sc.nextInt();
                    for(Product p : products) {
                        if(p.id == id) {
                            cart.add(p);
                            System.out.println("Added to cart");
                        }
                    }
                    break;

                case 3:
                    int total = 0;
                    for(Product p : cart) {
                        System.out.println(p.name);
                        total += p.price;
                    }
                    System.out.println("Total: ?" + total);
                    break;

                case 4:
                    System.out.println("Order placed!");
                    cart.clear();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}