package abstractclass;

import java.util.stream.Stream;

public abstract class Quadrangle implements Figure {
    protected double sideLength1;
    protected double sideLength2;
    protected double sideLength3;
    protected double sideLength4;


    public Quadrangle(double sideLength1, double sideLength2, double sideLength3, double sideLength4) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
        this.sideLength4 = sideLength4;
    }

    @Override
    public double calcPerim() {
        return sideLength1 +
                sideLength2 +
                sideLength3 +
                sideLength4;
    }
}
