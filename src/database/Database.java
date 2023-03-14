package database;

import exceptions.ItemAlreadyExistException;
import items.*;

import java.util.*;

/**
 * This is NOT a real database.
 *
 * This is just the storage where all the items will be storage
 */
public class Database {
    private final LinkedList<Film> storeFilms = new LinkedList<Film>();
    private final HashSet<Serie> storeSeries = new HashSet<Serie>();
    private final ArrayList<Book> storeBooks = new ArrayList<Book>();
    private final LinkedHashSet<Videogame> storeVideogame = new LinkedHashSet<Videogame>();
    private final TreeSet<String> sortedFilmsByTitle = new TreeSet<String>();
    private final TreeSet<String> sortedSeriesByTitle = new TreeSet<String>();
    private final TreeSet<String> sortedBooksByTitle = new TreeSet<String>();
    private final TreeSet<String> sortedVideogamesByTitle = new TreeSet<String>();
    private final TreeSet<String> sortedAllByTitle = new TreeSet<String>();

    public LinkedList<Film> getStoreFilms() {
        return storeFilms;
    }

    public HashSet<Serie> getStoreSeries() {
        return storeSeries;
    }

    public ArrayList<Book> getStoreBooks() {
        return storeBooks;
    }

    public LinkedHashSet<Videogame> getStoreVideogame() {
        return storeVideogame;
    }

    public TreeSet<String> getSortedFilmsByTitle() {
        return sortedFilmsByTitle;
    }

    public TreeSet<String> getSortedSeriesByTitle() {
        return sortedSeriesByTitle;
    }

    public TreeSet<String> getSortedBooksByTitle() {
        return sortedBooksByTitle;
    }

    public TreeSet<String> getSortedVideogamesByTitle() {
        return sortedVideogamesByTitle;
    }

    public TreeSet<String> getSortedAllByTitle() {
        return sortedAllByTitle;
    }

    /**
     * Add film to database
     *
     * @param  film the film which is to be saved
     * @throws ItemAlreadyExistException if the film already exist this exception will be thrown
     */
    public void addFilm(Film film) throws ItemAlreadyExistException {
        if (sortedFilmsByTitle.contains(film.getTitle())) {
            throw new ItemAlreadyExistException(film);
        }

        storeFilms.add(film);
        sortedFilmsByTitle.add(film.getTitle());
        addItemInSortedStorage(film);
    }

    /**
     * Add serie to database
     *
     * @param  serie the serie which is to be saved
     * @throws ItemAlreadyExistException if the film already exist this exception will be thrown
     */
    public void addSerie(Serie serie) throws ItemAlreadyExistException {
        if (sortedSeriesByTitle.contains(serie.getTitle())) {
            throw new ItemAlreadyExistException(serie);
        }

        storeSeries.add(serie);
        sortedSeriesByTitle.add(serie.getTitle());
        addItemInSortedStorage(serie);
    }

    /**
     * Add book to database
     *
     * @param book the book which is to be saved
     * @throws ItemAlreadyExistException if the film already exist this exception will be thrown
     */
    public void addBook(Book book) throws ItemAlreadyExistException {
        if (sortedBooksByTitle.contains(book.getTitle())) {
            throw new ItemAlreadyExistException(book);
        }

        storeBooks.add(book);
        sortedBooksByTitle.add(book.getTitle());
        addItemInSortedStorage(book);
    }

    /**
     * Add videogame to database
     *
     * @param videogame the videogame which is to be saved
     * @throws ItemAlreadyExistException if the film already exist this exception will be thrown
     */
    public void addVideogame(Videogame videogame) throws ItemAlreadyExistException {
        if (sortedVideogamesByTitle.contains(videogame.getTitle())) {
            throw new ItemAlreadyExistException(videogame);
        }

        storeVideogame.add(videogame);
        sortedVideogamesByTitle.add(videogame.getTitle());
        addItemInSortedStorage(videogame);
    }

    /**
     * Save an item in the sorted storage
     *
     * @param item the item which is to be saved in sorted storage
     */
    void addItemInSortedStorage(Item item) {
        sortedAllByTitle.add(item.getTitle());
    }

}
