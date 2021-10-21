import java.util.Scanner;
public class kanNewTax{
    public static void main(String[] args) {
        //Variable declarations
        String car;
        int price;
        int counter = 0;
        String sentinel = "0";

        // input object declaration
        Scanner input = new Scanner(System.in);

        //requesting for username and password
        System.out.print("Enter your Username: ");
        String username = input.nextLine();
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        // checking username and password to grant access

        if (!username.equals("rubyowusu") || !password.equals("amaterasu")) {
            System.out.println("Incorrect password");
            System.out.println("....Exiting now");
            System.exit(0);
        }


        do {
            System.out.print("Enter the name of the car: ");
            car = input.nextLine();
            System.out.print("Enter price of the car: ");
            price = input.nextInt();
            calTax(car, price);
            System.out.println("Enter any key to continue ");
            input.nextLine();
            input.nextLine();

            counter = counter + 1;
            if (counter >9) {
                System.out.println("Enter -1 if you want to quit or press Enter to continue");
                sentinel = input.nextLine();
            }
        } while ( !sentinel.equals("-1"));

    }

    public static void calTax(String car, int Price) {
        double tax = 0.25 * Price;
        System.out.println("Tax on " + car + " with price GHc " + Price + " is: Ghc" + tax);
    }

}