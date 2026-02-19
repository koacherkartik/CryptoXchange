package util;

import java.util.Random;

public class PriceGenerator {
    private static Random random = new Random();

    public static double getPrice(String asset) {
        return 20000 + random.nextInt(10000);
    }
}
