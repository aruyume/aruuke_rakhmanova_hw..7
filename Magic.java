public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, "MAGICAL");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic health: " + getHealth() + ", Magic damage: " + getDamage());
        System.out.println("Magic применил суперспособность " + getTypeAbility());
    }
}
