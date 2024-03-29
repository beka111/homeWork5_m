package org.example;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(40);
        boss.setTypeOfDefence(" magic");
        System.out.println("boss:" + " health :" + boss.getHealth() + "  damage" + boss.getDamage() +
                " typeOfDefance" + boss.getTypeOfDefence());
        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("heroes:" + " health:" + heroes[i].getHealth() + " damage:" + heroes[i].getDamage() +
                    " ability:" + heroes[i].getAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero manga = new Hero(200, 30, "archer");
        Hero devill = new Hero(450, 50);
        Hero crualla = new Hero(345, 19);
        return new Hero[0];
    }
}
