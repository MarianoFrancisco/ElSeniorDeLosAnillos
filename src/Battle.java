import java.util.Scanner;
public class Battle {
    static Scanner input = new Scanner(System.in);
    static int counterBeast;
    static int counterHero;
    static int optionReturn;
    static int option;
    static int i;
    public void humanVsOrco(){ 
        optionReturn =0;
        option = 0;
        i=0;
        CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()+CreateCharacters.selectionHero[i].getArmor());
        CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()+CreateCharacters.selectionBeast[i].getArmor());
        int turno = 0;
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
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                    Dice.dice(100,2);
                    CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()-Dice.maximDice);
                    System.out.println("Fin de pelea: \n"
                                    + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
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
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                Dice.dice(90,1);
                                CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()-Dice.maximDice);
                                System.out.println("Fin de pelea: \n"
                                                + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                optionReturn=2;
                            }
                            else{
                                System.out.println("Ingresa un numero valido");
                            } 
                        }              
                    }
                    else{
                        System.out.println("El ganador es: "+CreateCharacters.selectionHero[i].getName());
                        counterHero=(counterHero+1);
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
    }
    public void humanVsTrasgo(){ 
        optionReturn =0;
        option = 0;
        i=1;
        CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()+CreateCharacters.selectionHero[i].getArmor());
        CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()+CreateCharacters.selectionBeast[i].getArmor());
        int turno = 0;
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
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                    Dice.dice(100,2);
                    CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()-Dice.maximDice);
                    System.out.println("Fin de pelea: \n"
                                    + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
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
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                Dice.dice(90,1);
                                CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()-Dice.maximDice);
                                System.out.println("Fin de pelea: \n"
                                                + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                optionReturn=2;
                            }
                            else{
                                System.out.println("Ingresa un numero valido");
                            } 
                        }              
                    }
                    else{
                        System.out.println("El ganador es: "+CreateCharacters.selectionHero[i].getName());
                        counterHero=(counterHero+1);
                        CreateCharacters.winnerCharacter[1]=CreateCharacters.selectionHero[i];                                          
                    }
                                
                }
                else{
                    System.out.println("El ganador es: "+CreateCharacters.selectionBeast[i].getName());
                    counterBeast=(counterBeast+1);
                    CreateCharacters.winnerCharacter[1]=CreateCharacters.selectionBeast[i];
                }
            }
            else{ 
                System.out.println("Ingresa un numero valido");
            }  
        }
    }
    public void elfVsOrco(){ 
        optionReturn =0;
        option = 0;
        i=2;
        CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()+CreateCharacters.selectionHero[i].getArmor());
        CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()+CreateCharacters.selectionBeast[i].getArmor());
        int turno = 0;
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
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                    Dice.dice(100,2);
                    CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()-(Dice.maximDice+10));
                    System.out.println("Fin de pelea: \n"
                                    + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
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
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                Dice.dice(90,1);
                                CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()-Dice.maximDice);
                                System.out.println("Fin de pelea: \n"
                                                + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                optionReturn=2;
                            }
                            else{
                                System.out.println("Ingresa un numero valido");
                            } 
                        }              
                    }
                    else{
                        System.out.println("El ganador es: "+CreateCharacters.selectionHero[i].getName());
                        counterHero=(counterHero+1);
                        CreateCharacters.winnerCharacter[2]=CreateCharacters.selectionHero[i];                                          
                    }
                                
                }
                else{
                    System.out.println("El ganador es: "+CreateCharacters.selectionBeast[i].getName());
                    counterBeast=(counterBeast+1);
                    CreateCharacters.winnerCharacter[2]=CreateCharacters.selectionBeast[i];
                }
            }
            else{ 
                System.out.println("Ingresa un numero valido");
            }

        }  
    }
    public void elfVsTrasgo(){ 
        optionReturn =0;
        option = 0;
        i=3;
        CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()+CreateCharacters.selectionHero[i].getArmor());
        CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()+CreateCharacters.selectionBeast[i].getArmor());
        int turno = 0;
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
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                    Dice.dice(100,2);
                    CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()-Dice.maximDice);
                    System.out.println("Fin de pelea: \n"
                                    + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
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
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                Dice.dice(90,1);
                                CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()-Dice.maximDice);
                                System.out.println("Fin de pelea: \n"
                                                + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                optionReturn=2;
                            }
                            else{
                                System.out.println("Ingresa un numero valido");
                            } 
                        }              
                    }
                    else{
                        System.out.println("El ganador es: "+CreateCharacters.selectionHero[i].getName());
                        counterHero=(counterHero+1);
                        CreateCharacters.winnerCharacter[3]=CreateCharacters.selectionHero[i];                                          
                    }
                                
                }
                else{
                    System.out.println("El ganador es: "+CreateCharacters.selectionBeast[i].getName());
                    counterBeast=(counterBeast+1);
                    CreateCharacters.winnerCharacter[3]=CreateCharacters.selectionBeast[i];
                }
            }
            else{ 
                System.out.println("Ingresa un numero valido");
            } 

        } 
    }
    public void hobbitVsOrco(){ 
        optionReturn =0;
        option = 0;
        i=4;
        CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()+CreateCharacters.selectionHero[i].getArmor());
        CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()+CreateCharacters.selectionBeast[i].getArmor());
        int turno = 0;
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
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                    Dice.dice(100,2);
                    CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()-Dice.maximDice);
                    System.out.println("Fin de pelea: \n"
                                    + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
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
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                Dice.dice(90,1);
                                CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()-Dice.maximDice);
                                System.out.println("Fin de pelea: \n"
                                                + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                optionReturn=2;
                            }
                            else{
                                System.out.println("Ingresa un numero valido");
                            } 
                        }              
                    }
                    else{
                        System.out.println("El ganador es: "+CreateCharacters.selectionHero[i].getName());
                        counterHero=(counterHero+1);
                        CreateCharacters.winnerCharacter[4]=CreateCharacters.selectionHero[i];                                          
                    }
                                
                }
                else{
                    System.out.println("El ganador es: "+CreateCharacters.selectionBeast[i].getName());
                    counterBeast=(counterBeast+1);
                    CreateCharacters.winnerCharacter[4]=CreateCharacters.selectionBeast[i];
                }
            }
            else{ 
                System.out.println("Ingresa un numero valido");
            }

        }  
    }
    public void hobbitVsTrasgo(){ 
        optionReturn =0;
        option = 0;
        i=5;
        CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()+CreateCharacters.selectionHero[i].getArmor());
        CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()+CreateCharacters.selectionBeast[i].getArmor());
        int turno = 0;
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
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                    Dice.dice(100,2);
                    CreateCharacters.selectionBeast[i].setLife(CreateCharacters.selectionBeast[i].getLife()-(Dice.maximDice-5));
                    System.out.println("Fin de pelea: \n"
                                    + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                    + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
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
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                Dice.dice(90,1);
                                CreateCharacters.selectionHero[i].setLife(CreateCharacters.selectionHero[i].getLife()-Dice.maximDice);
                                System.out.println("Fin de pelea: \n"
                                                + "Heroe "+CreateCharacters.selectionHero[i].getName()+" (Vida: "+CreateCharacters.selectionHero[i].getLife()+")"
                                                + ", Bestia "+CreateCharacters.selectionBeast[i].getName()+" (Vida: "+CreateCharacters.selectionBeast[i].getLife()+")");
                                optionReturn=2;
                            }
                            else{
                                System.out.println("Ingresa un numero valido");
                            } 
                        }              
                    }
                    else{
                        System.out.println("El ganador es: "+CreateCharacters.selectionHero[i].getName());
                        counterHero=(counterHero+1);
                        CreateCharacters.winnerCharacter[5]=CreateCharacters.selectionHero[i];                                          
                    }
                                
                }
                else{
                    System.out.println("El ganador es: "+CreateCharacters.selectionBeast[i].getName());
                    counterBeast=(counterBeast+1);
                    CreateCharacters.winnerCharacter[5]=CreateCharacters.selectionBeast[i];
                }
            }
            else{ 
                System.out.println("Ingresa un numero valido");
            }  
        }
      
    }
    public void armyWinner(){
        System.out.println("Bestias tienen: \n"
        + counterBeast+" Ganadores\n"
        + "Heroes tienen: \n"
        + counterHero+" Ganadores\n"
        + "Ganadores en cada batalla son: \n");
        for (int k=0;k<=5;k++){
            System.out.println("nombre "+CreateCharacters.winnerCharacter[k].getName());
        }
        if(counterBeast>counterHero){
            System.out.println("\nEsta simulacion la ganaron las bestias");
        }
        else{
            System.out.println("\nEsta simulacion la ganaron los heroes");
        }
    }
}
