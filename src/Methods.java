/**
 * Created by alexandraqin on 4/14/15.
 */

import java.util.Random;

public class Methods {

  public static void main (String args[]) {
      System.out.println(calculateSquare(3));

      System.out.println(calculateSquareRoot(4));

//      System.out.println(toLowerCase("OMG OMG OMG"));

      System.out.println(isMultiple(5, 100));
      System.out.println(isMultiple(5, 101));

      prettyInteger(4);

      System.out.println(random(5, 10));
  }

    public static int calculateSquare(int x) {
        return x * x;
    }

    public static double calculateSquareRoot(int x) {
        return Math.sqrt((double) x);
    }

//    public static String toLowerCase(String input) {
//        return input.toLowerCase();
//    }

    public static boolean isMultiple(int x, int y) {
        return (y % x == 0);
    }

    public static void prettyInteger(int x) {
        String result = "";
        for (int i = 0; i < x; i++) {
            result += "*";
        }
        System.out.println(result + " " + x + " " + result);
    }

    public static int random(int x, int y) {
        Random rand = new Random();
        int randomNum = rand.nextInt((y - x) + 1) + x;
        return randomNum;
    }
}
