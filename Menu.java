import java.util.Set;
import java.util.TreeSet;

public class Menu {
    private Set<Dish> menu;

    public Menu() {
        this.menu = new TreeSet<>(Dish.BY_TYPE_ORDER);
    }

    public void addDishToMenu(Dish dish) {
        if (menu.add(dish)) {
            System.out.println("Dish added: " + dish.getName());
        } else {
            System.out.println("Dish already exists in the menu.");
        }
    }

    public void printMenu() {
        System.out.println("Menu:");
        for (Dish dish : menu) {
            System.out.println(dish);
        }
    }

    public Set<Dish> getMenu() {
        return menu;
    }
}
