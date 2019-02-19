package CoinFlipSimulation;
import java.math.BigDecimal;

public class TestEnvironment {

    public static void main(String[] args) {

        Coin c = new Coin();
        c.flip(10);
        System.out.println(c);

    }

}

//----Class Coin.java ------

package testenvironment;

import java.util.Random;

public class Coin {

    private Random r;
    private int headsCount;
    private int tailsCount;

    public Coin() {

        r = new Random();
        headsCount = 0;
        tailsCount = 0;

    }

    public void flip(int times) {

        for (int x = 1; x <= times; x++) {
            int flip = r.nextInt((2 - 1) + 1) + 1;   //(Max - min) + 1) + min
            if (flip == 1) {
                headsCount++;
                System.out.println("Roll #" + x + " is heads");

            } else {
                tailsCount++;
                System.out.println("Roll #" + x + " is tails");

            }
        }

    }

    @Override
    public String toString() {

        return "\nFinal Tally: \n" + "Number of heads: " + headsCount + "\n" + "Number of tails: " + tailsCount;

    }

}
