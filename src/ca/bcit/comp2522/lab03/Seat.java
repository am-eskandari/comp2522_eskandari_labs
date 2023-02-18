package ca.bcit.comp2522.lab03;

/**
 * This class represents a Seat object.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Seat {

    /**
     * The seat number.
     */
    private String seatNumber;

    /**
     * The seat class (e.g. economy, business, first).
     */
    private String seatClass;

    /**
     * Whether the seat is booked or not.
     */
    private Boolean isBooked;

    /**
     * Constructs a Seat object.
     *
     * @param newSeatNumber the seat number
     * @param newSeatClass the seat class
     * @param newisBooked whether the seat is booked or not
     */
    public Seat(
            final String newSeatNumber,
            final String newSeatClass,
            final Boolean newisBooked) {
        this.seatNumber = newSeatNumber;
        this.seatClass = newSeatClass;
        this.isBooked = false;
    }

    /**
     * Gets the seat number.
     *
     * @return the seat number
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Gets the seat class.
     *
     * @return the seat class
     */
    public String getSeatClass() {
        return seatClass;
    }

    /**
     * Gets whether the seat is booked or not.
     *
     * @return whether the seat is booked or not
     */
    public Boolean getIsBooked() {
        return isBooked;
    }

    /**
     * Returns a string representation of the Seat object.
     *
     * @return a string representation of the Seat object
     */
    @Override
    public String toString() {
        return "Seat{" + "seatNumber='" + seatNumber + '\'' + ", seatClass='" + seatClass + '\''
                +
                ", available=" + isBooked + '}';
    }
}
