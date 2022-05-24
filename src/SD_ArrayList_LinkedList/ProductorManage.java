package SD_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductorManage {
    Scanner input = new Scanner(System.in);

    ArrayList<Product> products = new ArrayList<>();

    public void Menu(){
        System.out.println("Menu: ");
        System.out.println("1. add Product");
        System.out.println("2. add remain Product");
        System.out.println("3. add Delete Product");
        System.out.println("4. add Show Products");
        System.out.println("5. add Find Product");
        System.out.println("6. add Show Product follow PriceUp");
        System.out.println("7. Exit");


        int choice = Integer.parseInt(input.nextLine());
        switch (choice){
            case 1:
                AddProduct();
                break;
            case 2:
                RemainProduct();
                break;
            case 3:
                DeleteProduct();
                break;
            case 4:
                ShowProduct();
                break;
            case 5:
                FindProduct();
                break;
            case 6:
                ShowProductFollowPriceUp();
                break;
            case 7:
                System.exit(0);
        }
    }

    public void AddProduct(){
        System.out.println("Enter ProductId: ");
        int productID = Integer.parseInt(input.nextLine());
        System.out.println("Enter ProductName: ");
        String name = input.nextLine();
        System.out.println("Enter Price: ");
        double price = Double.parseDouble(input.nextLine());

        Product product = new Product(productID,name,price);
        products.add(product);
    }

    public void RemainProduct(){
        System.out.println("Enter ProductId need remain: ");
        int productID = Integer.parseInt(input.nextLine());
        System.out.println("Enter  NewProductName ");
        String name = input.nextLine();
        System.out.println("Enter NewPrice: ");
        double price = Double.parseDouble(input.nextLine());
        for (int i =0;i<products.size();i++){
            if (productID==products.get(i).getProductId()){
                products.get(i).setProductName(name);
                products.get(i).setPrice(price);
            }
        }
    }

    public void DeleteProduct(){
        System.out.println("Enter ProductId need Delete: ");
        int productID = Integer.parseInt(input.nextLine());
        products.remove(productID);
    }

    public void ShowProduct(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Element "+i+": " + products.get(i));
        }
    }

    public void FindProduct(){
        System.out.println("Enter  FindNameProduct ");
        String name = input.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (name.equals(products.get(i).getProductName())){
                System.out.println(products.get(i));
            }
        }
    }

    public void ShowProductFollowPriceUp(){
        products.sort(Product::compareTo);
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Element "+i+": " + products.get(i));
        }

    }
}
