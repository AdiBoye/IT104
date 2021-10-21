import java.util.Scanner;
public class Egg {
    public static void main(String[] args) {
        // Scanner object declaration
        Scanner input = new Scanner(System.in);

        // Requesting name of the harvestor
        System.out.println("Enter the name of the harverster");
        
        // name of the harvestor
        String name = input.nextLine();

        //Requesting for crates harvested and stocked
        System.out.println("Enter the amount of crates harvested and stocked");
        
        //taking input for the crates stocked
        int stockLevel = input.nextInt();

        //Displaying stock before start of sale
        System.out.println("The amount of crates in stock before start of sale is " + stockLevel);

        //Start of sale
        int cratesBought = 0;

        // loop to perfom sale 5 times
        for (int i = 0; i < 5; i++ ) {
            // requesting for the amount to sell
            System.out.println("Enter the amount of crates you want to buy");
            // input for amount to sell
            int buyValue = input.nextInt();
            // loop to check that crates in stock is sold
            while (buyValue > stockLevel) {
                System.out.println("Can't buy this amount of crates");
                System.out.println("you can by up to " + stockLevel + " of crates");
                buyValue = input.nextInt();
            }
            // Tally of crates bought
            cratesBought += buyValue;
            // Tally of crates left in stock
            stockLevel = stockLevel - buyValue;
        }
        // displaying creates left after sale if any is left
        if (stockLevel > 0){
            System.out.println("The number of crates left in stock after sale is " + stockLevel);
        }

        // displaying amount of crates sold
        System.out.println("Amount of money sold is GHc" + (cratesBought * 20));

    }
}