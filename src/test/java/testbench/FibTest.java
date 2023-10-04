package testbench;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibTest {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println(fib(n));
  }

  static int fib(int n) {
    if (n <= 1)
      return n;

    return fib(n - 1) + fib(n - 2);
  }

  @Test
  void test() {
    assertEquals(55, fib(10));
    assertEquals(4181, fib(19));
  }
}
