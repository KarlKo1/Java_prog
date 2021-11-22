package week5;

public class Ex84 {
    public static void main(String[] args) {


    }

    public class Counter {

        private int startingValue;
        private boolean check;
        private int value;

        public Counter(int startingValue, boolean check) {
            this.startingValue = startingValue;
            this.check = check;
            this.value = startingValue;
        }

        public Counter(int startingValue) {
            this.startingValue = startingValue;
            this.check = false;
            this.value = startingValue;
        }

        public Counter(boolean check) {
            this.startingValue = 0;
            this.check = check;
            this.value = startingValue;
        }

        public Counter() {
            this.startingValue = 0;
            this.check = false;
            this.value = 0;
        }

        public int value() {
            return this.value;
        }

        public void increase() {
            this.value++;
        }

        public void decrease() {
            if (this.check && this.value < 0) {
            } else {
                this.value--;
            }
        }

        public void increase(int increaseAmount) {
            if (increaseAmount < 0) {
            } else {
                this.value += increaseAmount;
            }
        }

        public void decrease(int decreaseAmount) {
            if (decreaseAmount < 0) {
            } else {
                if (this.check) {
                    this.value -= decreaseAmount;
                    if (this.value < 0) {
                        this.value = 0;
                    }
                } else {
                    this.value -= decreaseAmount;
                }
            }
        }
    }
}