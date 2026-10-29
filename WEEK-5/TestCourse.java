package deneme;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Veri Yapıları");

        // Öğrenci ekleme
        course.addStudent("Ahmet Yilmaz");
        course.addStudent("Ayse Kaya");
        course.addStudent("Mehmet Demir");

        System.out.println("Kurs Adi: " + course.getCourseName());
        System.out.println("Ogrenci Sayisi: " + course.getNumberOfStudents());

        System.out.println("\nOgrenciler:");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println("- " + students[i]);
        }

        // Öğrenci çıkarma
        System.out.println("\n'Ayse Kaya' kurstan cikariliyor...");
        course.dropStudent("Ayse Kaya");

        System.out.println("Guncel Ogrenci Sayisi: " + course.getNumberOfStudents());
        System.out.println("Kalan Ogrenciler:");
        String[] updatedStudents = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println("- " + updatedStudents[i]);
        }
    }
}