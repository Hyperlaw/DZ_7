public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private SuperAbilityType superAbilityType;

    public Hero(int health, int damage, SuperAbilityType superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }
}
