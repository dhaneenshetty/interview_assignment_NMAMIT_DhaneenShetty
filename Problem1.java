/*checks for duplicates in the array and returns true if present and false otherwise*/
import java.util.stream.IntStream;

public class  Problem1{
    public boolean containsDuplicate(int[]nums){
        int[] arr= IntStream.of(nums)
                .distinct().toArray();
        if(arr.length!=nums.length){
            return true;
        }
        return false;
    }
}

