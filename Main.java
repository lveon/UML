package UML;

public class Main {
    public static void main(String[] args) {
      /*  byte y = 5;
        sum(y);
        int i= 258;
        y = (byte)  i;
        System.out.println(y);*/
        Shape s = new Ball(4.2);
        Ball ball = new Ball(2.5);
        Cylinder cylinder = new Cylinder(5, 5);
        Pyramid pyramid = new Pyramid(100, 189);
        Box box = new Box(150);
        box.add(cylinder);



      //  System.out.println(s.equals(s));
        System.out.println();


       /* Shape  [] figure = new Shape [3];
        figure [0] = ball;
        figure [1] = cylinder;
        figure [2] = pyramid;

        if (figure [0] instanceof SolidOfRevolution ){
            SolidOfRevolution cyl2 = (SolidOfRevolution)figure [0];
            cyl2.increaseRadiuse(5.5);
        }

        if (figure [1] instanceof SolidOfRevolution ) {
            SolidOfRevolution cyl = (SolidOfRevolution) figure[1];
            cyl.increaseRadiuse(5.5);
        }


        String  s = "cat";

        cylinder.equals(cylinder);
        System.out.println(cylinder.equals(cylinder));*/





/*
        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));*/
    }
   /* public static int sum (int x) {
        return x + 2;
    }*/
}
