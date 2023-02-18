package ca.bcit.comp2522.lab03;

/**
 * The Renter class is used to store information about a Renter.
 *
 * @author Amir Eskandari
 * @version 1.0
 * @since 1.0
 **/
public class Renter {
    /**
     * The name of the renter company.
     */
    private String renterCompany;

    /**
     * The Plane that the renter rents.
     */
    private Plane plane;

    /**
     * Constructs a Renter object with the specified company name and plane.
     *
     * @param renterCompany the name of the renter company
     * @param plane         the Plane that the renter rents
     */
    public Renter(
            final String renterCompany,
            final Plane plane) {
        this.renterCompany = renterCompany;
        this.plane = plane;
    }

    /**
     * Gets the name of the renter company.
     *
     * @return the name of the renter company
     */
    public String getRenterCompany() {
        return renterCompany;
    }

    /**
     * Gets the Plane that the renter rents.
     *
     * @return the Plane that the renter rents
     */
    public Plane getPlane() {
        return plane;
    }

}
