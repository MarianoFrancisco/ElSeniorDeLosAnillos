
public class PracticaOpcional {
    static CreateCharacters character = new CreateCharacters();
    public static void main(String[] args) {
        character.createBeast();
        character.createHero();
        PlayArmy play = new PlayArmy();
        System.out.println("Hola bienvenido al simulador de batallas\n"
        + "entre ejercitos de todos los tipos de Heroes y Bestias\n"
        + "dependera de tu suerte para que un ejercito gane");
        play.playArmy();
    }
}
