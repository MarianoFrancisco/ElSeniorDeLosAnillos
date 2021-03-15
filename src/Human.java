/**
 * Human
 */
public class Human extends Hero{

    public Human(String name){
        super(180, name, 50);
    }
    public static void saludar(){
        for(int i=0;i<=1;i++){
            System.out.println("Hola soy un humano y mi nombre es: "+CreateCharacters.human[i].getName());
        }
    }
}