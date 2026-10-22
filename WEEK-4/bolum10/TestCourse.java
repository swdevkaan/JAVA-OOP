package bolum10;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Java Programlama");

        course.addStudent("Kaan");
        course.addStudent("Ahmet");
        course.addStudent("Mehmet");

        System.out.println("Öğrenci eklendikten sonra sayı: " + course.getNumberOfStudents());

        course.dropStudent("Ahmet");

        System.out.println("Ahmet silindikten sonra kalan öğrenciler:");
        String[] students = course.getStudents();
        for (String s : students) {
            System.out.println("- " + s);
        }
    }
}