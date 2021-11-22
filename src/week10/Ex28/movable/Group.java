package week10.Ex28.movable;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Movable> movables;

    public Group() {
        this.movables = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        this.movables.add(movable);
    }


    public void move(int dx, int dy) {
        for (Movable m : this.movables) {
            m.move(dx, dy);
        }
    }

    public String toString() {
        String toReturn = "";
        for (Movable m : this.movables) {
            toReturn += m.toString() + "\n";
        }
        return toReturn;
    }
}