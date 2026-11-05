package geometriccobject;
import java.util.Date;

public abstract class geometriccobject implements Comparable<geometriccobject> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected geometriccobject() {
        dateCreated = new Date();
    }

    protected geometriccobject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public Date getDateCreated() { return dateCreated; }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(geometriccobject o) {
        if (this.getArea() > o.getArea()) return 1;
        else if (this.getArea() < o.getArea()) return -1;
        else return 0;
    }

    public static geometriccobject max(geometriccobject o1, geometriccobject o2) {
        if (o1.compareTo(o2) >= 0) return o1;
        else return o2;
    }
}