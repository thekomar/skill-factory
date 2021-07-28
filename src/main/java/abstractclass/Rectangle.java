package abstractclass;

public class Rectangle extends Quadrangle{
    public Rectangle(double sideLength1, double sideLength2) {
        super(sideLength1, sideLength2, sideLength1, sideLength2);
    }

    @Override
    public double calcArea() {
        return sideLength1  * sideLength4;
    }
}
