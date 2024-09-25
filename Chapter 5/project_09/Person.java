/**
 * Class for a person with a name and dates for birth and death.
 * Class invariant: A Person always has a date of birth, and if the Person
 * has a date of death, then the date of death is equal to or later than the
 * date of birth.
 *
 * @author Maksim Petrosyan
 * @version 1.0
 */
import java.util.Date;
public class Person {
    private String name;
    private Date born;
    private Date died; //null indicates still alive.

    /**
     * Constructs a Person object with specified name, birthday and deathDate dates
     *
     * @param initialName name of the person
     * @param birthDate Birthday of the person
     * @param deathDate Death date of the person
     * */
    public Person(String initialName, Date birthDate, Date deathDate) {
        if (consistent(birthDate, deathDate)){
            name = initialName;
            born = new Date(birthDate);
            if (deathDate == null)
                died = null;
            else
                died = new Date(deathDate);
        } else {
            System.out.println("Inconsistent dates.Aborting.");
            System.exit(0);
        }
    }

    /**
     * Copy constructor that creates a copy of the given object
     *
     * @param original Original object to copy
     * */
    public Person(Person original) {
        if (original == null ) {
            System.out.println("Fatal error.");
            System.exit(0);
        }
        name = original.name;
        born = new Date(original.born);
        if (original.died == null)
            died = null;
        else
            died = new Date(original.died);
    }

    /**
     * Sets specified name, birthday and death date
     *
     * @param newName New name to set
     * @param birthDate birthDay to set
     * @param deathDate Death date to set
     * */
    public void set(String newName, Date birthDate, Date deathDate){
        this.name = newName;
        this.born = birthDate;
        this.died = deathDate;
    }

    /**
     * Gets the string representation of the object
     *
     * @return The string representation of the objecr
     * */
    public String toString() {
        String diedString;
        if (died == null)
            diedString = ""; //Empty string
        else
            diedString = died.toString();
        return (name + ", " + born + "-" + diedString);
    }

    /**
     * Checks if two objects are equal or not. Objects are equal, if two objects have same names,
     * same born and death dates
     *
     * @param otherPerson The object to compare with this object
     * @return true, if objects are equal, false, if they are not
     * */
    public boolean equals(Person otherPerson) {
        if (otherPerson == null)
            return false;
        else
            return (name.equals(otherPerson.name)
                    && born.equals(otherPerson.born)
                    && datesMatch(died, otherPerson.died) );
        }
/**
 * To match, date1 and date2 either must be the same date or must both be null.
 */
    private static boolean datesMatch(Date date1, Date date2) {
        if (date1 == null)
            return (date2 == null);
        else if (date2 == null) //&& date1 != null
            return false ;
        else //Both dates are not null.
            return (date1.equals(date2));
        }
/**
 * Precondition: newDate is a consistent date of birth.
 * Postcondition: Date of birth of the calling object is newDate.
 */
    public void setBirthDate(Date newDate) {
        if (consistent(newDate, died))
            born = new Date(newDate);
        else{
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }
/**
 * Precondition: newDate is a consistent date of death.
 * Postcondition: Date of death of the calling object is newDate.
 */
    public void setDeathDate(Date newDate) {
        if (!consistent(born, newDate)){
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
        if (newDate == null)
            died = null ;
        else
            died = new Date(newDate);
        }
    public void setName(String newName) {
        name = newName;
    }
/**
 * Precondition: The date of birth has been set, and changing the year
 * part of the date of birth will give a consistent date of birth.
 * Postcondition: The year of birth is (changed to) newYear.
 */
    public void setBirthYear(int newYear) {
        if (born == null){
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }
        born.setYear(newYear);
        if (!consistent(born, died)) {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }
/**
 * Precondition: The date of death has been set, and changing the year
 * part of the date of death will give a consistent date of death.
 * Postcondition: The year of death is (changed to) newYear.
 */
    public void setDeathYear(int newYear) {
        if (died == null){
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }
        died.setYear(newYear);
        if (!consistent(born, died)) {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }
    public String getName() {
        return name;
    }
    public Date getBirthDate() {
        return new Date(born);
    }
    public Date getDeathDate() {
        if (died == null)
            return null;
        else
            return new Date(died);
    }
/**
 * To be consistent, birthDate must not be null. If there is no date of
 * death (deathDate == null), that is consistent with any birthDate.
 * Otherwise, the birthDate must come before or be equal to the deathDate.
 */
    private static boolean consistent(Date birthDate, Date deathDate) {
        if (birthDate == null)
            return false;
        else if (deathDate == null)
            return true;
        else
            return (birthDate.precedes(deathDate)
                    || birthDate.equals(deathDate));
    }
}