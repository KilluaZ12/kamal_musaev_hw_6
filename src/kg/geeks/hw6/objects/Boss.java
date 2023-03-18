package kg.geeks.hw6.objects;

public class Boss extends GameEntity{

    private Weapon weapon;

    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public Boss(String name, int health, int damage, Weapon weapon){
        super(name, health, damage);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        if(getName() == null){
            return "Health: " + getHealth() + ", Damage: " + getDamage();
        }
        return "Boss name: " + getName() + ", Health: " + getHealth() + ", Damage: " + getDamage() +
                ", Weapon type: " + weapon.getWeaponType() + ", Weapon name: " + weapon.getWeaponName();
    }
}
