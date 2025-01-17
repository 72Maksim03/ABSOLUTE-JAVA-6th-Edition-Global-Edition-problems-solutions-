public class Journal {
    private String title;
    private String author;
    private Date date;

    public Journal(String author, String title, String date){
        this.author = author;
        this.title = title;
        this.date = new Date(date);
    }

    public void displayDetails(){
        System.out.println("Author name: " + this.author);
        System.out.println("Title: " + this.title);
        System.out.println("Date: " + this.date.toString());
    }

    public String getSubmissionDetails(){
        String[] titleComponents = this.title.split(" ");
        String res = "";
        for(int i = 0; i < titleComponents.length; i++){
            res = res + (titleComponents[i].charAt(0) + "").toUpperCase() + titleComponents[i].substring(1) + " ";
        }
        return res;
    }
}
