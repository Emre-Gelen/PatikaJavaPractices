import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height,weight,bm;

        Scanner sc = new Scanner(System.in);

        System.out.print("Height(cm): ");
        height = sc.nextDouble();
        System.out.print("Weight(cm): ");
        weight = sc.nextDouble();

        bm = weight / (Math.pow(height,2));
        System.out.println("Body mass index: " + bm);
    }
}
