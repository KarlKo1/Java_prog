package week5;

import week4.Ex78;

public class Ex89 {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }

    public static class Clock {
        private Ex78.BoundedCounter hours;
        private Ex78.BoundedCounter minutes;
        private Ex78.BoundedCounter seconds;

        public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
            this.hours = new Ex78.BoundedCounter(hoursAtBeginning);
            this.minutes = new Ex78.BoundedCounter(minutesAtBeginning);
            this.seconds = new Ex78.BoundedCounter(secondsAtBeginning);
        }

        public void tick() {
            if (this.seconds.getValue() == 59) {
                if (this.minutes.getValue() == 59) {
                    if (this.hours.getValue() == 23) {
                        this.hours.setValue(0);
                    } else {
                        this.hours.next();
                    }
                }
                this.minutes.next();
                this.seconds.next();
            } else {
                this.seconds.next();
            }
        }

        public String toString() {
            return this.hours + ":" + this.minutes + ":" + this.seconds;
        }
    }
}