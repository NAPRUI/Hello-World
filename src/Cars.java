import java.util.Scanner;

public class Cars {

    private int doorNum;
    private int engineSize;
    private int fuelAmount;
    private int carSize;
    private int mpg;
    private double distVal;
    private double coef;

    void setCarProperties(int engine, int size) {

        engineSize = engine;
        carSize = size;

        if (engineSize < 1) {
            mpg = 80;
        } else if (1 < engineSize && engineSize < 3) {
            mpg = 60;
        } else if (engineSize > 3) {
            mpg = 40;
        }

        if (carSize == 1) {
            coef = 1.5;
        } else if (carSize == 2) {
            coef = 1;
        } else if (carSize == 3) {
            coef = 0.75;
        } else if (carSize == 4) {
            coef = 0.5;
        }

    }

    void calculateDistance(int fuel) {
        distVal = (double) fuel * (double) mpg * coef;
    }

    void showDistance() {
        System.out.println("Distance value: " + distVal);
    }


}
