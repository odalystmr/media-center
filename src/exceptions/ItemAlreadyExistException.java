package exceptions;

import items.Item;

/**
 * This exception will be used when the item already exist
 */
public class ItemAlreadyExistException extends Exception {
    private final Item item;

    public ItemAlreadyExistException(Item item) {
        this.item = item;
    }

    @Override

    public String getMessage() {
        return "La obra con el titulo " + item.getTitle() + " ya existe.";
    }
}
