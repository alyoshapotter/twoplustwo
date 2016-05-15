/*
No, seriously, you always have to round your doubles. 
15 isn't enough digits to show that the two() method actually produces 2.0000000000000004 (16 is enough, though).

In the raw Hex representations of the numbers, it's only a 1 bit difference 
(between 4000000000000001 and 4000000000000000)... which is enough to make the Math.ceil method return 5, not 4.
*/

// https://habrahabr.ru/post/219595/

public class TwoPlusTwo {

  // 20 * .1 = 2
  private static double two() {
    double two = 0;
    for(int i = 0; i < 20; i++) {
      // Doubles are stored in base 2 internally. 
      // This means that only fractions where the denominator is a power of 2 have a finite number of "decimals". 
      // 1/10 for example is .001100110011... in base 2
      // Use class BigDecimal to avoid round problems
      two += .1;
    }
    return two;
  }

  public static void main(String... args) {
    double two = two();
    // 15 isn't enough digits to show that the two() method actually produces 2.0000000000000004.
    System.out.format("Variable two = %.15f%n", two); 
    double four = Math.ceil(two + two);
    System.out.format("two + two = %.15f%n", four);
  }


}