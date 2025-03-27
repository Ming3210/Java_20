package B3;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Quý", Optional.ofNullable("0123456789")),
                new User("Lan", Optional.empty()),
                new User("Minh", Optional.ofNullable("0933222111")),
                new User("Huyền", Optional.empty())
        );

        for (User user : users) {
            String phoneNumber = user.getPhoneNumber().orElse("Không có");

            System.out.println("Tên: " + user.getName());
            System.out.println("Số điện thoại: " + phoneNumber);
        }
    }
}
