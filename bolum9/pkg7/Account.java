package bolum9.pkg7;
 
import java.util.Date;

public class Account {
    
   private int id;
   private double balance;
    private static double annualInterestRate;
       private Date dateCreated;
    
    public  Account(){
        id =0;
        balance=0.0;
        dateCreated = new Date();
    }
       public  Account(int newid,double newbalance){
           
           id = newid;
           balance=newbalance;
       dateCreated = new Date();
       }
       
       
       public int getid(){
           return id;
       }
       public void setid(int newid){
           id = newid;
       }
       public Date getdateCreated(){
           return dateCreated;
       }
       
       public static double getAnnualInterestRate(){
          return annualInterestRate;
       }
       
       public static void setAnnualInterestRate(double rate){
           annualInterestRate = rate;
       }
       public double getBalance() {
    return balance;
}
       
       public Date getDatecreated(){
           return dateCreated;
       }
       
       public double getMonthlyInterestRate(){
           return (annualInterestRate/100)/12;
       }
       
       public double getMonthlyInterest(){
           return balance*getMonthlyInterestRate();
       }
       public void  withdraw(double amount){
            balance-=amount;
       }
       public void deposit(double amount){
           balance+=amount;
       }
       
       
       
       
       
       
       
       
       
       
       
       
}
