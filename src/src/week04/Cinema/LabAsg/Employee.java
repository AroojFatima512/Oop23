package week04.Cinema.LabAsg;

public class Employee {
    private String EmployeeID;
    private String Name;
    private String designation ="Lab Attendant";

    public Employee(String EmployeeID, String Name, String designation){
        this.EmployeeID=EmployeeID;
        this.Name=Name;
        this.designation=designation;
    }

    public Employee(){

    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
