package gameMechanics;

/**
 * Created by tito on 04.07.16.
 */
public class Creature {

    String name;
    String species;
    String description;
    int xp;
    int hp;
    int baseDamage;
    int armor;
    Weapon weapon;

    public Creature(String name, String species, String description, int xp, int hp, int baseDamage, int armor, Weapon weapon) {
        this.setName(name);
        this.setSpecies(species);
        this.setDescription(description);
        this.setXp(xp);
        this.setHp(hp);
        this.setBaseDamage(baseDamage);
        this.setArmor(armor);
        this.setWeapon(weapon);
    }

    // object methods


    /**
     * Carries out an attack by the creature (Player or NPC)
     * @return Int Value of the attack
     */
    public int attack() {
        return 15;
    }

    public void defend() {
        // TODO: implement
    }


    // setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public String getDescription() {
        return this.description;
    }

    public int getXp() {
        return this.xp;
    }

    public int getHp() {
        return this.hp;
    }

    public int getBaseDamage() {
        return this.baseDamage;
    }

    public int getArmor() {
        return this.armor;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
}
