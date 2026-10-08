 
package bolum9.pkg13;

 
public class Location {
    public int row;
    public int column;
    public double maxValue;
    
    


public Location (int newrow,int newcolumn, double newmaxValue){
    row=newrow;
    column=newcolumn;
    maxValue=newmaxValue;
    
    
}


public static Location locateLargest(double[][] a) {
    int maxRow = 0;
    int maxCol = 0;
    double max = a[0][0];

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] > max) {
                max = a[i][j];
                maxRow = i;
                maxCol = j;
            }
        }
    }

    return new Location(maxRow, maxCol, max);
}









}