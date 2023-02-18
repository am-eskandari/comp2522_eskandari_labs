package ca.bcit.comp2522.lab03;

/**
 * Represents a Customer with their name, credit card number, and seat reservation.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Customer {

    /**
     * The name of the customer.
     */
    private String name;

    /**
     * The credit card number of the customer.
     */
    private String creditCardNumber;

    /**
     * The seat reservation of the customer.
     */
    private Seat seat;

    /**
     * Constructs a new Customer with the given name, credit card number, and seat reservation.
     *
     * @param name             the name of the customer
     * @param creditCardNumber the credit card number of the customer
     * @param seat             the seat reservation of the customer
     */
    public Customer(final String name, final String creditCardNumber, final Seat seat) {
        this.name = name;
        this.creditCardNumber = creditCardNumber;
        this.seat = seat;
    }

    /**
     * Gets the seat reservation of the customer.
     *
     * @return the seat reservation of the customer
     */
    public Seat getSeat() {
        return seat;
    }

    /**
     * Gets the name of the customer.
     *
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the credit card number of the customer.
     *
     * @return the credit card number of the customer
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Returns a string representation of the customer.
     *
     * @return a string representation of the customer
     */
    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", creditCardNumber='" + creditCardNumber + '\'' + '}';
    }
}
