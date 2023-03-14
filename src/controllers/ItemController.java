package controllers;

import items.Item;

import java.util.Scanner;

public class ItemController {

    /**
     * this method ask for the common data to create the item's basic info
     *
     * @param item the reference to the original item
     * @return the item with the basic information
     */
    protected static Item fillCommonData(Item item){
        Scanner sn = new Scanner(System.in);

            System.out.println("Titulo: ");
            item.setTitle(sn.nextLine());

            System.out.println("Autor: ");
            item.setAuthor(sn.nextLine());

            System.out.println("Género: ");
            item.setGenre(sn.nextLine());

            System.out.println("Año de estreno: ");
            item.setReleaseYear(sn.nextInt());

        return item;
    }
}
