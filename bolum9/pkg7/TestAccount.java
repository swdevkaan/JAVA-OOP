 
package bolum9.pkg7;

 
public class TestAccount {

public static void main(String [] args){
    
    Account user=new Account(1122,20000);
    Account.setAnnualInterestRate(4.5);
        user.withdraw(2500);
        user.deposit(3000);
    
        System.out.println(user.getBalance());
        System.out.println(user.getMonthlyInterest());
        System.out.println(user.getDatecreated());
                }   

    
}
