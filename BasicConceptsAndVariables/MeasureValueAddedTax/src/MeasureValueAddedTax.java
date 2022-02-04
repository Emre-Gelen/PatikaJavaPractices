import java.util.Scanner;

public class MeasureValueAddedTax {
    public static void main(String[] args) {
        double vAddedTax, amount, amountOfVAT, amountWithVAT;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount:");
        amount = sc.nextDouble();

        vAddedTax = amount > 1000 ? .08 : .18;
        amountOfVAT = amount * vAddedTax;
        amountWithVAT = amount + amountOfVAT;

        System.out.println("Amount without VAT:" + amount);
        System.out.println("Ratio of VAT:" + vAddedTax);
        System.out.println("Amount of VAT:" + amountOfVAT);
        System.out.println("Amount with VAT:" + amountWithVAT);
    }
}
