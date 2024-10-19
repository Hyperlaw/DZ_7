public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил супер способность CRITICAL DAMAGE");
    }
}
