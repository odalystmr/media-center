package controllers;

import exceptions.InvalidFormatException;
import items.Film;

import java.util.Scanner;

public class FilmController extends ItemController {

    /**
     * this method ask for data to create a film
     *
     * @return the new film
     * @throws InvalidFormatException if the data is invalid this exception will be thrown
     */
    public static Film createFilm() throws InvalidFormatException {
        Scanner sn = new Scanner(System.in);
        System.out.println("Para crear una película rellena los siguientes datos:");

        try {
            Film film = (Film) fillCommonData(new Film());

            System.out.println("Duración: ");
            film.setDuration(sn.nextInt());

            return film;
        } catch (Exception e) {
            throw new InvalidFormatException();
        }
    }

}
