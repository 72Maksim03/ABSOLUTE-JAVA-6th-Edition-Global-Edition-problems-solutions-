/**
 * Create a class to represent the phone billing system. For this purpose, you need to
 * define two classes namely, NationalCall and InternationalCall.
 *  Define the NationalCall with the following attributes. You can include your own
 * attributes also, if required.
 *  a. Source phone number
 *  b. Destination phone number
 *  c. Total duration of current call in seconds
 *  d. Total duration of all call
 *  e. Current call price
 *  f. Total price of all calls
 *  Include a constructor that constructs a NationalCall object from the parameters for:
 *  a. Source phone number
 *  b. Destination phone number
 *  c. Total duration of current call in seconds
 *  The InternationalCall class is defined with the following additional attributes
 * apart from the attributes of NationalCall class.
 *  a. Source phone number Country code
 *  b. Destination phone number Country code
 *  The following table shows call rates as per the call durations.
 * Call Duration
 * National Call
 * Rates
 * International
 * Call Rates
 * <= First minute 0.20 $ 0.60 $
 * > First Minute and <= second minute 0.15 $ 0.40 $
 * > Second minute 0.10 $ 0.20 $
 *  Also, define a method as DiscountCall that will calculate the discount provided
 * to the customer depending upon the duration of the call. The discount rates are
 * different for national and international calls. The table below shows some of the
 * sample values for the discount offer.
 * Total duration of all calls
 * National Call
 * Discounted on Call
 * Price
 * International Call
 * Discounted Number
 * of Call Units
 * > 10 and <= 20 minutes 5% 8%
 * > 20 minutes 7% 10%
 *  Write a suitable constructor that will initialize all data members and construct the
 * objects for the class.
 *  Write a suitable method to display the details of NationalCall and InternationalCall class. Define the main method class to test and implement the code.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        NationalCall nCall1 = new NationalCall("097291223", "077655350", 147);
        System.out.println(nCall1);
        System.out.println();
        nCall1.setCurrentCallDuration(100);
        System.out.println(nCall1);
        System.out.println();
        InternationalCall iCall1 = new InternationalCall("+374", "97291223",
                "+7", "880008800", 147);
        System.out.println(iCall1);
        System.out.println();
        iCall1.setCurrentCallDuration(100);
        System.out.println(iCall1);
    }
}
