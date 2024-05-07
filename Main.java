package shopping;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(0, "apple", 100, 0);
        Product p2 = new Product(1, "mango", 150, 0);
        Product p3 = new Product(2, "kiwi", 200, 0);
        Cart c = new Cart();
        Scanner sc = new Scanner(System.in);
        String continueChoice = "yes";

        while (continueChoice.equals("yes")) {
            System.out.println("What do you want to add?");
            System.out.println("For Apple write 1");
            System.out.println("For Mango write 2");
            System.out.println("For Kiwi write 3");

            if (sc.hasNextLine()) {
                String choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        c.AddToCart(p1);
                        break;
                    case "2":
                        c.AddToCart(p2);
                        break;
                    case "3":
                        c.AddToCart(p3);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

                System.out.println("Do you want to continue shopping? (yes/no)");
                continueChoice = sc.nextLine();
            }
        }
        
        c.Content();
        c.Totalprice();
        System.out.println("Thank you");
    }
}
