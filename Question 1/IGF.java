import java.util.Scanner;
public class IGF{
    //attributes of the class
    private int profit;
    private String category;
    
    //setter of the profit attribute
    public void setProfit(int value) {
        profit = value;
    }

    //getter of the profit attribute
    public int getProfit() {
        return profit;
    }
    //setter of the category attribute
    public void setCategory(int value) {
        if (value < 0) {
            category = "Category is not defined";
        } else if(value < 5001) {
            category = "SMALL";
            } else if (value < 10001) {
                category = "MEDUIM";
            } else {
                category = "LARGE";
            }
    }
    
    //getter of the category attribute
    public String getCategory() {
        return category;
    }
    
    //main method
    public static void main(String[] args) {
        //input object declaration
        Scanner input = new Scanner(System.in);

        //IGF class initialization as an object named company
        IGF company = new IGF();

        System.out.println("Enter the monthly profit of the company in GHc");

        //setting the profit attribute with the input supplied
        company.setProfit( input.nextInt() );

        //setting the category of the company depending on the profit
        company.setCategory(company.getProfit());

        //calculating the tax of the company

        calTax(company);
        
    }

    // The method to calculate the tax based on the categories
    public static void calTax(IGF object) {

        String cat = object.getCategory();
        int money = object.getProfit();
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
            System.exit(0);
        }

        double refuseTax = 0.02 * tax;

        System.out.println("Category is " + cat);
        System.out.println("Tax before refuse tax is GHc" + tax);
        System.out.println("refuse tax is GHc" + refuseTax);
        System.out.println("total tax is GHc" + (tax + refuseTax));
    }

}