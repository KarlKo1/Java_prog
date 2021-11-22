package week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // if the hashCode hasn't been overwritten, the owners are not found

        VehicleRegister veReg = new VehicleRegister();
        veReg.add(reg3, "arturo");

        veReg.add(reg3, "arturo");
        veReg.add(reg1, "arturo");
        veReg.add(reg2, "arturo");
        veReg.listCars();
    }

    public static class RegistrationPlate {
        // don't change the code which is already given to you

        // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
        private final String regCode;
        private final String country;

        public RegistrationPlate(String country, String regCode) {
            this.regCode = regCode;
            this.country = country;
        }

        @Override
        public String toString() {
            return country + " " + regCode;
        }

        public boolean equals(Object object) {
            if (object == null) {
                return false;
            }
            if (getClass() != object.getClass()) {
                return false;
            }

            RegistrationPlate compared = (RegistrationPlate) object;
            if (this.getCountry() != compared.getCountry()) {
                return false;
            }
            if (this.getRegCode() != compared.getRegCode()) {
                return false;
            }

            return true;
        }

        public int hashCode() {
            return (this.country + this.regCode).hashCode();
        }

        public String getRegCode() {
            return regCode;
        }

        public String getCountry() {
            return country;
        }

    }

    public static class VehicleRegister {

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

        public boolean add(RegistrationPlate plate, String name) {
            if (owners.containsKey(plate)) {
                System.out.println("wont repeat");
                return false;
            } else {
                System.out.println("added");
                owners.put(plate, name);
                return true;
            }
        }

        public void listCars() {
            for (RegistrationPlate pl : owners.keySet()) {
                System.out.println(pl);
            }
        }


    }
}