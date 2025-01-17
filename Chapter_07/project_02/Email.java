public class Email extends Message{
    private String sender;
    private String receiver;
    private String subject;

    public Email(String sender, String receiver, String subject, String message) {
        super(message);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public String getSender(){return this.sender;}
    public String getReceiver(){return this.receiver;}
    public String getSubject(){return this.subject;}

    public void setSender(String sender){this.sender = sender;}
    public void setReceiver(String receiver){this.receiver = receiver;}
    public void setSubject(String subject){this.subject = subject;}

    public String toString(){
        return "Sender: " + this.sender +
                "\nReceiver: " + this.receiver +
                "\nSubject: " + this.subject +
                "\n" + super.toString();
    }
}
