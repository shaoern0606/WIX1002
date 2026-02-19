package l9;

class PersonProfile {
    private String name;
    private String gender;
    private String dateOfBirth;
    
    public PersonProfile() {
        this.name = null;
        this.gender = null;
        this.dateOfBirth = null;
    }
    
    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dateOfBirth);
    } 
}