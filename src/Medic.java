public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, SuperAbilityType.HEALING);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HEALING");

    }

    public void increaseExperience() {
        healPoints += healPoints / 10;
        System.out.println("Medic увеличил опыт лечения, теперь healPoints: " + healPoints);
    }

}