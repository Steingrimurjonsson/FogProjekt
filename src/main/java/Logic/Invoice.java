package Logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Invoice 
{
private int idInvoice;
private int idUser;
double price;

    public Invoice(int idInvoice, int idUser, double price) {
        this.idInvoice = idInvoice;
        this.idUser = idUser;
        this.price = price;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        if(request.getParameter("userID")!=null)
        {
            return"order";
        }
            return "order";
}
}
