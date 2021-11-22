package week10.Ex31.farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private String owner;
    private Barn barn;
    private List<Cow> herd;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.herd = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }

    public void manageCows() {
        if (!herd.isEmpty()) {
            barn.takeCareOf(herd);
        }
    }

    public void addCow(Cow cow) {
        herd.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }

    public void liveHour() {
        if (!herd.isEmpty()) {
            for (Cow cow : herd) {
                cow.liveHour();
            }
        }
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Farm owner: ").append(owner).append("\nBarn bulk tank: ").append(barn.getBulkTank().toString());
        if (herd.isEmpty()) {
            out.append("\nNo cows.");
        } else {
            out.append("\nAnimals:");
            for (Milkable cow : herd)
                out.append("\n        ").append(cow.toString());
        }
        return out.toString();
    }
}