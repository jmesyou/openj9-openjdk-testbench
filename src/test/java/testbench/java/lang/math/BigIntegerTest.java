package testbench.java.lang.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

public class BigIntegerTest {

  @Test
  public void testImplSquareToLen() {
    var zero = BigInteger.ZERO;
    var one = BigInteger.ONE;
    var two = BigInteger.TWO;
    var four = new BigInteger("4");

    var x = new BigInteger("7030434252852423320980273755626521144789286697042046975585066767");
    var square = new BigInteger("49427005783680611730773239173937782771378697339617801711912868255325757588554449187843736416312964826255648398793062771847832289");

    assertEquals(zero, zero.multiply(zero), "0 * 0 == 0");
    assertEquals(one, one.multiply(one), "1 * 1 == 1");
    assertEquals(four, two.multiply(two), "2 * 2 == 4");
    assertEquals(square, x.multiply(x), "x * x == x**2");
  }
}
