
import java.util.Scanner;

public class TestEnvironment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many digits of pi to show: ");
        int input = Integer.parseInt(scan.nextLine());

        while (input > 15) {
            System.out.println("Please enter a number below 16!");
            input = Integer.parseInt(scan.nextLine());

        }

        double pi = Math.PI;

        String str = pi + "";
        str = str.substring(0, input + 2);

        System.out.println(str);

    }

}
