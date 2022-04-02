package order;

import java.util.Date;
import java.util.List;

public class Order {
    Long id;
    Date createdAt;
    List<Item> items;
    long price;

    public Order(List<Item> items, long price) {
        this.id = null;
        this.createdAt = new Date();
        this.items = items;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public List<Item> getItems() {
        return items;
    }

    public long getPrice() {
        return price;
    }
}
