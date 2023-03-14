package controllers;

import exceptions.InvalidFormatException;
import items.Book;

import java.util.Scanner;

public class BookController extends ItemController {
    /**
     * this method ask for data to create a book
     *
     * @return the new book
     * @throws InvalidFormatException if the data is invalid this exception will be thrown
     */
    public static Book createBook() throws InvalidFormatException {
        Scanner sn = new Scanner(System.in);
        System.out.println("Para añadir un libro al catálogo rellena los siguientes datos: ");

        try {
            Book book = (Book) fillCommonData(new Book());

            System.out.println("Numero de páginas: ");
            book.setNumPages(sn.nextInt());

            return book;
        } catch (Exception e) {
            throw new InvalidFormatException();
        }

    }
}
