/**
 * The Competition class represents competition with information about its name,
 * winner team, runner-up team and the year it was held
 *
 * @author Maksim Petrosyan
 * */
public class Competition {
    private String competitionName;
    private String winningTeam;
    private String runnerUp;
    private int year;

    /**
     * Constructor for Competition class
     * @param competitionName The name of competition
     * @param winningTeam The name of winning team
     * @param runnerUp The name of runner-up team
     * @param year The year competition was held
     * */
    public Competition(String competitionName, String winningTeam, String runnerUp, int year){
        this.competitionName = competitionName;
        this.winningTeam = winningTeam;
        this.runnerUp = runnerUp;
        this.year = year;
    }

    /**
     * Copy constructor for competition class
     * @param competition1 the competition class to copy
     * */
    public Competition(Competition competition1){
        this.competitionName = competition1.getCompetitionName();
        this.winningTeam = competition1.getWinningTeam();
        this.runnerUp = competition1.getRunnerUp();
        this.year = competition1.getYear();
    }

    /**
     * Sets new name for competition
     * @param competitionName The name of competition
     * */
    public void setCompetitionName(String competitionName){
        this.competitionName = competitionName;
    }

    /**
     * Gets the competition name
     *
     * @return the name of competition
     * */
    public String getCompetitionName(){
        return this.competitionName;
    }

    /**
     * Sets the name of winning team
     * @param winningTeam the name of winning name
     * */
    public void setWinningTeam(String winningTeam){
        this.winningTeam = winningTeam;
    }

    /**
     * Gets the name of winning team
     * @return The name of winning team
     * */
    public String getWinningTeam(){
        return this.winningTeam;
    }

    /**
     * Sets the name of runner-up
     * @param runnerUp the name of runner-up
     * */
    public void setRunnerUp(String runnerUp){
        this.runnerUp = runnerUp;
    }

    /**
     * Gets the name of runner-up
     * @return the name of runner-up
     * */
    public String getRunnerUp(){
        return this.runnerUp;
    }

    /**
     * Sets the year of competition
     * @param year the year of competition
     * */
    public void setYear(int year){
        this.year = year;
    }

    /**
     * Gets the year competition was held
     * @return The year competition was held
     * */
    public int getYear(){
        return this.year;
    }

    /**
     * Returns the string representation of the competition
     *
     * @return A string representation of the competition
     * */
    public String toString(){
        return "Competition Name: " + this.competitionName +
                "\nWinning Team: " + this.winningTeam +
                "\nRunner Up: " + this.runnerUp +
                "\nyear: " + this.year;
    }
}
