package pl.javastart.task;

public class CheckQuarterCalculation {
    public void checkQuarter(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            System.out.printf("Punkt (%d, %d) leży w ćwiartce I", point.getX(), point.getY());
        } else if (point.getX() < 0 && point.getY() > 0) {
            System.out.printf("Punkt (%d, %d) leży w ćwiartce II", point.getX(), point.getY());
        } else if (point.getX() < 0 && point.getY() < 0) {
            System.out.printf("Punkt (%d, %d) leży w ćwiartce III", point.getX(), point.getY());
        } else if (point.getX() > 0 && point.getY() < 0) {
            System.out.printf("Punkt (%d, %d) leży w ćwiartce IV", point.getX(), point.getY());
        } else if (point.getX() == 0 && point.getY() == 0) {
            System.out.printf("Punkt (%d, %d) leży w środku układu współrzędnych", point.getX(), point.getY());
        } else if (point.getX() == 0) {
            System.out.printf("Punkt (%d, %d) leży na osi X", point.getX(), point.getY());
        } else if (point.getY() == 0) {
            System.out.printf("Punkt (%d, %d) leży na osi Y", point.getX(), point.getY());
        } else {
            System.out.println("Błąd, podane parametry nie pozwalają na określenie ćwiartki.");
        }
    }
}
