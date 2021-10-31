package week4;

public class Ex77 {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);

        System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card);
    }
    static class LyyraCard {
        private double balance;

        public LyyraCard(double balanceAtStart) {
            this.balance = balanceAtStart;
        }

        public String toString() {
            return "The card has " + this.balance + " euros";
        }

        public void payEconomical() {
            if (this.balance >= 2.50) {
                this.balance -= 2.50;
            }

        }

        public void payGourmet() {
            if (this.balance >= 4.00) {
                this.balance -= 4.00;
            }
        }

        public void loadMoney(double amount) {
            if (amount >= 0) {
                this.balance += amount;
                if (this.balance >= 150.00) {
                    this.balance = 150.00;
                }
            }
        }
    }
}


