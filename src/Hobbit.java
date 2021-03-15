/**
 * Hobbit
 */
public class Hobbit extends Hero{
    public Hobbit(String name){
        super(200, name, 50);
    }
    public static void saludar(){
        for(int i=0;i<=1;i++){
            System.out.println("Hola soy un hobbit y mi nombre es: "+CreateCharacters.hobbit[i].getName());
        }
    }
}