public class OgreAlien extends Alien{
    private static final int DAMAGE = 6;

    public OgreAlien(int health, String name){super(health, name);}

    public int getDamage(){return DAMAGE;}
}
