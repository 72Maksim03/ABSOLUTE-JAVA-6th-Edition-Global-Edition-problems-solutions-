public class WordCount {
    private int count;
    private String sentence;

    public WordCount(String sentence) {
        this.sentence = sentence;
        this.setCount();
    }

    public WordCount(){
        this.sentence = "";
        this.setCount();
    }

    public void setSentence(String sentence){
        this.sentence = sentence;
    }

    public int getCount(){
        return this.count;
    }

    public void setCount(){
        this.count = 0;
    }

    private void increaseCount(){
        this.count++;
    }

    private void decreaseCount(){
        if(this.count != 0){
            this.count--;
        }
    }

    public void countWordsInSentence(){
        String[] words = this.sentence.split("\\s+");
        for(String word : words){
            if(word.toLowerCase().charAt(0) == 'a') {
                this.decreaseCount();
            } else {
                this.increaseCount();
            }
        }
    }

    public void printCount(){
        System.out.println(this.count);
    }


}
