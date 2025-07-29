import java.util.Arrays;

public class Problem2_test {
    public static void main(String[] args) {
        Problem2 p2=new Problem2();

        int[] input1 = {0,1,0,4,21};
        System.out.println(Arrays.toString(input1));
        System.out.println("Test 1: " + Arrays.toString((p2.moveZero(input1))));


        int[] input2 = {0,1,0,3,12};
        System.out.println(Arrays.toString(input2));
        System.out.println("Test 2: " + Arrays.toString((p2.moveZero(input2))));

        int[] input3 = {1,2,3,4};
        System.out.println(Arrays.toString(input3));
        System.out.println("Test 3: " + (Arrays.toString(p2.moveZero(input3))));

        int[] input4 = {0,0,0,0};
        System.out.println(Arrays.toString(input4));
        System.out.println("Test 4: " + (Arrays.toString(p2.moveZero(input4))));
    }


}
