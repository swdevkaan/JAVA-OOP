package deneme;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Enis Ongenc", "Van", "05551112233", "ahmet@mail.com");
        Student student = new Student("Hemsire Cagri Gunes", "Kahramanmaras", "05552223344", "ayse@mail.com", Student.FRESHMAN);
        Employee employee = new Employee("Mustafa Kaan Celik", "Izmir", "05553334455", "mehmet@mail.com", "Oda 101", 35000);
        Faculty faculty = new Faculty("Muhendis Ozcan Lale", "Bursa", "05554445566", "ali@mail.com", "Oda 202", 50000, "09:00-11:00", "Prof. Dr.");
        Staff staff = new Staff("Emre Ayozcan", "Antalya", "05555556677", "fatma@mail.com", "Oda 303", 28000, "Sekreter");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}