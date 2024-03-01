public class Main {

    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(180, 15),
                new Warrior(190, 10),
                new Medic(200, 5, 50)
        };
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            System.out.println();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }

}