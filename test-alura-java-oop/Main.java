import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String currentOption = "0";

        Account acc = new Account();

        while(!Objects.equals(currentOption, "9")) {
            System.out.println("--------MENU Credit Card----------");
            System.out.println("1 - New purchase");
            System.out.println("2 - Limit of credit card");
            System.out.println("3 - Show total");
            System.out.println("4 - Show limit");
            System.out.println("5 - Show extract");
            System.out.println("9 - Log out");
            System.out.println("-----------------------------------");
            Scanner scanner = new Scanner(System.in);

            currentOption = scanner.nextLine();

            if(currentOption.equals("1")) {
                System.out.println("Register new purchase!");
                System.out.print("Description: ");
                String newPurchaseDescription = scanner.nextLine();

                System.out.print("Value: ");
                int newPurchaseValue = scanner.nextInt();
                acc.newPurchase(newPurchaseDescription,newPurchaseValue);
            }
            if(currentOption.equals("2")) {
                System.out.println("Register new limit");
                Scanner newLimit = new Scanner(System.in);
                acc.setLimit(newLimit.nextInt());
            }
            if(currentOption.equals("3")) {
                System.out.println("Invoice total: " + acc.getTotal());
            }
            if(currentOption.equals("4")) {
                System.out.println("Limit total: " + acc.getLimit());
            }
            if(currentOption.equals("5")) {
                acc.getPurchases();
            }

        }



    }
}
