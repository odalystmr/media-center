package controllers;

import database.Database;
import exceptions.InvalidFormatException;
import exceptions.ItemAlreadyExistException;

import java.util.Scanner;
import java.util.TreeSet;

public class MenuController {
    Scanner sn = new Scanner(System.in);
    Database database;
    SearchController searchController;

    public MenuController(Database database) {
        this.database = database;
        this.searchController = new SearchController(database);
    }

    /**
     * Show the menu to the user with all the options
     */
    public void showMenu() {
        boolean exit = false;
        int opcion;
        String text = """
                1. Ver catálogos
                2. Añadir obras
                3. Buscar obra
                0. Salir de la aplicación
                Escribe una de las opciones""";

        while (!exit) {
            System.out.println(text);
            opcion = sn.nextInt();

            switch (opcion) {
                case 1 -> showCatalog();
                case 2 -> showCreationMenu();
                case 3 -> searchItemInCatalog();
                case 0 -> exit = true;
                default -> System.out.println("Solo números entre 1 y 4");
            }

        }
    }

    /**
     * Show the options within the catalog to choose which one the user wants to see
     */
    void showCatalog() {
        boolean exit = false;
        int opcion;
        String text = """
                1. Ver películas
                2. Ver series
                3. Ver libros
                4. Ver videojuegos
                5. Ver todo el catálogo
                0. Volver atrás
                """;

        while (!exit) {
            System.out.println(text);
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1 -> show(database.getSortedFilmsByTitle());
                case 2 -> show(database.getSortedSeriesByTitle());
                case 3 -> show(database.getSortedBooksByTitle());
                case 4 -> show(database.getSortedVideogamesByTitle());
                case 5 -> show(database.getSortedAllByTitle());
                case 0 -> exit = true;
                default -> System.out.println("Solo números entre 1 y 6");
            }

        }
    }

    /**
     * Show the options within the creations menu to choose which type of item the user wants to create
     */
    void showCreationMenu() {
        boolean exit = false;
        int opcion;
        String text = """
                1. Añadir película
                2. Añadir serie
                3. Añadir libro
                4. Añadir videojuego
                0. Volver atrás""";

        while (!exit) {
            System.out.println(text);
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            try {
                switch (opcion) {
                    case 1 -> database.addFilm(FilmController.createFilm());
                    case 2 -> database.addSerie(SerieController.createSerie());
                    case 3 -> database.addBook(BookController.createBook());
                    case 4 -> database.addVideogame(VideogameController.createVideogame());
                    case 0 -> exit = true;
                    default -> System.out.println("Solo números entre 1 y 5");
                }
            } catch (InvalidFormatException e) {
                System.out.println("No se ha podido añadir.");
                System.out.println(e.getMessage());
            } catch (ItemAlreadyExistException e) {
                System.out.println("No se ha podido añadir.");
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Show the options within the search menu to choose in which type of item the user wants to find
     */
    void searchItemInCatalog() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int opcion;
        String text = """
                1. Buscar película
                2. Buscar serie
                3. Buscar libro
                4. Buscar videojuego
                5. Buscar en todo el catálogo
                0. Volver atrás""";

        while (!exit) {
            System.out.println(text);
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            System.out.println("Escribe el titulo que quieras buscar");
            String title = scanner.nextLine();

            switch (opcion) {
                case 1 -> searchController.searchFilm(title);
                case 2 -> searchController.searchSerie(title);
                case 3 -> searchController.searchBook(title);
                case 4 -> searchController.searchVideogame(title);
                case 5 -> searchController.searchAll(title);
                case 0 -> exit = true;
                default -> System.out.println("Solo números entre 1 y 5");
            }

        }
    }

    /**
     * Show the sorted list of titles in the console
     *
     * @param titles the sorted list of titles
     */
    private static void show(TreeSet<String> titles) {
        for (String title : titles) {
            System.out.println(title);
        }
    }
}

