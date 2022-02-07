import java.util.Random;

public class Match {
    Fighter Fighter1;
    Fighter Fighter2;
    int MinWeight;
    int MaxWeight;

    Match(Fighter F1, Fighter F2, int MinWeight, int MaxWeight) {
        this.Fighter1 = F1;
        this.Fighter2 = F2;
        this.MinWeight = MinWeight;
        this.MaxWeight = MaxWeight;
    }

    void Fight() {
        if (isCheck()) {
            Fighter first = getFirstAthlete();
            while (!isWin()) {
                if (first == this.Fighter1) {
                    Fighter2.Health = Fighter1.Hit(Fighter2);
                    if (isWin()) {
                        break;
                    }
                    Fighter1.Health = Fighter2.Hit(Fighter1);
                } else {
                    Fighter1.Health = Fighter2.Hit(Fighter1);
                    if (isWin()) {
                        break;
                    }
                    Fighter2.Health = Fighter1.Hit(Fighter2);
                }
                System.out.println(Fighter1.Name + " health is " + Fighter1.Health);
                System.out.println(Fighter2.Name + " health is " + Fighter2.Health);
            }
        } else {
            System.out.println("Athletes weights not match.");
        }
    }

    boolean isCheck() {
        return (this.Fighter1.Weight >= MinWeight && this.Fighter1.Weight <= MaxWeight) &&
                (this.Fighter2.Weight >= MinWeight && this.Fighter2.Weight <= MaxWeight);
    }

    Fighter getFirstAthlete() {
        Random random = new Random();
        return random.nextFloat() > 0.5 ? this.Fighter1 : this.Fighter2;
    }

    boolean isWin() {
        if (this.Fighter1.Health == 0) {
            System.out.println("Winner is " + this.Fighter2.Name);
            return true;
        }
        if (this.Fighter2.Health == 0) {
            System.out.println("Winner is " + this.Fighter1.Name);
            return true;
        }
        return false;
    }
}
