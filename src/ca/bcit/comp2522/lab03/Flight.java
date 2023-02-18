package ca.bcit.comp2522.lab03;

import java.util.ArrayList;

/**
 * Represents a Flight in the airline company.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Flight {
    /**
     * A unique identifier for this Flight.
     */
    private String flightNumber;

    /**
     * The time of departure for this Flight.
     */
    private String departureTime;

    /**
     * The time of arrival for this Flight.
     */
    private String arrivalTime;

    /**
     * The airport from which this Flight departs.
     */
    private Airport departureAirport;

    /**
     * The airport at which this Flight arrives.
     */
    private Airport destinationAirport;

    /**
     * A list of Customers who have booked seats on this Flight.
     */
    private ArrayList<Customer> customers;

    /**
     * A list of Employees who are assigned to work this Flight.
     */
    private ArrayList<Employee> employees;

    /**
     * The Plane which will be used for this Flight.
     */
    private Plane plane;

    /**
     * The duration of this Flight.
     */
    private String duration;

    /**
     * The total capacity of this Flight.
     */
    private int capacity;

    /**
     * The number of seats that are still available for booking on this Flight.
     */
    private int availableSeats;

    /**
     * Constructs a new Flight.
     *
     * @param newFlightNumber       the unique identifier for this Flight
     * @param newDepartureTime      the time of departure for this Flight
     * @param arrivalTime           the time of arrival for this Flight
     * @param newDepartureAirport   the airport from which this Flight departs
     * @param newDestinationAirport the airport at which this Flight arrives
     * @param newPlane              the Plane which will be used for this Flight
     * @param newCapacity           the total capacity of this Flight
     * @param newDuration           the duration of this Flight
     */
    public Flight(
            final String newFlightNumber,
            final String newDepartureTime,
            final String arrivalTime,
            final Airport newDepartureAirport,
            final Airport newDestinationAirport,
            final Plane newPlane,
            final int newCapacity,
            final String newDuration) {
        this.flightNumber = newFlightNumber;
        this.departureTime = newDepartureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = newDepartureAirport;
        this.destinationAirport = newDestinationAirport;
        this.employees = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.plane = newPlane;
        this.duration = newDuration;
        this.capacity = newCapacity;
        this.availableSeats = capacity;
    }

    /**
     * Adds a customer to this flight.
     *
     * @param customer the customer to be added
     */
    public void addCustomer(final Customer customer) {
        if (availableSeats > 0) {
            customers.add(customer);
            availableSeats--;
            System.out.println("This flight is booked.");
        } else {
            System.out.println("This flight is fully booked.");
        }
    }

    /**
     * Removes a customer from this flight.
     *
     * @param customer the customer to be removed
     */
    public void removeCustomer(final Customer customer) {
        if (customers.remove(customer)) {
            availableSeats++;
            System.out.println("This flight is cancelled.");
        } else {
            System.out.println("This customer is not found on flight.");
        }
    }

    /**
     * Adds an employee to this flight.
     *
     * @param employee the employee to be added
     */
    public void addEmployee(final Employee employee) {
        employees.add(employee);
        System.out.println("This employee is now working for this flight.");
    }

    /**
     * Removes an employee from this flight.
     *
     * @param employee the employee to be removed
     */
    public void removeEmployee(final Employee employee) {
        employees.remove(employee);
        System.out.println("This employee is not working for this flight anymore.");
    }

    /**
     * Gets the flight number of this flight.
     *
     * @return the flight number of this flight
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Gets the departure time of this flight.
     *
     * @return the departure time of this flight
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Gets the arrival time of this flight.
     *
     * @return the arrival time of this flight
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Gets the departure airport of this flight.
     *
     * @return the departure airport of this flight
     */
    public Airport getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Gets the destination airport of this flight.
     *
     * @return the destination airport of this flight
     */
    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    /**
     * Gets the duration of this flight.
     *
     * @return the duration of this flight
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Gets the capacity of this flight.
     *
     * @return the capacity of this flight
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Gets the number of available seats of this flight.
     *
     * @return the number of available seats of this flight
     */
    public int getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Returns a string representation of this flight.
     *
     * @return a string representation of this flight
     */
    @Override
    public String toString() {
        return "Flight{" + "flightNumber='" + flightNumber + '\'' + ", departureTime='" + departureTime + '\''
                +
                ", arrivalTime='" + arrivalTime + '\'' + ", departureAirport=" + departureAirport
                +
                ", destinationAirport=" + destinationAirport + ", customers=" + customers + ", employees="
                +
                employees + ", plane=" + plane + ", duration='" + duration + '\'' + ", capacity=" + capacity
                +
                ", availableSeats=" + availableSeats + '}';
    }
}
