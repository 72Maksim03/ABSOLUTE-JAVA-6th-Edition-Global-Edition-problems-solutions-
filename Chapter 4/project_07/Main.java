/**
 * Write a Temperature class that has two instance variables: a temperature value
 * (a floating-point number) and a character for the scale, either C for Celsius or F for
 * Fahrenheit. The class should have four constructor methods: one for each instance
 * variable (assume zero degrees if no value is specified and Celsius if no scale is specified), one with two parameters for the two instance variables, and a no-argument
 * constructor (set to zero degrees Celsius). Include the following: (1) two accessor
 * methods to return the temperature—one to return the degrees Celsius, the other
 * to return the degrees Fahrenheit—use the following formulas to write the two
 * methods, and round to the nearest tenth of a degree:
 * DegreesC = 51degreesF - 322/9
 * DegreesF = (91degreesC)/5) + 32;
 *  (2) three mutator methods: one to set the value, one to set the scale (F or C), and
 * one to set both; (3) three comparison methods: an equals method to test whether
 * two temperatures are equal, one method to test whether one temperature is greater
 * than another, and one method to test whether one temperature is less than
 * another (note that a Celsius temperature can be equal to a Fahrenheit temperature
 * as indicated by the above formulas); and (4) a suitable toString method. Then
 * write a driver program (or programs) that tests all the methods. Be sure to use
 * each of the constructors, to include at least one true and one false case for each of
 * the comparison methods, and to test at least the following temperature equalities:
 * 0.0 degrees C = 32.0 degrees F, –40.0 degrees C = –40.0 degrees F, and 100.0
 * degrees C = 212.0 degrees F
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args){
        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(40);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(40, 'F');
        System.out.println(t1.isGreater(t2));
        System.out.println(t1.isLess(t2));
        System.out.println(t3);
        System.out.println(t2.equals(t4));
        t1.setTemperature(40, 'F');
        System.out.println(t1);
    }
}
