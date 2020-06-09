package UML;


public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }

    @Override
    public boolean equals (Object obj) {
        if (!super.equals(obj)){
            return false;
        } else if (obj instanceof Cylinder){
            Cylinder c = (Cylinder) obj;
            if (this.height == c.height){
                return true;
            }
        }
        return false;
    }


    public double getHeight() {
        return height;
    }
}
