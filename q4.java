import java.util.Scanner;

public class Ims{
  static Scanner sc = new Scanner(System.in);

  static class Product {
    String pname;
    int pcost;
    int pcount;


    Product(String name, int cost, int count) {
      this.pname = pname;
      this.pcost = pcost;
      this.pcount = pcount;
    }
  }

  static Product[] products = {

    new Product("oil", 150, 10),
    new Product("rice", 500, 20),
    new Product("Milk", 90, 15),
    new Product("bread", 250, 5),
    new Product("butter", 10, 30)


  };

  public static void main(String[] args) {
    int choice;
    do {
      System.out.println("--- Inventory Management System ---");
      System.out.println("1. Product List");
      System.out.println("2. Product count");
      System.out.println("3. View Product details");
      System.out.println("4. Edit Product");
      System.out.println("5. Update Inventory");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");
      option = sc.nextInt();
      switch (option) {
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
          System.out.println(" done by using Inventory Management System");
          break;

        default:
          System.out.println("Invalid .try again!.");
      }
    } while (choice != 6);
  }

  private static void viewProductList() {
    System.out.println("Product List:");
    for (int i = 0; i < products.length; i++) {
      System.out.println((i + 1) + ". " + products[i].pname);
    }
  }

  private static void viewProductCount() {
    System.out.print("Enter Product productname: ");
    String pname = sc.next();
    int index = -1;
    for (int i = 0; i < products.length; i++) {
      if (products[i].pname.equalsIgnoreCase(pname)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      System.out.println("Product not found");
    } else {
      System.out.println("Quantity available: " + products[index].pcount);
    }
  }


  private static void viewProductDetails() {
    System.out.print("Enter Product name: ");
    String name = sc.next();
    int index = -1;
    for (int i = 0; i < products.length; i++) {
      if (products[i].pname.equalsIgnoreCase(pname)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
     
      System.out.println("Product not found");
    } else {
      System.out.println("Product Name: " + products[index].pname);
      System.out.println("Product Cost: " + products[index].pcost);
      System.out.println("Product Quantity: " + products[index].pcount);
    }
  }

  private static void editProduct() {
    System.out.print("Enter Product name: ");
    String pname = sc.next();
    int index = -1;
    for (int i = 0; i < products.length; i++) {
      if (products[i].pname.equalsIgnoreCase(pname)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      System.out.println("Product not found");
    } else {
      System.out.print("Enter new Product name: ");
      String newName = sc.next();
      System.out.print("Enter new Product cost: ");
      int newCost = sc.nextInt();
      System.out.print("Enter new Product quantity: ");
      int newCount = sc.nextInt();
      products[index].pname = newName;
      products[index].pcost = newCost;
      products[index].pcount = newCount;
      System.out.println("Product updated successfully");
    }
  }


  private static void updateInventory() {
    System.out.print("Enter Product name: ");
    String pname = sc.next();
    int index = -1;
    for (int i = 0; i < products.length; i++) {
      if (products[i].pname.equalsIgnoreCase(pname)) {
        index = i;
        break;
      }
    }


    if (index == -1) {
      System.out.println("Product not found");
    } else {
      System.out.print("Enter quantity to add/delete: ");
      int pcount = sc.nextInt();
      products[index].pcount += pcount;
      System.out.println("Inventory updated successfully");
    }
  }
}