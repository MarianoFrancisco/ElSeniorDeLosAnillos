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
            +"3) Instrucciones\n"
            + "Nota: Si la simulacion fue efectuada elige la opcion salir\n"
            + "Si gustas otra simulacion aca te esperamos");
            option = input.nextInt();
            if (option ==1){
                if(helloXD==2){ 
                    System.out.println("Ya corriste la simulacion");
                }
                else{
                    helloXD=2; 
                    System.out.println("\nPrimera pelea\n");
                    battle.humanVsOrco();
                    System.out.println("\nSegunda pelea\n");
                    battle.humanVsTrasgo();
                    System.out.println("\nTercera pelea\n");
                    battle.elfVsOrco();
                    System.out.println("\nCuarta pelea\n");
                    battle.elfVsTrasgo();
                    System.out.println("\nQuinta pelea\n");
                    battle.hobbitVsOrco();
                    System.out.println("\nSexta pelea\n");
                    battle.hobbitVsTrasgo();
                    System.out.println("\nResultados de la simulacion\n");
                    battle.armyWinner();          
                }              
            }                                      
            else if(option ==2){
                System.out.println("Nos vemos");
                System.exit(0);
            }
            else if(option ==3){
                System.out.println("En este simulador la armadura de los personajes aplicada es de 50, se sumara a la vida, y tenemos a:\n"
                +"Heroes que se clasifican en 3: Elfos vida =250, Hobbits vida =200, Humanos vida =180\n"
                +"Bestias que se clasifican en 2: Orcos vida =300, Trasgos vida = 325\n"
                +"Cabe destacar que los Heroes tienen dos tiradas de dados, el mayor seráa el ataque que obtendrá con maximo 100\n"
                +"No obstante las bestias solo tendrán un dado para obtener el ataque con maximo 90, y claro unos detallitos\n"
                +"Elfos odian a Orcos, por ello obtienen bonus +10 de ataque contra Orcos\n"
                +"Hobbits temen a Trasgos, bonus -5 de ataque contra Trasgos"
                +"Orcos tienen mucha fuerza, bonus -10% de armadura para contricante");
            }
            else{
                System.out.println("Ingrese un numero valido");
            }
        }
        
    }
    
}
