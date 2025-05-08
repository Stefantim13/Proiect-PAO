import java.util.*;

public class RestaurantService {
    private List<Client> clients;
    private List<Waiter> waiters;
    private List<Cook> cooks;
    private Map<Client, Order> orders;
    private Menu menu; 

    public RestaurantService() {
        this.clients = new ArrayList<>();
        this.waiters = new ArrayList<>();
        this.cooks = new ArrayList<>();
        this.orders = new HashMap<>();
        this.menu = new Menu();
    }

    // Clienti
    public void addClient(Client client) {
        if (!clients.contains(client)) {
            clients.add(client);
            System.out.println("Client adăugat: " + client.getName());
        } else {
            System.out.println("Clientul există deja.");
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    // Angajati
    public void addWaiter(Waiter waiter) {
        waiters.add(waiter);
    }

    public void addCook(Cook cook) {
        cooks.add(cook);
    }

    public List<Waiter> getWaiters() {
        return waiters;
    }

    public List<Cook> getCooks() {
        return cooks;
    }

    // Comenzi
    public void createOrder(Client client) {
        if (!orders.containsKey(client)) {
            orders.put(client, new Order(client));
            System.out.println("Comandă creată pentru " + client.getName());
        } else {
            System.out.println("Clientul are deja o comandă.");
        }
    }

    public void addDishToOrder(Client client, Dish dish) {
        Order order = orders.get(client);
        if (order != null) {
            order.addDish(dish);
            System.out.println("Fel adăugat: " + dish.getName());
        } else {
            System.out.println("Clientul nu are o comandă creată.");
        }
    }

    public void printClientOrder(Client client) {
        Order order = orders.get(client);
        if (order != null) {
            System.out.println(order);
        } else {
            System.out.println("Nicio comandă pentru clientul " + client.getName());
        }
    }

    // Meniu
    public void addDishToMenu(Dish dish) {
        menu.addDishToMenu(dish);
    }

    public void showMenu() {
        menu.printMenu();
    }

    // Atribuire mese
    public void assignTableToWaiter(Waiter waiter, int tableNumber) {
        waiter.assignTable(tableNumber);
        System.out.println("Masă " + tableNumber + " atribuită chelnerului " + waiter.getName());
    }

    public void showAssignedTables(Waiter waiter) {
        System.out.println("Chelnerul " + waiter.getName() + " are mesele: " + waiter.getAssignedTables());
    }

    // Bucătari
    public void assignDishToCook(Cook cook, String dishName) {
        cook.addPreparedDish(dishName);
        System.out.println("Felul " + dishName + " a fost atribuit bucătarului " + cook.getName());
    }

    public void showPreparedDishes(Cook cook) {
        System.out.println("Bucătarul " + cook.getName() + " a pregătit: " + cook.getPreparedDishes());
    }
}
