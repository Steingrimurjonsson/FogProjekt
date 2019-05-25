package Logic;

/**
 * The purpose of CustomerException is a custom exception for all uses about a
 * customer / user
 *
 * @author kasper
 */
public class CustomerException extends Exception {

    /**
     * message from exception
     *
     * @param msg
     */
    public CustomerException(String msg) {
        super(msg);
    }

}
