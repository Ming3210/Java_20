package B9;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "Quý", LocalDate.of(2025, 3, 20), Optional.of(LocalDate.of(2025, 3, 25))),
                new Order(2, "Lan", LocalDate.of(2025, 3, 21), Optional.empty()),
                new Order(3, "Minh", LocalDate.of(2025, 3, 22), Optional.of(LocalDate.of(2025, 3, 23))),
                new Order(4, "Huyền", LocalDate.of(2025, 3, 23), Optional.empty()),
                new Order(5, "Việt", LocalDate.of(2025, 3, 23), Optional.of(LocalDate.of(2025, 3, 30)))
        );
        System.out.println("== Danh sách đơn hàng đã giao ==");
        orders.stream().filter(order -> order.getUpdatedDate().orElse(null) != null ).forEach(order -> {
            System.out.println("ID: " + order.getId() + ", KH: " + order.getCustomerName() + ", Giao: " + order.getUpdatedDate().get());
        });

        System.out.println("== Danh sách đơn hàng chưa giao ==");
        orders.stream().filter(order -> order.getUpdatedDate().orElse(null) == null).forEach(order -> {
            System.out.println("ID: " + order.getId() + ", KH: " + order.getCustomerName() + ", Giao: " + "Chưa giao");
        });

        System.out.println("== Số đơn hàng đã giao từ ngày 2025-03-17 đến 2025-03-23 ==");
        long count = orders.stream()
                .map(order -> order.getUpdatedDate().orElse(null))
                .filter(date -> date != null &&
                        !date.isBefore(LocalDate.of(2025, 3, 17)) &&
                        !date.isAfter(LocalDate.of(2025, 3, 23)))
                .count();

        System.out.println("Tổng đơn: " + count);
    }
}
