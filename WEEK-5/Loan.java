package deneme;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Loan: Miktar = " + loanAmount + " TL, Yil = " + numberOfYears + ", Faiz = %" + annualInterestRate;
    }
}