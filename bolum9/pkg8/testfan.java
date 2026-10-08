 
package bolum9.pkg8;

 
public class testfan {
    public static void main(String [] args){
        fan fan1= new fan();
        fan1.setspeed(fan.FAST);
        fan1.setradius(10);
        fan1.setcolor("yellow");
        fan1.seton(true);
        
        
        fan fan2= new fan();
        fan2.setspeed(fan.MEDIUM);
        fan2.setradius(5);
        fan2.setcolor("blue");
        fan2.seton(false);
   
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        
        
    }
    
    
    
}
