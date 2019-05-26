package Presentation;

import Presentation.Commands.LogoutCommand;
import Presentation.Commands.LoginCommand;
import Presentation.Commands.UnknownCommand;
import Presentation.Commands.RegisterCommand;
import Presentation.Commands.ShowOrderCommand;
import Presentation.Commands.EmptyCartCommand;
import Presentation.Commands.CustomerPageCommand;
import Presentation.Commands.CreateOrderCommand;
import Presentation.Commands.EditCommand;
import Presentation.Commands.AdminCommand;
import Presentation.Commands.CarportShop;
import Presentation.Commands.CartCommand;
import Presentation.Commands.CalculateCarportCommand;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();

        commands.put("login", new LoginCommand());
        commands.put("register", new RegisterCommand());
        commands.put("carport", new CarportShop());
        commands.put("cart", new CartCommand());
        commands.put("logout", new LogoutCommand());
        commands.put("calculate", new CalculateCarportCommand());
        commands.put("editUser", new EditCommand());
        commands.put("admin", new AdminCommand());
        commands.put("emptyCart", new EmptyCartCommand());
        commands.put("createOrder", new CreateOrderCommand());
        commands.put("showOrder", new ShowOrderCommand());
        commands.put("customerpage", new CustomerPageCommand());

    }

    static Command from(HttpServletRequest request) {
        String commandName = request.getParameter("command");
        if (commands == null) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand());
    }

    abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws Exception;

}
