package B9;

import java.time.LocalDate;
import java.util.Optional;

public class Order {
    private int id;
    private String customerName;
    private LocalDate createdDate;
    private Optional<LocalDate> updatedDate;

    public Order(int id, String customerName, LocalDate createdDate,   Optional<LocalDate> updatedDate) {
        this.createdDate = createdDate;
        this.customerName = customerName;
        this.id = id;
        this.updatedDate = updatedDate;
    }

    public Order() {
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Optional<LocalDate> getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Optional<LocalDate> updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void toDisplayString(){
        System.out.println("Order ID: " + id + ", Customer Name: " + customerName + ", Created Date: " + createdDate + ", Updated Date: " + updatedDate.orElse(LocalDate.now()));
    }
}
