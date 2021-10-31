package week4;

public class Ex75 {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();


        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
    public static class DecreasingCounter {
        private int value;   // object variable that remembers the value of the counter
        private final int initialValue;

        public DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
            this.initialValue = valueAtStart;
        }

        public void printValue() {
            System.out.println("value: " + this.value);
        }

        public void decrease() {
            if (this.value > 0) {
                this.value--;
            }
        }

        public void reset() {
            this.value = 0;
        }

        public void setInitial() {
            this.value = this.initialValue;
        }
    }
}
