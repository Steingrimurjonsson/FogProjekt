package Data;

public class Invoice 
{
private int idInvoice;
private int idOrder;
private double totalPrice;

    public Invoice(int idInvoice, int idOrder, double totalPrice) {
        this.idInvoice = idInvoice;
        this.idOrder = idOrder;
        this.totalPrice = totalPrice;
    }

    public Invoice(int idOrder, double totalPrice)
    {
        this.idOrder = idOrder;
        this.totalPrice = totalPrice;
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
        return totalPrice;
    }

    public void setPrice(double price)
    {
        this.totalPrice = totalPrice;
    }

  
}
