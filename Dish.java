
import java.util.Comparator;
import java.util.List;

public class Dish implements Comparable<Dish>{
    private String name;
    private double price;
    private String type;

    public Dish(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type; // Mic dejun, Fel Principal, Salate, Desert, Bautura
    }

    public static final List<String> TYPE_ORDER = List.of("Mic dejun", "Fel Principal", "Salate", "Desert", "Bautura");

    public static final Comparator<Dish> BY_TYPE_ORDER = Comparator
        .comparingInt((Dish d) -> TYPE_ORDER.indexOf(d.getType()))
        .thenComparing(Dish::getPrice);

    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    @Override
    public String toString() {
        return name + " (" + type + ") - " + price + " lei";
    }

    @Override
    public int compareTo(Dish other){
        return this.name.compareToIgnoreCase(other.name);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dish dish = (Dish) obj;
        return Double.compare(dish.price, price) == 0 && name.equals(dish.name) && type.equals(dish.type);
    }
}
