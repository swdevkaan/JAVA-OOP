package deneme;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {
    public static void main(String[] args) {
       
        ArrayList<Object> list = new ArrayList<>();

     
        list.add(new Loan(3.5, 5, 50000));  
        list.add(new Date());                
        list.add("Java Programlama");        
        list.add(new Circle(4.5));          

         for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}