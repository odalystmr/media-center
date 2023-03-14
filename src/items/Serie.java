package items;

public class Serie extends Item {
    private int seasons;

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public Serie() {
    }

    public Serie(String title, String author, String genre, int releaseYear, int seasons) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "Título: " + title + "\n" +
                "   Autor: " + author + "\n" +
                "   Género: " + genre + "\n" +
                "   Año de estreno: " + releaseYear + "\n" +
                "   Número de temporadas: " + seasons + "\n";
    }

}
