package deneme;

public class TestNewAccount {
    public static void main(String[] args) {
         Account2 account = new Account2("George", 1122, 1000);
        account.setAnnualInterestRate(1.5);

         account.deposit(30);
        account.deposit(40);
        account.deposit(50);

         account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

         System.out.println("================ HESAP OZETI ================");
        System.out.println("Musteri Adi       : " + account.getName());
        System.out.println("Hesap ID          : " + account.getId());
        System.out.println("Yillik Faiz Orani : %" + account.getAnnualInterestRate());
        System.out.println("Guncel Bakiye     : $" + account.getBalance());
        
        System.out.println("\n---------------- ISLEM GECMISI ----------------");
        for (Transaction t : account.getTransactions()) {
            System.out.println(t.toString());
        }
    }
}