 package bolum10;

 
    public class MyPoint {
     private double x;
     private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
     
   public MyPoint(){};
    public  MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    
  public double distance(double x, double y) {
    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
}
    public double distance(MyPoint point){
        return distance(point.getX(),point.getY());
        
    }
     
    public static double distance(MyPoint p1, MyPoint p2) {
    return p1.distance(p2);
}
    
    
     
}
