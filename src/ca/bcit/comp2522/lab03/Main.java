package ca.bcit.comp2522.lab03;

/**
 * Main class that creates objects and tests their functionality.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Main {
    /**
     * Main method that creates objects and tests their functionality.
     *
     * @param args String array of command line arguments.
     */
    public static void main(String[] args) {

        // Airport Object
        Airport yvr = new Airport("Vancouver", "YVR");
        Airport nrt = new Airport("Narita", "NRT");

        // Plane, Renter and Flight Object
        int capacity = 375;
        Plane boeing767 = new Plane("Boeing 767", "001", capacity);
        Renter rentedPlane = new Renter("ABC Agency", boeing767);
        Flight demeterAirlines = new Flight("AC130", "10:00", "19:00",
                yvr, nrt, boeing767, capacity, "10H 30M");

        // Customer Object
        Customer customerOne = new Customer("Amir Eskandari", "1234 5678 1111 2222",
                new Seat("A1", "Economy", true));
        Customer customerTwo = new Customer("Wilson Sue", "1111 2222 3333 4444",
        new Seat("A2", "Economy", true));

        System.out.println("Testing add/remove customers: \n");
        demeterAirlines.addCustomer(customerOne);
        demeterAirlines.removeCustomer(customerOne);
        demeterAirlines.removeCustomer(customerOne);
        demeterAirlines.addCustomer(customerTwo);
        System.out.println();

        // Employee Object
        Employee employeeOne = new Employee("John Doe", "P01", "Pilot");
        Employee employeeTwo = new Employee("Jane Doe", "A01", "Flight Attendant");

        System.out.println("Testing add/remove customers: \n");
        demeterAirlines.addEmployee(employeeOne);
        demeterAirlines.removeEmployee(employeeOne);
        demeterAirlines.removeEmployee(employeeOne);
        demeterAirlines.addEmployee(employeeTwo);
        System.out.println();

        // Demeter Airlines
        System.out.println("Demeter Airline Information\n");

        System.out.println("Plane: " + rentedPlane.getPlane().getPlaneName() + ", ID: "
                + rentedPlane.getPlane().getPlaneId() + ", " + "Capacity: " + rentedPlane.getPlane().getCapacity());
        System.out.println("Departure Airport: " + demeterAirlines.getDepartureAirport().getAirportID() + ", "
                +
                demeterAirlines.getDepartureAirport().getLocation());
        System.out.println("Arrival Airport: " + demeterAirlines.getDestinationAirport().getAirportID() + ", "
                +
                demeterAirlines.getDestinationAirport().getLocation());
        System.out.println("Departure Time: " + demeterAirlines.getDepartureTime());
        System.out.println("Arrival Time: " + demeterAirlines.getArrivalTime());
        System.out.println(rentedPlane.getRenterCompany()
                +
                " is renting out, " + rentedPlane.getPlane());
        System.out.println("Flight Number: " + demeterAirlines.getFlightNumber());
        System.out.println("Flight Duration: " + demeterAirlines.getDuration());
        System.out.println("Flight Capacity: " + demeterAirlines.getCapacity());
        System.out.println("Flight Available Seats: " + demeterAirlines.getAvailableSeats());
        System.out.println("Customer Two: " + customerTwo.getName() + "; Card: " + customerTwo.getCreditCardNumber()
                + "; Seat: " + customerTwo.getSeat().getSeatNumber() + ", " + customerTwo.getSeat().getSeatClass()
                + ", Available: " + customerTwo.getSeat().getIsBooked());
        System.out.println("Employee One: " + employeeOne.getName() + "; ID: " + employeeOne.getEmployeeID()
                + "; Role: " + employeeOne.getRole());


    }
}
