package Logic.Models;

public class Model_Invoice {

    private int idInvoice;
    private int idOrder;
    private double totalPrice;

    /**
     * Constructor for invoice.
     *
     * @param idInvoice
     * @param idOrder
     * @param totalPrice
     */
    public Model_Invoice(int idInvoice, int idOrder, double totalPrice) {
        this.idInvoice = idInvoice;
        this.idOrder = idOrder;
        this.totalPrice = totalPrice;
    }

    /**
     * constructor for invoice without invoice ID
     *
     * @param idOrder
     * @param totalPrice
     */
    public Model_Invoice(int idOrder, double totalPrice) {
        this.idOrder = idOrder;
        this.totalPrice = totalPrice;
    }

    /**
     *
     * @return Model_Invoice ID
     */
    public int getIdInvoice() {
        return idInvoice;
    }

    /**
     *
     * @param idInvoice
     */
    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    /**
     *
     * @return Order ID
     */
    public int getIdOrder() {
        return idOrder;
    }

    /**
     *
     * @param idOrder
     */
    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    /**
     *
     * @return total price of order
     */
    public double getPrice() {
        return totalPrice;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.totalPrice = totalPrice;
    }

}
