import java.util.Scanner;

public class DateFormatter {
    private static final Scanner sc = new Scanner(System.in);
    private int availableDays;
    private int month;
    private int day;
    private int year;

    /**
     * Constructs a DateFormatter object given date in the format mm/dd/yyyy
     * @param date the date in the format mm/dd/yyyy
     * @throws IllegalArgumentException if the date string is not in the correct form
     * */
    public DateFormatter(String date) throws IllegalArgumentException{
        int[] dateValues = divide(date);
        setYear(dateValues[2]);
        setMonth(dateValues[0]);
        setDay(dateValues[1]);
    }

    /**
     * Constructs a DateFormatter object with default date 01/01/1000
     * */
    public DateFormatter(){this("01/01/1000");}
    /**
     * Constructs a DateFormatter object by copying another DateFormatter object.
     * @param other the DateFormatter object to copy
     */
    public DateFormatter(DateFormatter other){
        this.year = other.year;
        this.month = other.month;
        this.day = other.day;
        setAvailableDays();
    }

    /**
     * Returns the month name corresponding to the current month number.
     * @return the month name
     */
    public String getMonth(){
        return switch (this.month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }
    /**
     * Returns the day of the date
     * @return the day of the date
     */
    public int getDay(){return day;}
    /**
     * Returns the year of the date
     * @return the year of the date
     * */
    public int getYear(){return year;}
    /**
     * Sets the year of the date, validating it to be between 1000 and 3000.
     * Prompts the user for a valid year if the input is invalid.
     * @param year the year to set
     */
    public void setYear(int year){
        while(true){
            try{
                if (year < 1000 || year > 3000) throw new YearException();
                this.year = year;
                break;
            } catch (YearException e){
                System.out.println(e.getMessage());
                System.out.println("Enter new year");
                year = sc.nextInt();
            }
        }
    }
    /**
     * Sets the month of the date, validating it to be between 1 and 12.
     * Prompts the user for a valid month if the input is invalid.
     * @param month the month to set
     */
    public void setMonth(int month){
        while(true){
            try{
                if (month < 1 || month > 12) throw new MonthException();

                this.month = month;
                break;
            } catch (MonthException e){
                System.out.println(e.getMessage());
                System.out.println("Enter new month");
                month = sc.nextInt();
            }
        }
    }
    /**
     * Sets the day of the date, validating it to be within the number of available days in the current month.
     * Prompts the user for a valid day if the input is invalid.
     * @param day the day to set
     */
    public void setDay(int day){
        setAvailableDays();
        while(true){
            try{
                if (day < 1 || day > availableDays)
                    throw new DayException("Day should be between 1 and " + availableDays + " (inclusive)");

                this.day = day;
                break;
            } catch (MonthException e){
                System.out.println(e.getMessage());
                System.out.println("Enter new day");
                day = sc.nextInt();
            }
        }
    }
    /**
     * Returns the number of days in the current month.
     * @return the number of days in the current month
     */
    private int[] divide(String date) throws IllegalArgumentException{
        String[] temp = date.split("/");
        if (temp.length != 3) throw new IllegalArgumentException("Date should be in form mm/dd/yyyy");
        int[] res = new int[3];
        for (int i = 0; i < temp.length; i++){
            try{
                res[i] = Integer.parseInt(temp[i]);
            } catch (Exception e){
                String err;
                if (i == 0) err = "Month";
                else if (i == 1) err = "Day";
                else err = "Year";
                System.out.println("Invalid " + err + " input. Please enter an integer");
                temp[i] = sc.next();
                i--;
            }
        }
        return res;
    }
    /**
     * Checks if the current date is a valid Gregorian calendar date.
     * @return true if the current date is valid, false otherwise
     */
    private boolean isLeapYear(int year){
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    /**
     * Sets the number of available days in the current month.
     */
    private void setAvailableDays(){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) this.availableDays = 31;
        else if (month == 2 && isLeapYear(this.year)) this.availableDays = 29;
        else if (month == 2) this.availableDays = 28;
        else month = 30;
    }
    /**
     * Checks if the current date is a valid Gregorian calendar date.
     * @return true if the current date is valid, false otherwise
     */
    public String toString(){
        return getMonth() + " " + getDay() + "," + getYear();
    }
}