//Attribute
public class character {
    private String name; //Serana, the daughter of ColdHarbour Family
    private int HP; //Health Points
    private int XP; //Experience Points
    private int MP; //Mana Points
    private String items; //Character items

    //Constructor
    public character(String name, int health, int XP, int Mana) {
        this.name = name;
        this.HP = HP;
        this.XP = 0;
        this.MP = MP;
        this.items = "";
    }
    //Method Taking damage
    public void takeDamage(int damage){
        if (isDead()) {
            System.out.println(this.name + "Life is Over when you're stop trying.");
            return; //Character Dies cannot continue
        }

        this.HP -= damage;
        if (this.HP < 0) {
            this.HP = 0; //No less than 0
        }
    }
    //Method for adding XP
    public void addXP(int additionalXP) {
        this.XP += additionalXP;
    }

    //Method for getting character name
    public String getName() {
        return this.name;
    }

    //Method for getting character HP
    public int getHP() {
        return this.HP;
    }

    //Method for getting character XP
    public int getXP() {
        return this.XP;
    }

    //Method for getting character MP
    public int getMP() {
        return this.MP;
    }

    //Method for getting character items
    public String getItems() {
        return this.items;
    }

    //Method for using character MP
    public void useMP(int amount) {
        if (this.MP >= amount) {
            this.MP -= amount;
        } else {
            System.out.println("Not enough MP!");
        }
    }

    //Method for restoring character MP (when character sleeping or using mana potions)
    public void restoreMP(int amount) {
        this.MP += amount;
    }

    //Method for when character dies
    public boolean isDead() {
        return this.HP <= 0;
    }
    // Method for recovering HP
    public void restoreHealth(int amount) {
        if (isDead()) {
            System.out.println(this.name + " sudah mati dan tidak bisa dipulihkan.");
        } else {
            this.HP += amount;
            if (this.HP > 100) { // To make HP not over 100
                this.HP = 100;
            }
        }
    }
}