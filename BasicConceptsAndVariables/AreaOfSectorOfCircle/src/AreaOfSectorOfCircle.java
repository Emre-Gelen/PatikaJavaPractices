import java.util.Scanner;

public class AreaOfSectorOfCircle {
    public static void main(String[] args) {
        double area, r, angle;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter r: ");
        r = sc.nextDouble();
        System.out.print("Enter angle: ");
        angle = sc.nextDouble();

        System.out.println("Result: " + measureSector(r,angle));
    }
    private static double measureSector(double r,double angle){
        double  pi = Math.PI;
        return (pi*Math.pow(r,2)*angle) / 360;
    }
}
