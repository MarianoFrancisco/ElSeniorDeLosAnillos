import java.util.Scanner;
public class PlayArmy {
    static Scanner input = new Scanner(System.in);
    static int counterBeast=0;
    static int counterHero=0;
    public void playArmy(){       
        CreateCharacters character = new CreateCharacters();
        character.createBeast();
        character.createHero();
        //saludos para que al ver su nombre se sabra el tipo de heroe o bestia que pelea
        System.out.println("\nLos heroes son: \n");
        Human.saludar();
        Elf.saludar();
        Hobbit.saludar();
        System.out.println("\nLas bestias son\n");
        Orco.saludar();
        Trasgo.saludar();
        int optionReturn =0;
        int option = 0;
        while (option!=2){
            System.out.println("\nIngrese un valor\n"
            +"1) Jugar simulacion\n"
            +"2) Salir");
            option = input.nextInt();
            if (option ==1){
                for (int i=0;i<5; i++){
                    CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()+CreateCharacters.selectionHero[i].getArmor());
                    CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()+CreateCharacters.selectionBeast[i].getArmor());
                    int turno = 0;
                    switch(i){
                        case 0:
                            CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()-5);
                            option=0;
                            while(optionReturn!=1){
                                optionReturn=1;
                                System.out.println("Ingrese 1 para jugar el turno");
                                option = input.nextInt();
                                turno=turno+1;
                                if(option==1){
                                    if(CreateCharacters.selectionHero[i].getLife()>0){
                                        System.out.println("Turno "+turno+" Lucha entre: \n"
                                            + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                            + ", Bestia"+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                        Dice.dice(100,2);
                                        CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()-Dice.maximDice);
                                        System.out.println("Fin de pelea: \n"
                                            + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                            + ", Bestia"+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                        if(CreateCharacters.selectionBeast[i].getLife()>0){  
                                            option=0;
                                            while(option!=1){
                                                System.out.println("Ingrese 1 para jugar el turno");
                                                option=0;
                                                option = input.nextInt();
                                                turno=turno+1;
                                                if(option==1){
                                                    System.out.println("Turno "+turno+" Lucha entre: \n"
                                                        + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                                        + ", Bestia"+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                                    Dice.dice(90,1);
                                                    CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()-Dice.maximDice);
                                                    System.out.println("Fin de pelea: \n"
                                                        + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                                        + ", Bestia"+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                                        optionReturn=2;
                                                }
                                                else{
                                                    System.out.println("Ingresa un numero valido");
                                                } 
                                            }              
                                        }
                                        else{
                                            System.out.println("El ganador es: "+CreateCharacters.selectionHero[i].getName());
                                            counterBeast=(counterHero+1);
                                            CreateCharacters.winnerCharacter[0]=CreateCharacters.selectionHero[i];                                           
                                        }
                                        
                                    }
                                    else{
                                        System.out.println("El ganador es: "+CreateCharacters.selectionBeast[i].getName());
                                        counterBeast=(counterBeast+1);
                                        CreateCharacters.winnerCharacter[0]=CreateCharacters.selectionBeast[i];
                                    }
                                }
                                else{ 
                                    System.out.println("Ingresa un numero valido");
                                }  
                            }
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
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
/*                Dice.dice(90,1);
                System.out.println("sd"+ Dice.maximDice);
                Dice.dice(100,2);
                System.out.println("sd"+ Dice.maximDice);
*/
