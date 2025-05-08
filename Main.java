public class Main {
    public static void main(String[] args) {
        RestaurantService restaurant = new RestaurantService();

        Client client1 = new Client("Andrei Pop", "0740000001");
        Dish dish1 = new Dish("Omleta", 14.0, "Mic dejun");
        Dish dish2 = new Dish("Papanasi", 22.0, "Desert");
        Dish dish3 = new Dish("Ciroba Radauteana", 25.0, "Fel Principal");
        Dish dish4 = new Dish("Coca Cola", 7.0, "Bautura");
        restaurant.addDishToMenu(dish4);

        restaurant.addClient(client1);
        restaurant.addDishToMenu(dish1);
        restaurant.addDishToMenu(dish2);
        restaurant.addDishToMenu(dish3);
        restaurant.addDishToMenu(dish4);

        restaurant.showMenu();

        restaurant.createOrder(client1);
        restaurant.addDishToOrder(client1, dish1);
        restaurant.addDishToOrder(client1, dish2);

        restaurant.printClientOrder(client1);
    }
}
