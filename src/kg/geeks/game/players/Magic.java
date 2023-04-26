package kg.geeks.game.players;

public class Magic extends Hero {

    private final int damage;

    public Magic(int health, int damage, String name) {

        super(health, damage, name, SuperAbility.BOOST);
        this.damage = damage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + this.damage);
            }
        }

    }
}