import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        //Number of sides.
        int n = 8;
        //Calculate the angle.
        double B = 360.0 / n;
        double A = 1.0 / 2.0 * B;
        //Calculate length of the triangle.
        double s = 2.0 * Math.toRadians(A);
        //Get the polygon perimeter.
        double p = n * s;
        //Estimate PI.
        double PI = p / 2.0;
        //Print PI
        System.out.println(PI);
    }
}
