package testenvironment;

import java.util.Scanner;
import java.math.BigDecimal;

public class TestEnvironment {

    public static void main(String[] args) {

        BigDecimal pi = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091");

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Enter how many digits of pi to show: ");
        int input = Integer.parseInt(scan.nextLine());

        while (input > 250) {
            System.out.println("Too large. Enter a number less than 251!");
            input = Integer.parseInt(scan.nextLine());
        }

        String str = pi + "";
        str = str.substring(0, input + 2);

        System.out.println(str);

    }

}
