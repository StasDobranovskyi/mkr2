abstract class Character {
    String name;
    int health;
    int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void displayInfo() {
        System.out.println(name + " | Здоров'я: " + health + " | Атака: " + attackPower);
    }
}
