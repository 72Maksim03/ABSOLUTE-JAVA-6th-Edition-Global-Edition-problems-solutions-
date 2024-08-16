public class Species {
    private String name;
    private int population;
    private double growthRate;

    public Species(String name, int population, double growthRate){
        this.setName(name);
        this.setPopulation(population);
        this.setGrowthRate(growthRate);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPopulation(int population){
        if(population >= 0){
            this.population = population;
        } else{
            System.out.println("Population can not be negative");
            System.exit(0);
        }
    }

    public void setGrowthRate(double growthRate){
        this.growthRate = growthRate;
    }

    public String getName(){
        return this.name;
    }

    public int getPopulation(){
        return this.population;
    }

    public double getGrowthRate(){
        return this.growthRate;
    }

    public String toString(){
        return "Name: " + this.name + "\n" + "Population: " + this.population +
                "\n" + "Growth rate: " + this.growthRate + "%";
    }

    public boolean equals(Species other){
        return (this.name.equals(other.name)
                && this.population == other.population
                && this.growthRate == other.growthRate);
    }

    public boolean endangered(){
        return this.growthRate < 0;
    }
}