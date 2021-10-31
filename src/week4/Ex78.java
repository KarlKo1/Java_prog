package week4;

import java.util.Scanner;

public class Ex78 {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);

            BoundedCounter seconds = new BoundedCounter(59);
            BoundedCounter minutes = new BoundedCounter(59);
            BoundedCounter hours = new BoundedCounter(23);

            System.out.print("seconds: ");
            int sek = Integer.parseInt(reader.nextLine());
            System.out.print("minutes: ");
            int min = Integer.parseInt(reader.nextLine());
            System.out.print("hours: ");
            int hou = Integer.parseInt(reader.nextLine());

            seconds.setValue(sek);
            minutes.setValue(min);
            hours.setValue(hou);

            int i = 0;
            while (i < 121) {
                System.out.println(hours + ":" + minutes + ":" + seconds);
                seconds.next();
                if (seconds.getValue() == 0) {
                    minutes.next();
                    if (minutes.getValue() == 0) {
                        hours.next();
                    }
                }

                i++;
            }
        }
    static class BoundedCounter {
        private int value;
        private int upperLimit;

        public BoundedCounter(int limit) {
            this.upperLimit = limit;
            this.value = 0;
        }

        public void next() {
            if (this.value == this.upperLimit) {
                this.value = 0;
            } else {
                this.value++;
            }
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int value) {
            if (value < 0 || value > this.upperLimit) {
                return;
            }
            this.value = value;
        }

        public String toString() {
            if (this.value<10){
                return "0"+value;
            } else {
                return ""+value;
            }
        }
    }
}




