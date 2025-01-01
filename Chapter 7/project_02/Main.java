/**
 * Define a class named Message that contains an instance variable of type String
 * named text that stores any textual content for the Message. Create a method named
 * toString that returns the text field and also include a method to set this value.
 *  Next, define a class for SMS that is derived from Message and includes instance
 * variables for the recipientContactNo. Implement appropriate accessor and mutator methods. The body of the SMS message should be stored in the inherited
 * variable text. Redefine the toString method to concatenate all text fields.
 *  Similarly, define a class for Email that is derived from Message and includes an
 * instance variable for the sender, receiver, and subject. The textual contents of the
 * file should be stored in the inherited variable text. Redefine the toString method
 * to concatenate all text fields.
 *  Create sample objects of type Email and SMS in your main method. Test your
 * objects bypassing them to the following subroutine that returns true if the object
 * contains the specified keyword in the text property.
 * public static boolean ContainsKeyword(Message messageObject,
 *  String keyword)
 * {
 *  if (messageObject.toString().indexOf(keyword,0) >= 0)
 *  return true;
 *  return false;
 * }
 *  Finally, include a method to encode the final message “This is Java” using an
 * encoding scheme, according to which, each character should be replaced by the
 * character that comes after it. For example, if the message contains character B or b,
 * it should be replaced by C or c accordingly, while Z or z should be replaced with
 * an A or a. If the final message is “This is Java”, then the encoded message should
 * be “UijtjtKbwb”.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        SMS sms1 = new SMS("+37498788986", "Message1");
        System.out.println(sms1);
        System.out.println();

        Email email1 = new Email("Sender", "Receiver", "Subject", "Message");
        System.out.println(email1);

        System.out.println();
        System.out.println(email1.encode());

        System.out.println();
        System.out.println(ContainsKeyword(sms1, "Message"));
        System.out.println(ContainsKeyword(email1, "email"));
    }

    public static boolean ContainsKeyword(Message messageObject, String keyword) {
        if (messageObject.toString().indexOf(keyword,0) >= 0) return true;
        return false;
    }
}
