public class SMS extends Message{
    private String recipientContactNo;

    public SMS(String recipientContactNo, String message){
        super(message);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo(){return recipientContactNo;}
    public void setRecipientContactNo(String recipientContactNo){this.recipientContactNo = recipientContactNo;}

    public String toString(){
        return "Recipient: " + recipientContactNo +
                "\n" + super.toString();
    }
}
