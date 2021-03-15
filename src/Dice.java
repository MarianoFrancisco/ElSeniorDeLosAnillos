public class Dice {
    static int maximDice=0;   
    public static void dice(int valorAtack,int amountDice){
        if(amountDice==1){
            int aleatoryDice1 = (int)(Math.random()*valorAtack);
            maximDice=aleatoryDice1;
            System.out.println("Se jugo el dado, el numero obtenido es\n"
            +"Dado unico: "+maximDice);
        }
        else{
            int aleatoryDice1 = (int)(Math.random()*valorAtack);
            int aleatoryDice2 = (int)(Math.random()*valorAtack);
            if(aleatoryDice1>aleatoryDice2){
                maximDice=aleatoryDice1;
            }
            else{
                maximDice=aleatoryDice2;
            }
            System.out.println("Se jugaron los dados, los numeros obtenidos son\n"
                +"Dado 1: "+aleatoryDice1
                +"\nDado 2: "+aleatoryDice2
                +"\nEl numero mayor sacado es"+ maximDice);
        }
        
    }
    
}
