package kg.geeks.game.players;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
    }
    public void setSavedDamage(int savedDamage) {
        this.blockedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int getDamageOfBerserk = boss.getDamage() + this.getDamage();
        System.out.println("Берсерк нанёс заблокированный удар: " + getDamageOfBerserk);
        boss.setHealth(boss.getHealth() - getDamageOfBerserk);
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }
}
