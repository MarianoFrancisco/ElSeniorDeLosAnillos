/**
 * Elf
 */
public class Elf extends Hero{
    public Elf(String name){
        super(250, name, 50);
    }
    public static void saludar(){
        for(int i=0;i<=1;i++){
            System.out.println("Hola soy un elfo y mi nombre es: "+CreateCharacters.elf[i].getName());
        }
    }
}