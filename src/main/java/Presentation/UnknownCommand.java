package Presentation;

import Logic.CustomerException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The purpose of UnknownCommand is if the command is unknown, and will give
 * user set message.
 *
 * @author stein
 */
public class UnknownCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomerException {
        String msg = "Unknown command. Contact IT";
        throw new CustomerException(msg);
    }

}
