import java.util.Scanner;
public class fertilizer{
    public static void main(String[] args) {
        // input object declaration
    Scanner input = new Scanner(System.in);

    //Requesting name of fertilizer
    System.out.print("Enter the name of the first fertilizer: ");
    String fertilizerA = input.nextLine();
    System.out.print("Enter the name of the Second fertilzer: ");
    String fertilizerB = input.nextLine();

    //requesting for yields
    System.out.print("Enter the yield per squared feet of " + fertilizerA + ": ");
    int yieldA = input.nextInt();
    System.out.print("Enter the yield per squared feet of " + fertilizerB + ": ");
    int yieldB = input.nextInt();

    //displaying the fertilizer with most yield

    if (yieldA == yieldB) {
        System.out.println(fertilizerA + "and " + fertilizerB +" have equal yields per squared feet");
    } else if ( yieldA > yieldB) {
        System.out.println(fertilizerA + " has the most yield");
    } else {
        System.out.println(fertilizerB + " has the most yield");
    }
    }
}