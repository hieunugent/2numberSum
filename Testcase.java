import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

public class Testcase{
  @Test
  public void TestCase1(){
    int [] expected = {1, 6};
    int [] output = TwoNumSums.twoNumSum(new int[]{4,5,6,9,11},10);
    Arrays.sort(output);
    assertTrue(Arrays.equals(output,expected));
  }
  @Test
  public void TestCase2(){
    int [] expected = {-1, 8};
    int [] output = TwoNumSums.twoNumSum(new int[]{4,8, -1, 5,6,9,11},7);
    Arrays.sort(output);
    assertTrue(Arrays.equals(output,expected));
  }
  @Test
  public void TestCase3(){
    int [] expected = {4,5};
    int [] output = TwoNumSums.twoNumSum(new int[]{4,5,6,9,11},9);
    Arrays.sort(output);
    assertTrue(Arrays.equals(output,expected));
  }
  @Test
  public void TestCase4(){
    int [] expected = {1, 6};
    int [] output = TwoNumSums.twoNumSum(new int[]{4,5,6,9,11},10);
    Arrays.sort(output);
    assertTrue(Arrays.equals(output,expected));
  }
}
