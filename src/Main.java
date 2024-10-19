public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 50),
                new Medic(80, 0, 10),
                new Warrior(120, 60)
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();


            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();

            }
        }

    }
}
