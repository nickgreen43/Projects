package testenvironment;

import java.util.Scanner;
import java.math.BigDecimal;

public class TestEnvironment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigDecimal oneHundredThirteen = new BigDecimal(113.0);

    
        System.out.println("Enter how many digits of pi aproximation to show: ");
        int numberOfDecimalPlaces = Integer.parseInt(scan.nextLine());

        while (numberOfDecimalPlaces > 100) {
            System.out.println("Please enter a number < 101");
            numberOfDecimalPlaces = Integer.parseInt(scan.nextLine());
        }

        
        BigDecimal pi = new BigDecimal(355.0).divide(oneHundredThirteen, numberOfDecimalPlaces, BigDecimal.ROUND_UP);
    
        System.out.println(pi);

    }
}
