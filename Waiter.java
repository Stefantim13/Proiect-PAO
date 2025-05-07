import java.util.ArrayList;
import java.util.List;

public class Waiter extends Employee {
    private List<Integer> assignedTables;

    public Waiter(String name, String phoneNumber, String email, double salary) {
        super(name, phoneNumber, email, salary);
        this.assignedTables = new ArrayList<>();
    }

    public List<Integer> getAssignedTables() {
        return assignedTables;
    }

    public void assignTable(int tableNumber) {
        if (!assignedTables.contains(tableNumber)) {
            assignedTables.add(tableNumber);
        }
    }

    public void removeTable(int tableNumber) {
        assignedTables.remove(Integer.valueOf(tableNumber));
    }
    
    public void clearAssignedTables() {
        assignedTables.clear();
    }

    @Override
    public String getRole() {
        return "Waiter";
    }

    @Override
    public String toString() {
        return super.toString() + " | Role: Waiter | Tables: " + assignedTables;
    }
}