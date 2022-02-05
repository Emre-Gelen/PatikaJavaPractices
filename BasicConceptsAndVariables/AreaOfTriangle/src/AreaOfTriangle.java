import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double a, b, c, area, u;

        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        a = sc.nextDouble();
        System.out.print("B: ");
        b = sc.nextDouble();
        System.out.print("C: ");
        c = sc.nextDouble();

        u = (a + b + c) / 2.0;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Area: " + area);
    }
}
