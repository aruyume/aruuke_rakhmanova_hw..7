public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String typeAbility;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeAbility() {
        return typeAbility;
    }

    public void setTypeAbility(String typeAbility) {
        this.typeAbility = typeAbility;
    }

    public Hero(int health, int damage, String typeAbility) {
        this.health = health;
        this.damage = damage;
        this.typeAbility = typeAbility;
    }
}
