/**
 * The team class represents a team of three members, including details about
 * their participation in two competitions.
 *
 * @author Maksim Petrosyan
 * */
public class Team {
    private String teamName;
    private String name1;
    private String name2;
    private String name3;
    Competition competition1;
    Competition competition2;

    /**
     * Constructs a new Team object with the specified team name, team members names, and competition information
     *
     * @param teamName The name of the team
     * @param name1 The name of the first team member
     * @param name2 The name of the second team member
     * @param name3 The name of the third team member
     * @param competition1 The information about the first competition
     * @param competition2 The inforamation about the second competition
     * */
    public Team(String teamName, String name1, String name2, String name3,
                Competition competition1, Competition competition2){
        this.teamName = teamName;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.competition1 = new Competition(competition1);
        this.competition2 = new Competition(competition2);
    }

    /**
     * A copy constructor for Team object
     * @param team1 Team to copy
     * */
    public Team(Team team1){
        this.teamName = team1.getTeamName();
        this.name1 = team1.getName1();
        this.name2 = team1.getName2();
        this.name3 = team1.getName3();
        this.competition1 = new Competition(team1.getCompetition1());
        this.competition2 = new Competition(team1.getCompetition2());
    }

    /**
     * Sets the team name
     *
     * @param teamName the name of the team
     * */
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    /**
     * Gets the team name
     *
     * @return The name of the team name
     * */
    public String getTeamName(){
        return teamName;
    }

    /**
     * Sets the first member's name
     *
     * @param name1 the first member's name
     * */
    public void setName1(String name1){
        this.name1 = name1;
    }

    /**
     * Gets the first member's name
     *
     * @return the first member's name
     * */
    public String getName1(){
        return name1;
    }

    /**
     * Sets the second member's name
     *
     * @param name2 the second member's name
     * */
    public void setName2(String name2){
        this.name2 = name2;
    }

    /**
     * Gets the second member's name
     *
     * @return the second member's name
     * */
    public String getName2(){
        return name2;
    }

    /**
     * Sets the name for the third member
     *
     * @param name3 the name for the third member
     * */
    public void setName3(String name3){
        this.name3 = name3;
    }

    /**
     * Gets the name for the third member
     *
     * @return the name for the third member
     * */
    public String getName3(){
        return name3;
    }

    /**
     * Gets the competition information for the first competition
     *
     * @return the first competition
     * */
    public Competition getCompetition1(){
        return new Competition(this.competition1);
    }

    /**
     * Sets the competition information for the first competition
     *
     * @param competition1 the first competition
     * */
    public void setCompetition1(Competition competition1){
        this.competition1 = new Competition(competition1);
    }

    /**
     * Gets the competition information for the second competition
     *
     * @return the second competition
     * */
    public Competition getCompetition2(){
        return new Competition(this.competition2);
    }

    /**
     * Sets the competition information for the second competition
     *
     * @param competition2 the second competition
     * */
    public void setCompetition2(Competition competition2){
        this.competition2 = new Competition(competition2);
    }

    /**
     * Returns a string representation of the Team object
     *
     * @return a string representation of the Team object
     * */
    public String toString(){
        return "Team name: " + this.teamName +
                "\nTeam members: " + this.name1 + ", " + this.name2 + ", " + this.name3 +
                "\nCompetitions: " + this.competition1.getCompetitionName() + ", " + this.competition2.getCompetitionName();
    }
}
