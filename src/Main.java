import controllers.MenuController;
import database.Database;
import items.Book;
import items.Film;
import items.Serie;
import items.Videogame;

/**
 * @author Odalys Manzanares
 */
public class Main {
    public static void main(String[] args) {
        try {
            Database database = new Database();

//            Create a default data
            database.addFilm(new Film("El Hobbit: Un viaje inesperado", "Peter Jackson", "Fantasía", 2012, 169));
            database.addFilm(new Film("El Hobbit: La de desolación de Smaug", "Peter Jackson", "Fantasía", 2013, 161));
            database.addFilm(new Film("El Hobbit: La batalla de los cinco ejércitos", "Peter Jackson", "Fantasía", 2014, 144));

            database.addBook(new Book("La comunidad del anillo", "J. R. R. Tolkien", "Fantasía", 1954, 601));
            database.addBook(new Book("El juego de Ender", "Orson Scott Card", "Ciencia ficción", 1985, 252));
            database.addBook(new Book("Fuego y sangre", " George R. R. Martin", "Fantasía", 2018, 815));

            database.addSerie(new Serie("Juego de Tronos", "Mark Mylod, Alex Graves, David Nutter", "Fantasía", 2011, 8));
            database.addSerie(new Serie("Doctor Who", "Russel T. Davis", "Ciencia ficción", 2005, 14));
            database.addSerie(new Serie("The Office", "Randall Einhorn", "Comedia", 2005, 9));

            database.addVideogame(new Videogame("Metal Gear Solid", "Hideo Kojima", "Aventuras", 1998, "PlayStation"));
            database.addVideogame(new Videogame("Minecraft", "Mojang", "Supervivencia", 2009, "PC"));
            database.addVideogame(new Videogame("Doom", "John Carmack; Tom Hall; John Romero", "Disparos", 1993, "Todas las plataformas"));

//            Init application
            MenuController menuController = new MenuController(database);
//            Show application menu
            menuController.showMenu();

        } catch (Exception e) {
            System.out.println("Algo ha salido mal. \nReinicia el programa.");
        }


    }
}