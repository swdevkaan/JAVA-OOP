
package bolum9;

public class TestStock {
    public static void main(String []args){
     
        Stock k1=new Stock("ORCL","Oracle Corparation",34.5,34.35);
        
        
        System.out.println(k1.symbol);
        System.out.println(k1.name);
        System.out.println(k1.currentPrice);
        System.out.println(k1.previousClosingPrice);
        System.out.println(k1.getChangePercent());
       
    }
    
}
