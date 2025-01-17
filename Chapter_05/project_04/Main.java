/**
 * You are interested in keeping track of the team members and competition information for your school’s annual entries in computer science programming competitions. Each team consists of exactly four team members. Every year your team
 * competes in two competitions. As an initial start for your database, create a class
 * named Team that has the following instance variables:
 *  // Name for the team
 *  String teamName;
 *  // Names for each team members.
 *  String name1, name2, name3, name4;
 *  // Info on each competition
 *  Competition competition1, competition2;
 *  Note that there is a much better way to represent the team members and competitions using arrays; this is covered in a subsequent chapter. The class should also
 * have a method that outputs the names of all team members and the competition
 * information to the console.
 *  The Competition class contains variables to track the following:
 *  String: Name of the competition, Name of the winning team, Name of the runner-up
 *  Integer: Year of the competition
 *  Implement the Team and Competition classes with appropriate constructor, accessor,
 * and mutator methods. In entering data for past competitions, you note that an entry
 * is usually very similar to the previous year’s entry. To help with the data entry, create
 * a deep copy constructor for the Team class. Test your copy constructor by creating a
 * copy of an existing team object, changing the competition information for the copy,
 * and outputting the data for the original and the copy. The original object should be
 * unchanged if your deep copy constructor is working properly
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Competition competition1 = new Competition("Name1", "Team1", "RunnerUp1", 2024);
        Competition competition2 = new Competition("Name2", "Team2", "RunnerUp2", 2023);
        Team team1 = new Team("Team1", "Name1", "Name2", "Name3", competition1, competition2);
        System.out.println(team1);
    }
}
