package controllers;

import exceptions.InvalidFormatException;
import items.Videogame;

import java.util.Scanner;

public class VideogameController extends ItemController {

    /**
     * this method ask for data to create a videogame
     *
     * @return the new videogame
     * @throws InvalidFormatException if the data is invalid this exception will be thrown
     */
    public static Videogame createVideogame() throws InvalidFormatException {
        Scanner sn = new Scanner(System.in);
        System.out.println("Para añadir un videojuego al catálogo rellena los siguientes datos: ");

        try {
            Videogame videogame = (Videogame) fillCommonData(new Videogame());

            System.out.println("Plataforma de juego: ");
            videogame.setPlatform(sn.nextLine());

            return videogame;
        } catch (Exception e) {
            throw new InvalidFormatException();
        }
    }
}
