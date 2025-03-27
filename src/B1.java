import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,10);

        list.stream().filter(num -> num %2 ==0).forEach(System.out::println);

    }
}
