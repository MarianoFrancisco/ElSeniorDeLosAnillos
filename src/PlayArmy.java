import java.util.Scanner;
public class PlayArmy {
    static Scanner input = new Scanner(System.in);
    static int helloXD=0;
    public void playArmy(){       
        Battle battle = new Battle();
        //saludos para que al ver su nombre se sabra el tipo de heroe o bestia que pelea
        System.out.println("\nLos heroes son: \n");
        Human.saludar();
        Elf.saludar();
        Hobbit.saludar();
        System.out.println("\nLas bestias son\n");
        Orco.saludar();
        Trasgo.saludar();
        int option=0;
        while (option!=2){
            System.out.println("\nIngrese un valor\n"
            +"1) Jugar simulacion\n"
            +"2) Salir\n"
            + "Nota: Si la simulacion fue efectuada elige la opcion salir\n"
            + "Si gustas otra simulacion aca te esperamos");
            option = input.nextInt();
            if (option ==1){
                if(helloXD==2){ 
                    System.out.println("Ya corriste la simulacion");
                }
                else{
                    helloXD=2; 
                    battle.humanVsOrco();
                    battle.humanVsTrasgo();
                    battle.elfVsOrco();
                    battle.elfVsTrasgo();
                    battle.hobbitVsOrco();
                    battle.hobbitVsTrasgo();
                    battle.armyWinner();          
                }              
            }                                      
            else if(option ==2){
                System.out.println("Nos vemos");
                System.exit(0);
            }
            else{
                System.out.println("Ingrese un numero valido");
            }
        }
        
    }
    
}
