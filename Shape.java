package UML;

public abstract class Shape {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj instanceof Shape) {
            Shape s = (Shape) obj;
            if (this.volume == s.getVolume()) {
                return true;
            }

        }
        return false;


    }

    public abstract void draw ();

  //  public abstract double doubleDecreaseSize (double divider);



}

