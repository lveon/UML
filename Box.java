package UML;

public class Box extends Shape {

    public Box(double volume) {
        super(volume);
    }

    public boolean add(Shape shape1) {
        return super.getVolume() > shape1.getVolume();
    }

    @Override
    public void draw () {
        System.out.println(super.getVolume());
    }
}
