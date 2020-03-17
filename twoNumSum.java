
import java.util.Arrays;

class TwoNumSums{
  public static int[] twoNumSum(int[] array, int target){
    Arrays.sort(array);
    int left = 0;
    int right = array.length - 1;
    while (left < right){
      int currentNum = array[left] + array[right];
       if (currentNum == target){
         return new int[] { array[left], array[right]};
       }
       else if ( currentNum < target){
         left++;
       }
       else if ( currentNum > target){
         right--;
       }
    }
    return new int[0];
  }
}
