import java.util.List;

public class B2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,3,4,5,6,7,8,9,1,2);

        int sum = list.stream().filter(num -> num % 2 != 0).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
