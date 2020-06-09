package UML;

public class Pyramid extends Shape{
    private double s;
    private double h;


    public Pyramid(double h, double s) {
        super(s * h * 4 / 3);

        this.s = s;
        this.h = h;

    }
    @Override
    public void draw (){
        System.out.println(super.getVolume() + " " + this.s + " " + this.h);
    }
}