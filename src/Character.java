public class Character{
    protected boolean beast;//true if is beast, false if is hero
    protected int life;
    protected String name;
    protected int armor;
    protected int atack;

    public Character(boolean beast, int life, String name, int armor, int atack){//create a builder for character
       this.beast = beast;
       this.life = life;
       this.name = name;
       this.armor = armor;
       this.atack = atack;
    }
    public boolean getBeast(){
        return this.beast;
    }
    public int getLife(){
        return this.life;
    }
    public void setLife(int life){
        this.life=life;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getArmor(){
        return this.armor;
    }
    public void setArmor(int armor){
        this.armor=armor;
    }
    public int getAtack(){
        return this.atack;
    }
    public void setAtack(int atack){
        this.atack=atack;
    }
        
}