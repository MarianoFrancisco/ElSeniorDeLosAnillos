/**
 * CreateCharacters
 */
public class CreateCharacters {

    static Human human[] = new Human[5];
    static Elf elf[] = new Elf[5];
    static Hobbit hobbit[] = new Hobbit[5];
    static Orco orco[] = new Orco[7];
    static Trasgo trasgo[] = new Trasgo[7];
    public void createHero(){
         human[0] = new Human("Akihiro");
         human[1] = new Human("Akio");
         human[2] = new Human("Tatzumy");
         human[3] = new Human("Haruki");
         human[4] = new Human("Haruto");
         elf[0] = new Elf("Hayate");
         elf[1] = new Elf("Katsu");
         elf[2] = new Elf("Hideyoshi");
         elf[3] = new Elf("Itsuky");
         elf[4] = new Elf("Kichiro");
         hobbit[0] = new Hobbit("Kuro");
         hobbit[1] = new Hobbit("Masaki");
         hobbit[2] = new Hobbit("Hiroshi");
         hobbit[3] = new Hobbit("Kentao");
         hobbit[4] = new Hobbit("Hibiki");
    }
    public void createBeast(){
        orco[0] = new Orco("Nobu");
        orco[1] = new Orco("Naoki");
        orco[2] = new Orco("Nori");
        orco[3] = new Orco("Riku");
        orco[4] = new Orco("Ryo");
        orco[5] = new Orco("Ryota");
        orco[6] = new Orco("Saburo");
        trasgo[0] = new Trasgo("Satoshi");
        trasgo[1] = new Trasgo("Seiji");
        trasgo[2] = new Trasgo("Katsuma");
        trasgo[3] = new Trasgo("Shigeru");
        trasgo[4] = new Trasgo("Taiki");
        trasgo[5] = new Trasgo("Taro");
        trasgo[6] = new Trasgo("Toshi");
   }
}