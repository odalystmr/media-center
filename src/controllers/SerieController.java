package controllers;

import exceptions.InvalidFormatException;
import items.Serie;

import java.util.Scanner;

public class SerieController extends ItemController {

    /**
     * this method ask for data to create a serie
     *
     * @return the new serie
     * @throws InvalidFormatException if the data is invalid this exception will be thrown
     */
    public static Serie createSerie() throws InvalidFormatException {
        Scanner sn = new Scanner(System.in);
        System.out.println("Para añadir una serie al catálogo rellena los siguientes datos: ");

        try {
            Serie serie = (Serie) fillCommonData(new Serie());

            System.out.println("Numero de temporadas: ");
            serie.setSeasons(sn.nextInt());

            return serie;
        } catch (Exception e) {
            throw new InvalidFormatException();
        }
    }
}
