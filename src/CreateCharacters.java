/**
 * CreateCharacters
 */
public class CreateCharacters {
    static Human human[] = new Human[2];
    static Elf elf[] = new Elf[2];
    static Hobbit hobbit[] = new Hobbit[2];
    static Orco orco[] = new Orco[3];
    static Trasgo trasgo[] = new Trasgo[3];
    static Hero selectionHero[] = new Hero[6];
    static Beast selectionBeast[] = new Beast[6];
    static Character winnerCharacter[] = new Character[6];
    public void createHero(){
         human[0] = new Human("Akihiro");
         human[1] = new Human("Tatzumy");
         elf[0] = new Elf("Hayate");
         elf[1] = new Elf("Katsu");
         hobbit[0] = new Hobbit("Kuro");
         hobbit[1] = new Hobbit("Masaki");
         selectionHero[0]=human[0];
         selectionHero[1]=human[1];
         selectionHero[2]=elf[0];
         selectionHero[3]=elf[1];
         selectionHero[4]=hobbit[0];
         selectionHero[5]=hobbit[1];
    }
    public void createBeast(){
        orco[0] = new Orco("Nobu");
        orco[1] = new Orco("Naoki");
        orco[2] = new Orco("Nori");
        trasgo[0] = new Trasgo("Satoshi");
        trasgo[1] = new Trasgo("Seiji");
        trasgo[2] = new Trasgo("Katsuma");
        selectionBeast[0]=orco[0];
        selectionBeast[1]=trasgo[0];
        selectionBeast[2]=orco[1];
        selectionBeast[3]=trasgo[1];
        selectionBeast[4]=orco[2];
        selectionBeast[5]=trasgo[2];
   }
}