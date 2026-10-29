package deneme;

public class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email); // Person constructor'ını çağırır
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + getName();
    }
}