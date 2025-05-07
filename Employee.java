public abstract class Employee {
    private String name;
    private String phoneNumber;
    private String email;
    private double salary;

    public Employee(String name, String phoneNumber, String email, double salary) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public abstract String getRole();

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return name.equals(employee.name) && phoneNumber.equals(employee.phoneNumber) && email.equals(employee.email);
    }
    
    
}
