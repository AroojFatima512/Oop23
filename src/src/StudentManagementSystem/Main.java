package StudentManagementSystem;


public class Main {
    public static void main(String[] args) {
        StudentManagement sms = new StudentManagement(10);

        Student student1 = new Student("Ali", 101, Department.COMPUTER_SCIENCE);
        Student student2 = new Student("Babar", 102, Department.ELECTRICAL_ENGINEERING);
        Student student3 = new Student("Danish", 103, Department.SOFTWARE_ENGINEERING);
        Student student4 = new Student("Hamza", 104, Department.CIVIL_ENGINEERING);
        Student student5 = new Student("Fahad", 105, Department.MECHANICAL_ENGINEERING);

        sms.addStudent(student1);
        sms.addStudent(student2);
        sms.addStudent(student3);
        sms.addStudent(student4);
        sms.addStudent(student5);

        // Displaying all students
        System.out.println("All Students:");
        sms.displayStudents();

        // Fetching and displaying a student
        Student student = sms.fetchStudent( 102);
        if (student != null) {
            System.out.println("\nFetched Student:");
            System.out.println(student);
        } else {
            System.out.println("\nStudent not found.");
        }

        // Deleting a student
        sms.deleteStudent(103);
        sms.deleteStudent(105);

        // Displaying all students after deletion
        System.out.println("\nAll Students after Deletion:");
        sms.displayStudents();

        System.out.println("\nThe Student matches: " +student1.equals(student2));
    }
}
