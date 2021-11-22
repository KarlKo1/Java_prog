package week10.Ex28.movable;

public class Organism implements Movable {
    private int x, y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public String toString() {
        return "x: " + x + "; y: " + y;
    }
}