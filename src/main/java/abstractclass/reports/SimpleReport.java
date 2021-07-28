package abstractclass.reports;

import abstractclass.Figure;

public class SimpleReport implements Report {
    @Override
    public void report(Figure figure) {
        System.out.println(
                "Name : " + figure.getClass().getSimpleName() + "\n" +
                        "Area : " + figure.calcArea() + "\n" +
                        "Perim : " + figure.calcPerim()
        );
    }
}
