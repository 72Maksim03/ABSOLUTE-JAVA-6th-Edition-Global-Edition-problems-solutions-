public class AlienPack {
    private Alien[] aliens;
    private int currentNumOfAliens;

    public AlienPack(int size){
        aliens = new Alien[size];
        currentNumOfAliens = 0;
    }

    public void addAlien(Alien alien, int index){
        if (index < 0 || index > aliens.length - 1){
            System.out.println("Invalid index");
            System.exit(0);
        }
        aliens[index] = alien;
    }
    public void addAlien(Alien alien){
        while (currentNumOfAliens < aliens.length){
            if (aliens[currentNumOfAliens] == null){
                addAlien(alien, currentNumOfAliens);
                currentNumOfAliens++;
                return;
            }
            currentNumOfAliens++;
        }
        System.out.println("No more space to add aliens");
    }

    public Alien[] getAliens(){return aliens;}

    public int calculateDamage(){
        int damage = 0;
        for (int i = 0; i < aliens.length; i++)
            if (aliens[i] != null) damage += aliens[i].getDamage();

        return damage;
    }
}
