/**
 * Orco
 */
public class Orco extends Beast{

    public Orco(String name){
        super(300, name, 50);
    }
    public static void saludar(){
        for(int i=0;i<=2;i++){
            System.out.println("Hola soy un orco y mi nombre es: "+CreateCharacters.orco[i].getName());
        }
    }
}