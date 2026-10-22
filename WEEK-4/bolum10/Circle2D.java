package bolum10;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    // --- CONSTRUCTOR'LAR ---
    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // --- GETTER'LAR ---
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // --- ALAN VE ÇEVRE ---
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // --- GEOMETRİK KONTROLLER ---
    
    // 1. Verilen (x, y) noktası çemberin içinde mi?
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance <= radius;
    }

    // 2. Verilen çember tamamen bu çemberin içinde mi?
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
        return distance + circle.getRadius() <= this.radius;
    }

    // 3. Verilen çember bu çemberle kesişiyor / örtüşüyor mu?
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
        return distance < this.radius + circle.getRadius() && !contains(circle);
    }
}