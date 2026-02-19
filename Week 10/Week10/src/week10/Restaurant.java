package week10;

//Restaurant {name, address, numOfEmployee}

public class Restaurant {
    private String name, address;
    private int numOfEmployee;

    public Restaurant(){
        name = "";
        address = "";
        numOfEmployee = 0;
    }

    public Restaurant(String name, String address, int numOfEmployee) {
        this.name = name;
        this.address = address;
        this.numOfEmployee = numOfEmployee;
    }
        
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setName(String a) {
        this.name = a;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumOfEmployee(int numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }
    
    public String toString() {
        return "Restaurant : " + name + "\nAddress : " + address + "\nNumber Of Employee : " + numOfEmployee + "\n";
    }
    
    
    
}
