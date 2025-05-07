import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private List<Dish> dishes;
    private double totalPrice;

    public Order(Client client) {
        this.client = client;
        this.dishes = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
        totalPrice += dish.getPrice();
    }

    public void removeDish(Dish dish) {
        if (dishes.remove(dish)) {
            totalPrice -= dish.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Order for " + client + ":\n");
        for (Dish dish : dishes) {
            orderDetails.append(dish).append("\n");
        }
        orderDetails.append("Total Price: ").append(totalPrice).append(" lei");
        return orderDetails.toString();
    }
}
