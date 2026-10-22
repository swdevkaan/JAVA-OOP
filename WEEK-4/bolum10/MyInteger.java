 package bolum10;

 
public class MyInteger {
    private int value;
    
    public MyInteger (int value){
            this.value=value;
        
    }
    public  int getValue(){
        return value;
    }
    
   public boolean isEven(){
      return value %2 ==0;
   }
    public boolean isOdd(){
     return value %2 !=0;  
    }
    
   public boolean isPrime(){
      
        if (value <= 1) return false;
    for (int i = 2; i <= value / 2; i++) {
        if (value % i == 0) {
            return false;
        }
    }
    return true;
       }
        
     
  
    
    public static boolean isEven(int value){
        return value %2 == 0;
    }
    
    
    public static boolean isOdd(int value){
        return value % 2 !=0 ;
    }
    
    
    public static boolean isPrime(int value){
         for(int i=2; i<=value/2;i++){
           if(value%i==0){
               return false;
               }
           
    }
                         return true;

    }
    
    public static boolean isEven(MyInteger o) {
        return isEven(o.getValue());
    }

    public static boolean isOdd(MyInteger o) {
        return isOdd(o.getValue());
    }

    public static boolean isPrime(MyInteger o) {
        return isPrime(o.getValue());
    }
    
    
    
 public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger o) {
        return this.value == o.getValue();
    }

  
    public static int parseInt(char[] numericChars) {
        return parseInt(new String(numericChars));
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}
         
         
         
         
         
         
         
         















 