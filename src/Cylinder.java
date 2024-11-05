public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Цилиндр: Площадь = " + calculateArea() + ", Объем = " + calculateVolume();
    }
}






