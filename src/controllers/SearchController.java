package controllers;

import database.Database;
import items.*;

import java.util.regex.Pattern;

public class SearchController {
    Database database;

    public SearchController(Database database) {
        this.database = database;
    }

    /**
     * search films using the search term, could be a title or an author
     *
     * @param searchTerm title or author
     */
    public void searchFilm(String searchTerm) {
        Pattern p = getSearchPattern(searchTerm);
        boolean isAMatch = false;

        System.out.println("Películas:\n");

        for (Film film : database.getStoreFilms()) {
            String cleanTitle = removeSpecialCharacters(film.getTitle());
            String cleanAuthor = removeSpecialCharacters(film.getAuthor());
            if (p.matcher(cleanTitle).find() || p.matcher(cleanAuthor).find()) {
                printItem(film);
                isAMatch = true;
            }
        }

        if (!isAMatch) {
            System.out.println("No hay películas para esa búsqueda.\n");
        }

        System.out.println("-------\n");
    }

    /**
     * Search serie using the search term, could be a title or an author
     *
     * @param searchTerm title or author
     */
    public void searchSerie(String searchTerm) {
        Pattern p = getSearchPattern(searchTerm);
        boolean isAMatch = false;

        System.out.println("Series:\n");

        for (Serie serie : database.getStoreSeries()) {
            String cleanTitle = removeSpecialCharacters(serie.getTitle());
            String cleanAuthor = removeSpecialCharacters(serie.getAuthor());
            if (p.matcher(cleanTitle).find() || p.matcher(cleanAuthor).find()) {
                printItem(serie);
                isAMatch = true;

            }
        }

        if (!isAMatch) {
            System.out.println("No hay series para esa búsqueda.\n");
        }

        System.out.println("-------\n");
    }

    /**
     * Search book using the search term, could be a title or an author
     *
     * @param searchTerm title or author
     */
    public void searchBook(String searchTerm) {
        Pattern p = getSearchPattern(searchTerm);
        boolean isAMatch = false;

        System.out.println("Libros:\n");

        for (Book book : database.getStoreBooks()) {
            String cleanTitle = removeSpecialCharacters(book.getTitle());
            String cleanAuthor = removeSpecialCharacters(book.getAuthor());
            if (p.matcher(cleanTitle).find() || p.matcher(cleanAuthor).find()) {
                printItem(book);
                isAMatch = true;

            }
        }

        if (!isAMatch) {
            System.out.println("No hay libros para esa búsqueda.\n");
        }

        System.out.println("-------\n");
    }

    /**
     * Search videogame using the search term, could be a title or an author
     *
     * @param searchTerm title or author
     */
    public void searchVideogame(String searchTerm) {
        Pattern p = getSearchPattern(searchTerm);
        boolean isAMatch = false;

        System.out.println("Videojuegos:\n");

        for (Videogame videogame : database.getStoreVideogame()) {
            String cleanTitle = removeSpecialCharacters(videogame.getTitle());
            String cleanAuthor = removeSpecialCharacters(videogame.getAuthor());
            if (p.matcher(cleanTitle).find() || p.matcher(cleanAuthor).find()) {
                printItem(videogame);
                isAMatch = true;

            }
        }

        if (!isAMatch) {
            System.out.println("No hay videojuegos para esa búsqueda.\n");
        }

        System.out.println("-------\n");
    }

    /**
     * Search in all type of items using the search term, could be a title or an author
     *
     * @param searchTerm title or author
     */
    public void searchAll(String searchTerm) {
        searchFilm(searchTerm);
        searchSerie(searchTerm);
        searchBook(searchTerm);
        searchVideogame(searchTerm);
    }

    /**
     * generate the regex pattern to search
     *
     * @param searchTerm the term the user want to search
     * @return the regex pattern
     */
    private static Pattern getSearchPattern(String searchTerm) {
        return Pattern.compile("(?:^|)(" + searchTerm.toLowerCase() + ")(?:$|)");
    }

    /**
     * Remove special characters to the original title
     *
     * @param text the text which is to be cleaned
     * @return the cleaned text
     */
    private static String removeSpecialCharacters(String text) {
        return text.toLowerCase().replaceAll("[-+.^:,]", "");
    }

    /**
     * Show the item in the console
     *
     * @param item the item to be showed
     */
    private void printItem(Item item) {
        System.out.println(item.toString());
    }
}
