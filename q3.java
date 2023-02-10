import java.util.*;

public class Ims {

  static Scanner sc = new Scanner(System.in);
  static Product[] products = new Product[5];
  static int numberOfProducts = 0;

  public static void main(String[] args) {
    int choice;

    do {
      System.out.println("Inventory Management System");
      System.out.println("1. Product List");
      System.out.println("2. Product Count");
      System.out.println("3. View Product Details");
      System.out.println("4. Edit Product");
      System.out.println("5. Update Inventory");
      System.out.println("6. Exit");
      System.out.println("Enter your choice: ");

      option = sc.nextInt();

      switch (choice) {
        case 1:

          viewProductList();
          break;

        case 2:
          viewProductCount();
          break;

        case 3:
          viewProductDetails();

          break;
        case 4:
          editProduct();

          break;

        case 5:
          updateInventory();

          break;

        case 6:
          System.out.println("Exiting the system...");
          break;

        default:
          System.out.println("Invalid option. Try again.");


      }
    } while (option != 6);
  }

  public static void viewProductList() {
    if (numberOfProducts == 0) {
      System.out.println("No products found.");

      return;
    }else{

    System.out.println("Product List: ");
    for (int i = 0; i < numberOfProducts; i++) {

      System.out.println(products[i].productName);
    }
    }
  }

  public static void viewProductCount() {
    if (numberOfProducts == 0) {
      System.out.println("No products found.");
      return;
    }

    System.out.println("Enter the product name: ");
    sc.nextLine();

    String productName = sc.nextLine();

    int productIndex = -1;
    for (int i = 0; i < numberOfProducts; i++) {
      if (products[i].productName.equals(productName)) {
        productIndex = i;
        break;
      }
    }

    if (productIndex == -1) {
      System.out.println("Product not found.");
      return;
    }

    System.out.println("Product Count: " + products[productIndex].productCount);
  }

  public static void viewProductDetails() {
    if (numberOfProducts == 0) {
      System.out.println("No products found.");
      return;
    }

    System.out.println("Enter the product name: ");
   sc.nextLine();
    String productName = input.nextLine();

    int productIndex = -1;
    for (int i = 0; i < numberOfProducts; i++) {
      if (products[i].productName.equals(productName)) {
        productIndex =i;
        break;
      }
    }

    if (productIndex == -1) {
      System.out.println("Product not found.");
      return;
    }

    System.out.println("Product Specification: " + products[productIndex].productSpecification);
    System.out.println("Cost: " + products[productIndex].productCost);
    System.out.println("Count: " + products[productIndex].productCount);
  }

  public static void editProduct() {
    if (numberOfProducts == 0) {
      System.out.println("No products found.");
      return;
    }

    System.out.println("Enter the product name: ");
    sc.nextLine();

    String productName = sc.nextLine();

    int productIndex = -1;
    for (int i = 0; i < numberOfProducts; i++) {
      if (products[i].productName.equals(productName)) {
        productIndex = i;
        break;
      }
    }

    if (productIndex == -1) {
      System.out.println("Product not found.");
      return;
    }

    System.out.println("Enter the new specification: ");
    String specification = sc.nextLine();

    System.out.println("Enter the new cost: ");
    double cost = input.nextDouble();


    products[productIndex].productSpecification = specification;

    products[productIndex].productCost = cost;


    System.out.println("Product updated successfully.");
  }

  public static void updateInventory() {
    if (numberOfProducts == 0) {
      System.out.println("No products found.");
      return;
    }

    System.out.println("Enter the product name: ");
    sc.nextLine();
    String productName = sc.nextLine();

    int productIndex = -1;
    for (int i = 0; i < numberOfProducts; i++) {
      if (products[i].productName.equals(productName)) {

        productIndex = i;
        break;
      }
    }



    if (productIndex == -1) {
      System.out.println("Product not found.");
      return;
    }

    System.out.println("Enter the number of products to add/delete (positive to add, negative to delete): ");
    int count = sc.nextInt();

    products[productIndex].productCount += count;

    System.out.println("Inventory updated successfully.");
  }
}



class Product {
  String productName;
  String productSpecification;
  double productCost;
  int productCount;

  public Product(String productName, String productSpecification, double productCost, int productCount) {
    this.productName = productName;
    this.productSpecification = productSpecification;
    this.productCost = productCost;
    this.productCount = productCount;
  }
}