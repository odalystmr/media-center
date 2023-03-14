package exceptions;

/**
 * This exception will be used when the user inputs a wrong format
 */
public class InvalidFormatException extends Exception {
    @Override
    public String getMessage() {
        return "Formato de datos incorrecto. \n" +
                "Revisalo y vuelve a intentarlo.";
    }
}
