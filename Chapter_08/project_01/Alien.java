public abstract class Alien {
    private int health;
    private String name;

    public Alien(int health, String name){
        if (health < 0 || health > 100){
            System.out.println("Invalid health");
            System.exit(0);
        }
        this.health = health;
        this.name = name;
    }

    public int getHealth(){return health;}
    public String getName(){return name;}

    public abstract int getDamage();
}