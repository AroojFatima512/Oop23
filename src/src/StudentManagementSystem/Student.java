package StudentManagementSystem;

import java.util.Objects;

class Student {
private String name;
private int rollNumber;
private Department department;

public Student(String name, int rollNumber, Department department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        }

public String getName() {
        return name;
        }

public int getRollNumber() {
        return rollNumber;
        }

public Department getDepartment() {
        return department;
        }

public boolean equals(Object o){
        Student s=(Student)o;
        return this.rollNumber == s.rollNumber;
        }

@Override
public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Department: " + department;
        }
}


