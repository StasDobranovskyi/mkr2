public class Game {
    public static void main(String[] args) {
        ArenaWithObservers arena = new ArenaWithObservers();

        Spectator spectator = new Spectator("Глядач 1");
        arena.addObserver(spectator);

        Character warrior = CharacterFactory.createCharacter("воїн");
        Character mage = CharacterFactory.createCharacter("маг");
        Character archer = CharacterFactory.createCharacter("лучник");

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        arena.displayCharacters();

        arena.attack(warrior, mage);
        arena.attack(archer, warrior);

        arena.displayCharacters();
    }
}
