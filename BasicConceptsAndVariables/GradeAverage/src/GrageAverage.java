import java.util.Scanner;

public class GrageAverage {
    public static void main(String[] args) {
        int math, music, physic, history;
        Scanner sc = new Scanner(System.in);

        System.out.print("Math Note: ");
        math = sc.nextInt();

        System.out.print("Music Note: ");
        music = sc.nextInt();

        System.out.print("Physic Note: ");
        physic = sc.nextInt();

        System.out.print("History Note: ");
        history = sc.nextInt();

        int total = math + music + physic + history;
        double average = total / 4.0;

        System.out.println("Notes Average: " + average);
        System.out.println("Status: " + (average >= 60 ? "Passed" : "Failed"));
    }
}
