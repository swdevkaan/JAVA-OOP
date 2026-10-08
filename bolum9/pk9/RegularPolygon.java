 
package bolum9.pk9;

 
public class RegularPolygon {
 
    private int n=3;
    private double side =1;
    private double x =0;
    private double y=0;
     
  
 public RegularPolygon(){
       
 }
 
 public RegularPolygon(int newn,double newside){
     n=newn;
     side=newside;
     
 }
    
    
     public RegularPolygon(int newn,double newside,double newx,double newy){
     n=newn;
     side=newside;
     x=newx;
     y=newy;
     
 }
    
     public int getn(){
         return n;
     }
    
     public void setn( int newn){
         n=newn;
     }
    
     public double getside(){
         return side;
     }
    public void setside(double newside){
        side=newside;
    }
    public double getx(){
        return x;
    }
    public void setx(double newx){
        x=newx;
    }
    
   public double gety(){
       return y;
   }
    public void sety(double newy){
        y=newy;
    }
    
    public double getPerimeter(){
        return n*side;
    }
    
    public double getArea() {
    return (n * side * side) / (4 * Math.tan(Math.PI / n));
}
    
    
    
    
    
    
    
    
    
}
