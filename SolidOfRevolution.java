package UML;

public class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double increaseRadiuse (double d) {
        this.radius  = this.radius *  d;
        return this.radius;
    }

    @Override
    public void draw (){
        System.out.println(super.getVolume() + " " + radius);
    }

}
