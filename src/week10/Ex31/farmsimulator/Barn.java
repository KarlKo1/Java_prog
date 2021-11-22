package week10.Ex31.farmsimulator;

import java.util.Collection;

public class Barn {
    private MilkingRobot robot;
    private BulkTank tank;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot MilkingRobot) {
        robot = MilkingRobot;
        robot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) throws IllegalStateException {
        if (robot == null)
            throw new IllegalStateException();
        robot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {
        for (Cow cow : cows)
            robot.milk(cow);
    }

    public String toString() {
        return tank.toString();
    }
}