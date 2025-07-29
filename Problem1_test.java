import java.util.Arrays;

public class Problem1_test {
        public static void main(String[] args) {
            Problem1 p1=new Problem1();

            int[] input1 = {1, 2, 3, -1};
            System.out.println(Arrays.toString(input1));
            System.out.println("Test 1: " + (p1.containsDuplicate(input1)));


            int[] input2 = {1, 2,-3,4};
            System.out.println(Arrays.toString(input2));
            System.out.println("Test 2: " + (p1.containsDuplicate(input2)));

            int[] input3 = {1,1,1,3,3,4,3,2,4,2};
            System.out.println(Arrays.toString(input3));
            System.out.println("Test 3: " + (p1.containsDuplicate(input3)));

            int[] input4 = {0,0,0,1};
            System.out.println(Arrays.toString(input4));
            System.out.println("Test 4: " + (p1.containsDuplicate(input4)));
    }


}
