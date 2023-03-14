package items;

public class Videogame extends Item {
    private String platform;

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Videogame() {
    }

    public Videogame(String title, String author, String genre, int releaseYear, String platform) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Título: " + title + "\n" +
                "   Autor: " + author + "\n" +
                "   Género: " + genre + "\n" +
                "   Año de lanzamiento: " + releaseYear + "\n" +
                "   Plataforma de juego: " + platform + "\n";
    }
}
