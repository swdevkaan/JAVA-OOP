package deneme;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        this.overdraftLimit = 500.0; // Varsayılan eksi bakiye limiti
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        // Çekilmek istenen miktar (Bakiye + eksi limit) tutarından küçükse izin ver
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Hata: Çek limitiniz (" + overdraftLimit + " TL) aşıldı!");
        }
    }

    @Override
    public String toString() {
        return "Checking Account - ID: " + getId() + 
               ", Bakiye: " + getBalance() + 
               " TL, Eksi Limit: " + overdraftLimit + " TL";
    }
}