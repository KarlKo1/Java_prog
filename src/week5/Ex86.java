package week5;

public class Ex86 {
    public static void main(String[] args) {
        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance());
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card " + cardOfPekka.balance());

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card " + cardOfPekka.balance());

        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange);

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was " + theChange);

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was " + theChange);

        System.out.println(unicafeExactum);

        unicafeExactum = new CashRegister();

        theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange);

        LyyraCard cardOfJim = new LyyraCard(7);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println(unicafeExactum);

        unicafeExactum = new CashRegister();
        System.out.println(unicafeExactum);

        cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println(unicafeExactum);

    }

    static class LyyraCard {
        private double balance;

        public LyyraCard(double balance) {
            this.balance = balance;
        }

        public double balance() {
            return this.balance;
        }

        public void loadMoney(double amount) {
            this.balance += amount;
        }

        public boolean pay(double amount) {
            if (this.balance >= amount) {
                this.balance -= amount;
                return true;
            } else {
                return false;
            }
        }
    }

    static class CashRegister {
        private double cashInRegister;   // the amount of cash in the register
        private int economicalSold;      // the amount of economical lunches sold
        private int gourmetSold;         // the amount of gourmet lunches sold

        public CashRegister() {
            this.cashInRegister = 1000;
        }

        public double payEconomical(double cashGiven) {
            if (cashGiven >= 2.50) {
                this.cashInRegister += 2.50;
                this.economicalSold++;
                return cashGiven - 2.50;
            } else {
                return cashGiven;
            }
        }

        public double payGourmet(double cashGiven) {
            if (cashGiven >= 4.0) {
                this.cashInRegister += 4.0;
                this.gourmetSold++;
                return cashGiven - 4.0;
            } else {
                return cashGiven;
            }
        }

        public String toString() {
            return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
        }

        public boolean payEconomical(LyyraCard card) {
            boolean canPay = card.pay(2.50);

            if (canPay) {
                this.economicalSold++;
                return true;
            } else {
                return false;
            }
        }

        public boolean payGourmet(LyyraCard card) {
            boolean canPay = card.pay(4.00);

            if (canPay) {
                this.gourmetSold++;
                return true;
            } else {
                return false;
            }
        }

        public void loadMoneyToCard(LyyraCard card, double sum) {
            if (sum > 0) {
                card.loadMoney(sum);
                this.cashInRegister += sum;
            }
        }
    }
}