package week10;

public class RestaurantMain {
    public static void passbyReference(Restaurant a) {
        a.setName("New Name");
    }
    
    public static void main(String[] args) {
        // Tester class - class with main method
        // System.out.println("Encapsulation - Class");

        // create objects from the class
        // object without argument, 
        Restaurant a = new Restaurant();
        Restaurant b = new Restaurant();
        // set value using mutator
        a.setName("ABC");
        a.setAddress("KL");
        a.setNumOfEmployee(10);
        b.setName("CDE");
        b.setAddress("PJ");
        b.setNumOfEmployee(5);
        
        // get value using accessor
        // System.out.println(a.getName() + " " + a.getAddress());
        // System.out.println(b.getName()); 
        
        // display the object profile
        System.out.println(a.toString());
        System.out.println(b.toString());
                
        // create objects from the class
        // object with argument 
        Restaurant c = new Restaurant("AAA", "Melaka", 20);
        Restaurant d = new Restaurant("MMM", "", 10);
        d.setAddress("Kepong");
        
        // display the object profile
        System.out.println(c.toString());
        System.out.println(d.toString());
        
        // object is reference data type
        // method with the object argument
        Restaurant f = c;
        f.setName("KKK");
        System.out.println(c.getName());
        
        passbyReference(f);
        System.out.println(c.getName());
        
        // array of object
        Restaurant[] r = new Restaurant[3]; 
        r[0] = new Restaurant("M", "PJ", 12);
        r[1] = new Restaurant("N", "KL", 15);
        r[2] = new Restaurant("W", "Perak", 22);
        
        System.out.println(r[1].toString());
        
    }
}
