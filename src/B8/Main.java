package B8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Quý", "IT", 8.5),
                new Student("Lan", "Business", 7.2),
                new Student("Minh", "IT", 9.0),
                new Student("Huyền", "Design", 6.8),
                new Student("Long", "IT", 7.9),
                new Student("Trang", "Business", 8.1),
                new Student("Việt", "IT", 8.0),
                new Student("Tú", "Design", 7.5),
                new Student("Phúc", "Business", 6.9),
                new Student("An", "AI", 9.5)
        );
        Map<String,Integer> map = new HashMap<>();
        for (Student student : students) {
            String major = student.getMajor();
            if (map.containsKey(major)){
                map.put(major,map.get(major)+1);
            }else {
                map.put(major,1);
            }
        }

        map.entrySet().stream()
                .sorted(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }
                })
                .forEach(entry ->
                        System.out.println("Chuyên ngành: " + entry.getKey() + " | Số lượng: " + entry.getValue())
                );


    }
}
