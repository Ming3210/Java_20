import java.util.Comparator;
import java.util.List;

public class B5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,5,8,20,7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList= List.of(10, 10, 10);

        Integer num = numbers.stream().sorted().skip(1) .findFirst().orElse(null);

        System.out.println("Số nhỏ thứ 2: " + num);

        Integer num2 = singleElementList.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        if(num2 != null){
            System.out.println("Số nhỏ thứ 2: " + num2);
        }else {
            System.out.println("Ko có số nhỏ thứ 2");
        }

        Integer num3 = allSameList.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        if(num3 != null){
            System.out.println("Số nhỏ thứ 2: " + num2);
        }else {
            System.out.println("Ko có số nhỏ thứ 2");
        }
    }
}
