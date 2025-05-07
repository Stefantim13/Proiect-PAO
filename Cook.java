import java.util.ArrayList;
import java.util.List;

public class Cook extends Employee {
    private String specialty;
    private List<String> preparedDishes;

    public Cook(String name, String phoneNumber, String email, String specialty, double salary) {
        super(name, phoneNumber, email, salary);
        this.specialty = specialty;
        this.preparedDishes = new ArrayList<>();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<String> getPreparedDishes() {
        return preparedDishes;
    }

    public void addPreparedDish(String dishName) {
        preparedDishes.add(dishName);
    }
    public void removePreparedDish(String dishName) {
        preparedDishes.remove(dishName);
    }
    public void clearPreparedDishes() {
        preparedDishes.clear();
    }
    public void setPreparedDishes(List<String> preparedDishes) {
        this.preparedDishes = preparedDishes;
    }
    
    @Override
    public String getRole() {
        return "Cook";
    }

    @Override
    public String toString() {
        return super.toString() + " | Role: Cook | Specialty: " + specialty;
    }
}
