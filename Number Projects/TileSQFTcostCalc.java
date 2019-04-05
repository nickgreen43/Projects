
import java.util.Scanner;

public class JavaChallenges {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int w = 50;
        int h = 40;
        int sqft = w * h;

        System.out.print("Enter cost of tile per sqft: $");
        Double costSqft = scan.nextDouble() * sqft;

        System.out.println("Total cost for " + sqft + "sqft: $" + costSqft);

    }

}
