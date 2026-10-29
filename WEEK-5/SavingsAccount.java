package deneme;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Hata: Tasarruf hesabında yetersiz bakiye! Eksiye düşülemez.");
        }
    }

    @Override
    public String toString() {
        return "Savings Account - ID: " + getId() + ", Bakiye: " + getBalance() + " TL";
    }
}