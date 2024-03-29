import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
  @Test
  public void testComputeSingleArgument() {
      assertFalse(c.compute(5));
  }

  @Test
  public void testComputeEvenLengthArgs() {
      assertFalse(c.compute(1, 2));
  }

  @Test
  public void testComputeZeroElement() {
      try {
          c.compute(0,1,2);
      } catch (RuntimeException e) {

      }
  }
 
  @Test
  public void testComputeWithNoDivisibleSum() {
      assertTrue(c.compute(1, 2, 3));
  }

  @Test
  public void testComputePrimeNumber() {
      Util util = new Util();
      assertFalse(util.compute(5,7,11));
  }
}