import java.util.ArrayList;
import java.util.List;

class Arena {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.name + " приєднався до арени!");
    }

    public void attack(Character attacker, Character target) {
        System.out.println(attacker.name + " атакує " + target.name + "!");
        target.health -= attacker.attackPower;
        System.out.println(target.name + " отримав урон. Залишилось здоров'я: " + target.health);
    }

    public void displayCharacters() {
        System.out.println("=== Учасники на арені ===");
        for (Character character : characters) {
            character.displayInfo();
        }
    }
}

interface Observer {
    void update(String message);
}

class Spectator implements Observer {
    private String name;

    public Spectator(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Спостерігач " + name + ": " + message);
    }
}

class ArenaWithObservers extends Arena {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void addCharacter(Character character) {
        super.addCharacter(character);
        notifyObservers(character.name + " з'явився на арені.");
    }
}
