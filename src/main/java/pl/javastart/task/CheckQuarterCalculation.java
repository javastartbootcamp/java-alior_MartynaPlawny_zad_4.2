package pl.javastart.task;

public class CheckQuarterCalculation {
    public void checkQuarter(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            printFunctionAboutQuarter(point.getX(), point.getY(), "I");
        } else if (point.getX() < 0 && point.getY() > 0) {
            printFunctionAboutQuarter(point.getX(), point.getY(), "II");
        } else if (point.getX() < 0 && point.getY() < 0) {
            printFunctionAboutQuarter(point.getX(), point.getY(), "III");
        } else if (point.getX() > 0 && point.getY() < 0) {
            printFunctionAboutQuarter(point.getX(), point.getY(), "IV");
        } else if (point.getX() == 0 && point.getY() == 0) {
            printFunctionAboutPointOnTheMiddleOfCoordinateSystem(point.getX(), point.getY());
        } else if (point.getX() == 0) {
            printFunctionAboutPointOnAxis(point.getX(), point.getY(), "Y");
        } else if (point.getY() == 0) {
            printFunctionAboutPointOnAxis(point.getX(), point.getY(), "X");
        }
    }

    private void printFunctionAboutQuarter(int x, int y, String quarter) {
        System.out.printf("Punkt (%d, %d) leży w %s ćwiartce układu współrzędnych", x, y, quarter);
    }

    private void printFunctionAboutPointOnAxis(int x, int y, String axis) {
        System.out.printf("Punkt (%d, %d) leży na osi %s", x, y, axis);
    }

    private void printFunctionAboutPointOnTheMiddleOfCoordinateSystem(int x, int y) {
        System.out.printf("Punkt (%d, %d) leży na środku układu współrzędnych", x, y);
    }
}