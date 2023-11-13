package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    void run(Scanner scanner) {
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();

        Point point = new Point(x, y);

        CheckQuarterCalculation checkQuarterCalculation = new CheckQuarterCalculation();
        checkQuarterCalculation.checkQuarter(point);
    }
}
