package abstractclass.reports;

import abstractclass.Figure;

import java.time.LocalDate;
import java.time.LocalTime;

public class ProductionReport implements Report {
    @Override
    public void report(Figure figure) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        System.out.println("currentDate = " + currentDate);
        System.out.println("currentTime = " + currentTime);

        String report = "Name : " + figure.getClass().getSimpleName() + "\n" +
                "Area : " + figure.calcArea() + "\n" +
                "Perim : " + figure.calcPerim();


        System.out.println(report);

    }
}
