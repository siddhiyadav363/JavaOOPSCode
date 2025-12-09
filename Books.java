public class Books {

    private String title;
    private String author;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Books book = new Books("The Alchemist", "Paulo Coelho");

        book.displayInfo();

        System.out.println("\nUpdating title...");
        book.setTitle("Brida");

        book.displayInfo();
    }
}
