package ca.bcit.comp2522.lab03;

/**
 * Represents an Airport with its location and airport ID.
 *
 * @author Amir Eskanari
 * @version 1.0
 */
@SuppressWarnings("checkstyle:Indentation")
public class Airport {

  /**
     * The location of the airport.
     */
  private String location;

    /**
     * The ID of the airport.
     */
    private String airportID;

    /**
     * Constructs a new Airport with given location and airport ID.
     *
     * @param newLocation  the location of the airport
     * @param newAirportID the ID of the airport
     */
    public Airport(final String newLocation, final String newAirportID) {
        this.location = newLocation;
        this.airportID = newAirportID;
    }

    /**
     * Gets the location of the airport.
     *
     * @return the location of the airport
     */
    public String getLocation() {
        return location;
    }

    /**
     * Gets the ID of the airport.
     *
     * @return the ID of the airport
     */
    public String getAirportID() {
        return airportID;
    }


    /**
     * Returns a string representation of the airport.
     *
     * @return a string representation of the airport
     */
    @Override
    public String toString() {
        return "Airport{" + "location='" + location + '\'' + ", airportID='" + airportID + '\'' + '}';
    }
}
