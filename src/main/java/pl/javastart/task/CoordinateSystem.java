package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void run(Scanner scanner) {
        System.out.println("Podaj X");
        this.x = scanner.nextInt();
        System.out.println("Podaj Y");
        this.y = scanner.nextInt();
    }
}
