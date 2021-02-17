public class Customer {
    int ID;
    String FName;
    String LName;

    public Customer(int ID, String FName, String LName) {
        this.ID = ID;
        this.FName = FName;
        this.LName = LName;
    }

    public int getID() {
        return ID;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", FName='" + FName + '\'' +
                ", LName='" + LName + '\'' +
                '}';
    }
}
