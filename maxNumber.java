import java.util.*;

class maxNumber {

    // Driver code
    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(-12, -20, 0, 61, 22);

        System.out.print("The maximum value is : ");

        Integer var = list.stream().max(Integer::compare).get();

        System.out.print(var);
    }
}
