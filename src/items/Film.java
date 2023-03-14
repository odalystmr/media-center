package items;

public class Film extends Item {
    private int duration;

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Film() {
    }

    public Film(String title, String author, String genre, int releaseYear, int duration) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Título: " + title + "\n" +
                "   Autor: " + author + "\n" +
                "   Género: " + genre + "\n" +
                "   Año de estreno: " + releaseYear + "\n" +
                "   Duración de la película: " + duration + "\n";
    }
}
