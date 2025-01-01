public class Message {
    private String message;

    public Message(String message){this.message = message;}

    public void setMessage(String message){this.message = message;}
    public String getMessage(){return message;}

    public String toString(){return "Message: " + message;}

    public String encode(){
        String encoded = "";

        for (int i = 0; i < message.length(); i++){
            if (message.charAt(i) == 'z') encoded += 'a';
            else if(message.charAt(i) == 'Z') encoded += 'A';
            else encoded += (char)(message.charAt(i) + 1);
        }
        return encoded;
    }

    public String decode(String code){
        String decoded = "";

        for (int i = 0; i < message.length(); i++){
            if (message.charAt(i) == 'a') decoded += 'z';
            else if(message.charAt(i) == 'A') decoded += 'Z';
            else decoded += (char)(message.charAt(i) - 1);
        }

        return decoded;
    }
}
