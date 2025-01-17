import java.text.DecimalFormat;
public class CalAge {
    private int birthday_day;
    private int birthday_month;
    private int birthday_year;
    private int currentDay;
    private int currentMonth;
    private int currentYear;

    public CalAge(String birthday, String currentDate){
        setBirthday(birthday);
        setCurrentDay(currentDate);
    }

    private int getMonth(String month){
        if(month.equalsIgnoreCase("january") || month.equals("01")){
            return 1;
        } else if(month.equalsIgnoreCase("february") || month.equals("02")){
            return 2;
        } else if(month.equalsIgnoreCase("march") || month.equals("03")){
            return 3;
        } else if(month.equalsIgnoreCase("april") || month.equals("04")){
            return 4;
        } else if(month.equalsIgnoreCase("may") || month.equals("05")){
            return 5;
        } else if(month.equalsIgnoreCase("june") || month.equals("06")){
            return 6;
        } else if(month.equalsIgnoreCase("july") || month.equals("07")){
            return 7;
        } else if(month.equalsIgnoreCase("august") || month.equals("08")){
            return 8;
        } else if(month.equalsIgnoreCase("september") || month.equals("09")){
            return 9;
        } else if(month.equalsIgnoreCase("october") || month.equals("10")){
            return 10;
        } else if(month.equalsIgnoreCase("november") || month.equals("11")){
            return 11;
        } else if(month.equalsIgnoreCase("december") || month.equals("12")){
            return 12;
        } else{
            System.out.println("Invalid date");
            System.exit(0);
            return 0;
        }
    }

    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100!= 0 || year % 400 == 0);
    }

    public void setBirthday(String date){
        String[] bday = date.split("[ ,./]");
        if(bday.length != 3){
            System.out.println("Invalid date");
            System.exit(0);
        }
        int day = Integer.parseInt(bday[0]);
        int month = getMonth(bday[1]);
        int year = Integer.parseInt(bday[2]);
        if(day < 1 || day > 31 || month < 1 || month > 12){
            System.out.println("Invalid date");
            System.exit(0);
        }
        if(month == 2){
            if(isLeapYear(year) && day > 29){
                System.out.println("Invalid date");
                System.exit(0);
            }
            if(day > 28){
                System.out.println("Invalid date");
                System.exit(0);
            }
        }

        if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            System.out.println("Invalid date");
            System.exit(0);
        }
        this.birthday_day = day;
        this.birthday_month = month;
        this.birthday_year = year;
    }

    public void setCurrentDay(String date){
        String[] cday = date.split("[ ,./]");
        if(cday.length != 3){
            System.out.println("Invalid date");
            System.exit(0);
        }
        int day = Integer.parseInt(cday[0]);
        int month = getMonth(cday[1]);
        int year = Integer.parseInt(cday[2]);
        if(day < 1 || day > 31 || month < 1 || month > 12){
            System.out.println("Invalid date");
            System.exit(0);
        }
        if(month == 2){
            if(isLeapYear(year) && day > 29){
                System.out.println("Invalid date");
                System.exit(0);
            }
            if(day > 28){
                System.out.println("Invalid date");
                System.exit(0);
            }
        }

        if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            System.out.println("Invalid date");
            System.exit(0);
        }
        this.currentDay = day;
        this.currentMonth = month;
        this.currentYear = year;
    }

    public String getAge(){
        DecimalFormat df = new DecimalFormat("##.#");
        double age;
        if(this.currentMonth >= this.birthday_month){
            age = this.currentYear - this.birthday_year + (double)(this.currentMonth - this.birthday_month) / 12;
        } else{
            age = this.currentYear - this.birthday_year - 1 + (double)(this.currentMonth + this.birthday_month) / 12;
        }
        return df.format(age);
    }
}
