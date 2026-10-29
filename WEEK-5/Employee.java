package deneme;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, 
                    String office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate(); // Otomatik bugünün tarihini atar
    }

    @Override
    public String toString() {
        return "Employee: " + getName();
    }
}