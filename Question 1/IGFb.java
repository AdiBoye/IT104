import java.util.Scanner;
public class IGFb{
    public static void main(String[] args) {
        //variable declaration
        int profit;
        String category;

        //input object declaration
        Scanner input = new Scanner(System.in);

        //requesting for input
        System.out.println("Enter the monthly profit of the company in GHc");

        // taking input for profit
        profit = input.nextInt();

        if (profit < 0) {
            category = "Category is not defined";
        } else if(profit < 5001) {
            category = "SMALL";
            } else if (profit < 10001) {
                category = "MEDUIM";
            } else {
                category = "Large";
            }

        //calculating the tax of the company
        calTax(category, profit);
        
    }

    // The method to calculate the tax based on the categories
    public static void calTax(String cat, int money) {
        double tax = 0;
        if (cat == "SMALL") {
            // if the money is greater than 3000
            if (money > 3000) {
                tax = 0.03 * 3000;
                tax = tax + (0.05 * (money - 3000));
            } else {
                tax = 0.03 * money;
            }
        } else if (cat == "MEDIUM") {
            if (money > 8000) {
                tax = 0.05 * 8000;
                tax = tax + (0.08 * (money - 8000));
            } else {
                tax = 0.05 * money;
            }
        } else if (cat == "LARGE") {
            if (money > 15000) {
                tax = 0.085 * 15000;
                tax = tax + (0.12 * (money - 15000));
            } else {
                tax = 0.085 * money;
            }
        } else {
            System.out.println("Profit value error ");
            System.exit(0)
        }

        double refuseTax = 0.02 * tax;

        System.out.println("Category is " + cat);
        System.out.println("Tax before refuse tax is GHc" + tax);
        System.out.println("refuse tax is GHc" + refuseTax);
        System.out.println("total tax is GHc" + (tax + refuseTax));
    }
}