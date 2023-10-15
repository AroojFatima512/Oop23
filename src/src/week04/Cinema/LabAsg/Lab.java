package week04.Cinema.LabAsg;

public class Lab {
   private String labID;
   private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }


}
