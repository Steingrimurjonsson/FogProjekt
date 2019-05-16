package Logic;

public class Invoice 
{
private int idInvoice;
private int idOrder;
double price;

    public Invoice(int idInvoice, int idOrder, double price) {
        this.idInvoice = idInvoice;
        this.idOrder = idOrder;
        this.price = price;
    }

    public int getIdInvoice()
    {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice)
    {
        this.idInvoice = idInvoice;
    }

    public int getIdOrder()
    {
        return idOrder;
    }

    public void setIdOrder(int idOrder)
    {
        this.idOrder = idOrder;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

  
}
