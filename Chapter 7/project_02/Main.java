public class Main {
    public static void main(String[] args) {
        SMS sms1 = new SMS("+37498788986", "Message1");
        System.out.println(sms1);
        System.out.println();

        Email email1 = new Email("Sender", "Receiver", "Subject", "Message");
        System.out.println(email1);
    }
}
