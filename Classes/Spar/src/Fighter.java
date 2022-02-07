public class Fighter {
    String Name;
    int Damage;
    int Health;
    int Weight;
    int Dodge;

    Fighter(String Name, int Damage, int Health, int Weight,int Dodge) {
        this.Name = Name;
        this.Damage = Damage;
        this.Health = Health;
        this.Weight = Weight;
        this.Dodge = Dodge;
    }

    int Hit(Fighter enemy) {
        if (enemy.isDodge()){
            System.out.println(enemy.Name + " avoided from attack.");
            return  enemy.Health;
        }
        else {
            System.out.println(this.Name + " hit " + this.Damage + " damage to " + enemy.Name);
            if (enemy.Health - this.Damage < 0) {
                return 0;
            }
            return enemy.Health - this.Damage;
        }
    }

    boolean isDodge(){
        double random = Math.random() * 100;
        return this.Dodge >= random;
    }
}
