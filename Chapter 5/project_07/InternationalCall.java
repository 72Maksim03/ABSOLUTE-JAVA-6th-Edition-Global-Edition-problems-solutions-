import java.text.DecimalFormat;

/**
 * Represents an international call between two phone numbers, including the country codes,
 * and tracks the call duration and pricing.
 */
public class InternationalCall {

    /** The source phone number making the call. */
    private String sourcePhoneNumber;

    /** The country code of the source phone number. */
    private String sourcePhoneNumberCountryCode;

    /** The destination phone number receiving the call. */
    private String destinationPhoneNumber;

    /** The country code of the destination phone number. */
    private String destinationPhoneNumberCountryCode;

    /** The duration of the current call in seconds. */
    private int currentCallDuration;

    /** The total duration of all calls in seconds. */
    private int totalCallDuration = 0;

    /** The price of the current call in dollars. */
    private double currentCallPrice;

    /** The formatted string representation of the current call price. */
    private String formattedCurrentPrice;

    /** The total price of all calls in dollars. */
    private double totalCallPrice = 0;

    /** The formatted string representation of the total call price. */
    private String formattedTotalCallPrice;

    /**
     * Constructs an InternationalCall object with the specified country codes, phone numbers,
     * and call duration.
     *
     * @param sourcePhoneNumberCountryCode The country code of the source phone number.
     * @param sourcePhoneNumber The source phone number making the call.
     * @param destinationPhoneNumberCountryCode The country code of the destination phone number.
     * @param destinationPhoneNumber The destination phone number receiving the call.
     * @param currentCallDuration The duration of the current call in seconds.
     */
    public InternationalCall(String sourcePhoneNumberCountryCode, String sourcePhoneNumber,
                             String destinationPhoneNumberCountryCode, String destinationPhoneNumber,
                             int currentCallDuration) {
        this.sourcePhoneNumber = sourcePhoneNumber;
        this.sourcePhoneNumberCountryCode = sourcePhoneNumberCountryCode;
        this.destinationPhoneNumber = destinationPhoneNumber;
        this.destinationPhoneNumberCountryCode = destinationPhoneNumberCountryCode;
        this.currentCallDuration = currentCallDuration;
        this.calculateTotalCallDuration();
        this.calculateCurrentCallPrice();
        this.calculateTotalCallPrice();
        this.formatPrices();
    }

    /**
     * Sets the source phone number and its country code.
     *
     * @param sourcePhoneNumberCountryCode The country code of the source phone number.
     * @param sourcePhoneNumber The source phone number making the call.
     */
    public void setSourcePhoneNumber(String sourcePhoneNumberCountryCode, String sourcePhoneNumber) {
        this.sourcePhoneNumber = sourcePhoneNumber;
        this.sourcePhoneNumberCountryCode = sourcePhoneNumberCountryCode;
    }

    /**
     * Sets the destination phone number and its country code.
     *
     * @param destinationPhoneNumberCountryCode The country code of the destination phone number.
     * @param destinationPhoneNumber The destination phone number receiving the call.
     */
    public void setDestinationPhoneNumber(String destinationPhoneNumberCountryCode, String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
        this.destinationPhoneNumberCountryCode = destinationPhoneNumberCountryCode;
    }

    /**
     * Sets the duration of the current call and updates the call pricing and total duration.
     *
     * @param currentCallDuration The duration of the current call in seconds.
     */
    public void setCurrentCallDuration(int currentCallDuration) {
        this.currentCallDuration = currentCallDuration;
        this.calculateTotalCallDuration();
        this.calculateCurrentCallPrice();
        this.calculateTotalCallPrice();
        this.formatPrices();
    }

    /**
     * Calculates and updates the total call duration by adding the current call duration.
     */
    private void calculateTotalCallDuration() {
        this.totalCallDuration += this.currentCallDuration;
    }

    /**
     * Calculates the price of the current call based on its duration.
     *
     * If the call is:
     * - 60 seconds or less: the price is $0.6 per minute.
     * - Between 60 and 120 seconds: the price is $0.4 per minute.
     * - More than 120 seconds: the price is $0.2 per minute.
     */
    private void calculateCurrentCallPrice() {
        if (this.currentCallDuration <= 60) {
            this.currentCallPrice = this.currentCallDuration * 0.6 / 60;
        } else if (this.currentCallDuration <= 120) {
            this.currentCallPrice = this.currentCallDuration * 0.4 / 60;
        } else {
            this.currentCallPrice = this.currentCallDuration * 0.2 / 60;
        }
    }

    /**
     * Updates the total call price by adding the current call price and applying any applicable discounts.
     */
    private void calculateTotalCallPrice() {
        this.totalCallPrice += this.currentCallPrice;
        this.setDiscount();
    }

    /**
     * Applies a discount based on the total call duration.
     *
     * If the total call duration is:
     * - Greater than 1200 seconds: a 10% discount is applied.
     * - Greater than 600 seconds: an 8% discount is applied.
     */
    private void setDiscount() {
        if (this.totalCallDuration > 1200) {
            this.totalCallPrice *= 0.9;
        } else if (this.totalCallDuration > 600) {
            this.totalCallPrice *= 0.92;
        }
    }

    /**
     * Formats the current and total call prices to three decimal places.
     */
    private void formatPrices() {
        DecimalFormat df = new DecimalFormat("#.###");
        this.formattedCurrentPrice = df.format(this.currentCallPrice);
        this.formattedTotalCallPrice = df.format(this.totalCallPrice);
    }

    /**
     * Returns a string representation of the InternationalCall object, including details of
     * the source and destination phone numbers, call durations, and prices.
     *
     * @return A string representing the details of the call.
     */
    public String toString() {
        return "Source Phone Number: " + this.sourcePhoneNumberCountryCode + this.sourcePhoneNumber +
                "\nDestination Phone Number: " + this.destinationPhoneNumberCountryCode + this.destinationPhoneNumber +
                "\nCurrent Call Duration: " + this.currentCallDuration + " seconds" +
                "\nCurrent Call Price: " + this.formattedCurrentPrice + " dollars" +
                "\nTotal Call Duration: " + this.totalCallDuration + " seconds" +
                "\nTotal Call Price: " + this.formattedTotalCallPrice + " dollars";
    }
}
