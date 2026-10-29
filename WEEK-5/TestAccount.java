package deneme;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        CheckingAccount checking = new CheckingAccount(1123, 5000, 2000);
        SavingsAccount savings = new SavingsAccount(1124, 10000);

        System.out.println("--- BİLGİLER ---");
        System.out.println(account.toString());
        System.out.println(checking.toString());
        System.out.println(savings.toString());

        System.out.println("\n--- PARA ÇEKME TESTLERİ ---");
        
         System.out.println("Checking hesabından 6000 TL çekiliyor...");
        checking.withdraw(6000);
        System.out.println("Yeni Bakiye: " + checking.getBalance());

         System.out.println("\nSavings hesabından 12000 TL çekilmeye çalışılıyor...");
        savings.withdraw(12000);
        System.out.println("Bakiye Değişmedi: " + savings.getBalance());
    }
}