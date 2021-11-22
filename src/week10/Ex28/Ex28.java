package week10.Ex28;

import week10.Ex28.movable.Group;
import week10.Ex28.movable.Organism;

public class Ex28 {

    public static void main(String[] args) {
        Group group = new Group();
        group.addToGroup(new Organism(73, 56));
        group.addToGroup(new Organism(57, 66));
        group.addToGroup(new Organism(46, 52));
        group.addToGroup(new Organism(19, 107));
        System.out.println(group);
    }
}