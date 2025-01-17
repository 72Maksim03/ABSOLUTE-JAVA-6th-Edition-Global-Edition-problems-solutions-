public class PrintCodeword {
    private char startingChar;
    private int startingInt;

    public PrintCodeword(char startingChar, int startingInt){
        this.startingChar = startingChar;
        this.startingInt = startingInt;
    }

    private char nextChar(char initialChar){
        if(initialChar == 'Z'){
            return 'A';
        }
        return (char)(initialChar + 1);
    }

    private int nextInt(int initialInt){
        if(initialInt == 9){
            return 0;
        }
        return initialInt + 1;
    }

    public void print_Code(){
        char currentChar = startingChar;
        int currentInt = startingInt;
        for(int i = 0; i < 26; i++){
            String res = "" + currentChar + currentInt;
            System.out.println(res);
            currentChar = nextChar(currentChar);
            currentInt = nextInt(currentInt);
        }
    }
}
