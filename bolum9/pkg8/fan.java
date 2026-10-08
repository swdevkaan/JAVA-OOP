 
package bolum9.pkg8;

 
public class fan {
    
    public static final int SLOW =1;
    public static final int MEDIUM =2;
    public static final int FAST=3;
    
    private int speed=SLOW;
     private double radius=5;
     private String color ="blue";       
    private boolean on=false;
   


public  fan(){
    
}

public int getspeed(){
    return speed;
}
public void setspeed(int newspeed){
    speed=newspeed;
}
public double getradius(){
    return radius;
}
public void setradius(double newradius){
    radius=newradius;
}
public String getcolor(){
    return color;
}
public void setcolor(String newcolor){
    color=newcolor;
}
public boolean ison(){
    return on;
}
public void seton(boolean newon){
    on=newon;
}

public String toString(){
    if(on){
        return "speed: " + speed + ", color : " + color + ", radius: " +radius;
    }
    else{
        return "color: " + color +", radius: " + radius + ",fan is off ";
    }
    
    
}







}