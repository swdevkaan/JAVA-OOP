 
package bolum10;

 
public class TestMyInteger {
 public static void main(String [] args){
 
         MyInteger n1 = new MyInteger(7);
        System.out.println("n1 degeri: " + n1.getValue());
        System.out.println("n1 cift mi? " + n1.isEven());
        System.out.println("n1 tek mi? " + n1.isOdd());
        System.out.println("n1 asal mi? " + n1.isPrime());

        System.out.println("----------------------------");

         System.out.println("10 cift mi? " + MyInteger.isEven(10));
        System.out.println("10 tek mi? " + MyInteger.isOdd(10));
        System.out.println("10 asal mi? " + MyInteger.isPrime(10));

        System.out.println("----------------------------");

         MyInteger n2 = new MyInteger(12);
        System.out.println("n2 (12) cift mi? " + MyInteger.isEven(n2));

        System.out.println("----------------------------");

         System.out.println("n1 (7), 7'ye essit mi? " + n1.equals(7));
        System.out.println("n1 (7), n2'ye (12) esit mi? " + n1.equals(n2));

        System.out.println("----------------------------");

         char[] rakamlar = {'4', '5', '6'};
        int sayi1 = MyInteger.parseInt(rakamlar);
        int sayi2 = MyInteger.parseInt("123");

        System.out.println("char[] -> int: " + sayi1);
        System.out.println("String -> int: " + sayi2);
        System.out.println("Toplamlari: " + (sayi1 + sayi2));
     
     
     
     
     
     
     
 }
    
    
}
