package items;

public class Book extends Item {
    private int numPages;

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Book() {
    }

    public Book(String title, String author, String genre, int releaseYear, int numPages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.numPages = numPages;
    }


    @Override
    public String toString() {
        return "Título: " + title + "\n" +
                "   Autor: " + author + "\n" +
                "   Género: " + genre + "\n" +
                "   Año de publicación: " + releaseYear + "\n" +
                "   Número de páginas: " + numPages + "\n";
    }
}
