public class Spar {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("A",15,100,70,100);
        Fighter fighter2 = new Fighter("B",20,80,60,100);

        Match m1 = new Match(fighter1,fighter2,55,75);
        m1.Fight();
    }
}
