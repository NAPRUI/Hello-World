/**
 * Created with IntelliJ IDEA.
 * User: r.li@london.net-a-porter.com
 * Date: 06/09/2013
 * Time: 10:40
 * To change this template use File | Settings | File Templates.
 */

import java.util.Scanner;

public class MileageCalculator {


    public static void 4(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter engine size (integers): ");
        int w = scan.nextInt();
        System.out.print("Please enter car size, 1 for compact, 2 for small, 3 for large, 4 for estate: ");
        int s = scan.nextInt();
        System.out.print("Please enter amount of fuel (integers): ");
        int f = scan.nextInt();

        Cars myCar = new Cars();
        myCar.setCarProperties(w, s);
        myCar.calculateDistance(f);

        myCar.showDistance();
    }

}
