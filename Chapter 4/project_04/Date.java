public class Date {
    private String month;
    private int day;
    private int year;

    public Date(String dateString){
        String[] components = dateString.split(" ");
        if(components.length != 3){
            System.out.println("Invalid date");
            System.exit(0);
        }
        int d = Integer.parseInt(components[0]);
        String m = components[1];
        int y = Integer.parseInt(components[2]);
        if(isDateValid(d, m, y)){
            this.day = d;
            this.month = m;
            this.year = y;
        } else{
            System.out.println("Invalid date");
            System.exit(0);
        }
    }
    private int monthStringToInt(String month){
        if(month.equalsIgnoreCase("january")){
            return 1;
        } else if (month.equalsIgnoreCase("february")){
            return 2;
        } else if (month.equalsIgnoreCase("march")){
            return 3;
        } else if (month.equalsIgnoreCase("april")){
            return 4;
        } else if (month.equalsIgnoreCase("may")){
            return 5;
        } else if (month.equalsIgnoreCase("june")){
            return 6;
        } else if (month.equalsIgnoreCase("july")){
            return 7;
        } else if (month.equalsIgnoreCase("august")){
            return 8;
        } else if (month.equalsIgnoreCase("september")){
            return 9;
        } else if (month.equalsIgnoreCase("october")){
            return 10;
        } else if (month.equalsIgnoreCase("november")){
            return 11;
        } else if (month.equalsIgnoreCase("december")){
            return 12;
        } else{
            return 0;
        }
    }

    private boolean isDateValid(int day, String month, int year){
        int monthInt = monthStringToInt(month);
        if(monthInt == 0 || day < 1 || day > 31){
            return false;
        }
        if(monthInt == 2 && isLeapYear(year)){
            return day <= 29;
        }

        if(monthInt == 2){
            return day <= 28;
        }

        if(monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11){
            return day <= 30;
        }
        return true;
    }

    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public String toString(){
        return this.day + " " + this.month + " " + this.year;
    }
}
