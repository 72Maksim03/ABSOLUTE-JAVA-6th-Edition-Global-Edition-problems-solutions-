import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private Date born;
    private Date died;

    public Person(String initialName, Date birthDate, Date deathDate) {
        if (consistent(birthDate, deathDate)) {
            name = initialName;
            born = new Date(birthDate);
            died = (deathDate == null) ? null : new Date(deathDate);
        } else {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    public Person(Person original) {
        if (original == null) {
            System.out.println("Fatal error.");
            System.exit(0);
        }
        name = original.name;
        born = new Date(original.born);
        died = (original.died == null) ? null : new Date(original.died);
    }

    public void set(String newName, Date birthDate, Date deathDate) {
        if (consistent(birthDate, deathDate)) {
            name = newName;
            born = new Date(birthDate);
            died = (deathDate == null) ? null : new Date(deathDate);
        } else {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    public String toString() {
        String diedString = (died == null) ? "" : died.toString();
        return name + ", " + born + "-" + diedString;
    }

    public boolean equals(Person otherPerson) {
        if (otherPerson == null) return false;
        return name.equals(otherPerson.name) && born.equals(otherPerson.born) && datesMatch(died, otherPerson.died);
    }

    private static boolean datesMatch(Date date1, Date date2) {
        if (date1 == null) return date2 == null;
        if (date2 == null) return false;
        return date1.equals(date2);
    }

    public void setBirthDate(Date newDate) {
        if (consistent(newDate, died)) {
            born = new Date(newDate);
        } else {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    public void setDeathDate(Date newDate) {
        if (!consistent(born, newDate)) {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
        died = (newDate == null) ? null : new Date(newDate);
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setBirthYear(int newYear) {
        if (born == null) {
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }
        born.setYear(newYear);
        if (!consistent(born, died)) {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    public void setDeathYear(int newYear) {
        if (died == null) {
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
        return (died == null) ? null : new Date(died);
    }

    private static boolean consistent(Date birthDate, Date deathDate) {
        if (birthDate == null) return false;
        if (deathDate == null) return true;
        return birthDate.precedes(deathDate) || birthDate.equals(deathDate);
    }

    public int getAge(Date curentDate){
        if (died == null){
            if (curentDate.getYear() < born.getYear()) return 0;
            else{
                int age = curentDate.getYear() - born.getYear();
                if (curentDate.getMonth() < born.getMonth() || (curentDate.getMonth() == born.getMonth() && curentDate.getDay() < born.getDay())) age--;
                return age;
            }
        } else {
            int age = died.getYear() - born.getYear();
            if (died.getMonth() < born.getMonth() || (died.getMonth() == born.getMonth() && died.getDay() < born.getDay())) age--;
            return age;
        }
    }
}
