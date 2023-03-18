package kg.geeks.hw6.gemeral;

import kg.geeks.hw6.objects.Boss;
import kg.geeks.hw6.objects.Skeleton;
import kg.geeks.hw6.objects.Weapon;
import kg.geeks.hw6.objects.WeaponType;

public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponType.COLD, "Sword");
        Boss boss = new Boss("Thanos",1000, 50, bossWeapon);
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton(250, 30, 12);
        Skeleton skeleton2 = new Skeleton(200, 25, 15);
        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}