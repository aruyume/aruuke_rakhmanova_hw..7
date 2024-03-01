public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, "HEALING");
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic health: " + getHealth() + ", Medic damage: " + getDamage());
        System.out.println("Medic применил суперспособность " + getTypeAbility());
    }

    public void increaseExperience() {
        healPoints *= 1.1;
        System.out.println("Medic увеличил количество единиц лечения на " + healPoints);
    }
}
