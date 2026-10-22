package bolum10;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

public void addStudent(String student) {
    if (numberOfStudents >= students.length) {
        String[] temp = new String[students.length * 2];
        System.arraycopy(students, 0, temp, 0, students.length);
        students = temp;
    }
    students[numberOfStudents] = student;
    numberOfStudents++;
}



public String[] getStudents() {
    String[] result = new String[numberOfStudents];
    System.arraycopy(students, 0, result, 0, numberOfStudents);
    return result;
}



public void dropStudent(String student) {
    int index = -1;
    for (int i = 0; i < numberOfStudents; i++) {
        if (students[i].equals(student)) {
            index = i;
            break;
        }
    }

    if (index != -1) {
        for (int i = index; i < numberOfStudents - 1; i++) {
            students[i] = students[i + 1];
        }
        students[numberOfStudents - 1] = null;
        numberOfStudents--;
    }
}

public void clear() {
    students = new String[10];
    numberOfStudents = 0;
}














}