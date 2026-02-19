package t8;

class Connection {
    private static int count = 0;
    
    public Connection() {
        count++;
    }
    
    public void disconnect() {
        count--;
    }
    
    public static void display() {
        System.out.println(count);
    }
}

public class T8Q5 {
    public static void main(String[] args) {
        Connection a = new Connection();
        Connection b = new Connection();
        Connection c = new Connection();
        Connection.display();
        a.disconnect();
        Connection.display();
    }
}
