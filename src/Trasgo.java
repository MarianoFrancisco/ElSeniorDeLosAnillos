/**
 * Trasgo
 */
public class Trasgo extends Beast{

    public Trasgo(String name){
        super(325, name, 50);
    }
    public static void saludar(){
        for(int i=0;i<=2;i++){
            System.out.println("Hola soy un trasgo y mi nombre es: "+CreateCharacters.trasgo[i].getName());
        }
    }
}