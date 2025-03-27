import java.time.LocalDateTime;
import java.util.List;

public class B6 {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Thời điểm xử lý: " + now);
        items.stream().distinct().forEach(item ->{
            System.out.println("Item: " + item + ", Count: " + items.stream().filter(i -> i.equals(item)).count());
        });
    }


}
