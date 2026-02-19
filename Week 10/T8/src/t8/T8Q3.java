package t8;

class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printCoordinate() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class T8Q3 {
    public static void main(String[] args) {
        Coordinate origin = new Coordinate(0, 0);
        origin.printCoordinate();
    }   
}
