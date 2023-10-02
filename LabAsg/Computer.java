package week05.LabAsg;

public class Computer {
    private String ComputerNumber;
    private String IcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    public Computer(String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGPU) {
        ComputerNumber = computerNumber;
        IcdModel = icdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }
    public String getComputerNumber() {
        return ComputerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        ComputerNumber = computerNumber;
    }

    public String getIcdModel() {
        return IcdModel;
    }

    public void setIcdModel(String icdModel) {
        IcdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    public boolean equals(Computer obj){
        Computer c = (Computer)obj;

    }

    public Computer clone(){
        return new Computer(this.ComputerNumber, this.IcdModel, this.ramSize, this.hddSize, this.hasGPU);
    }
    @Override
    public String toString() {
        return "Computer{" +
                "ComputerNumber='" + ComputerNumber + '\'' +
                ", IcdModel='" + IcdModel + '\'' +
                ", ramSize=" + ramSize +
                ", hddSize=" + hddSize +
                ", hasGPU=" + hasGPU +
                '}';
    }
}
