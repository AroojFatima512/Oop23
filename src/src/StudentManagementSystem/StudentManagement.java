package StudentManagementSystem;

public class StudentManagement {
    private Student[] students;
    private int size;

    public StudentManagement(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    // Add a new student
    public void addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
        }
          else{
            System.out.println("Space is full. Cannot add more Students.");
        }
    }

    // Delete a student by roll number
    public void deleteStudent(int rollNumber) {
        int index = findStudentIndex(rollNumber);
        if (index != -1) {
            students[index] = null;
            System.arraycopy(students, index + 1, students, index, size - index - 1);
            size--;
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Find a student index by roll number
    private int findStudentIndex(int rollNumber) {
        for (int i = 0; i < size; i++) {
            if (students[i] != null && students[i].getRollNumber() == rollNumber) {
                return i;
            }
        }
        return -1;
    }

    // Fetch a student by roll number
    public Student fetchStudent(int rollNumber) {
        int index = findStudentIndex(rollNumber);
        if (index != -1) {
            return students[index];
        } else {
            return null;
        }
    }

    // Display all students
    public void displayStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }
}
