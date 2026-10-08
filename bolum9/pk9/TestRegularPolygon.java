 
package bolum9.pk9;
 
public class TestRegularPolygon {
    public static void main(String [] args){
        
        RegularPolygon polygon1=new RegularPolygon();
        
        RegularPolygon polygon2=new RegularPolygon(6,4);
        
        RegularPolygon polygon3=new RegularPolygon(10,4,5.6,7.8);
    
    System.out.println("1. Cokgen Cevresi: " + polygon1.getPerimeter());
        System.out.println("1. Cokgen Alanİ: " + polygon1.getArea());
        System.out.println("------------------------------------");
        
        System.out.println("2. Cokgen Cevresi: " + polygon2.getPerimeter());
        System.out.println("2. Cokgen Alanİ: " + polygon2.getArea());
        System.out.println("------------------------------------");
        
        System.out.println("3. Cokgen Cevresi: " + polygon3.getPerimeter());
        System.out.println("3. Cokgen Alani: " + polygon3.getArea());
    }
    
    
}
