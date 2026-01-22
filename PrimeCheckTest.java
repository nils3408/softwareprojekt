import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    int[] primes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};

    for (int p : primes) {
      assertEquals("Test prime " + p, true, PrimeCheck.isPrime(p));
    }

  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int[] primes = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26,27, 30, 32, 33, 34, 35, 36, 38, 40, 42, 44, 45, 48, 50, };
        
    for (int p : primes) {
      assertEquals("Test nicht-prime " + p, false, PrimeCheck.isPrime(p));
    }
  }
}
