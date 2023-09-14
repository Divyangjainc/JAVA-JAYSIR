package mmm;
import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBill = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Small Pizza - 150");
            System.out.println("2. Medium Pizza - 250");
            System.out.println("3. Large Pizza - 300");
            System.out.println("4. Monster Pizza - 600");

            System.out.print("Enter the pizza choice (1/2/3/4): ");
            int pizzaChoice = scanner.nextInt();

            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            int pizzaPrice = 0;
            switch (pizzaChoice) {
                case 1:
                    pizzaPrice = 150;
                    break;
                case 2:
                    pizzaPrice = 250;
                    break;
                case 3:
                    pizzaPrice = 300;
                    break;
                case 4:
                    pizzaPrice = 600;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid pizza.");
            }

            int subtotal = pizzaPrice * quantity;
            totalBill += subtotal;

            if (quantity >= 4) {
                System.out.println("You get a free big cold drink with this order!");
            }

            System.out.println("Subtotal for this order: " + subtotal);
            System.out.print("Do you want to order more pizzas? (yes/no): ");
            String moreOrders = scanner.next();

            if (!moreOrders.equalsIgnoreCase("yes")) {
                break;
            }
        } while (true);

        System.out.println("Thank you for your order!");
        System.out.println("Your total bill is: " + totalBill);
        scanner.close();
    }
}

