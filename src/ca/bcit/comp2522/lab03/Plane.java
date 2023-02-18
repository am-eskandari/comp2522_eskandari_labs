package ca.bcit.comp2522.lab03;


/**
 * Plane class represents a plane with plane name, plane ID, and capacity.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Plane {
    /**
     * The name of the plane.
     */
    private String planeName;

    /**
     * The ID of the plane.
     */
    private String planeId;

    /**
     * The number of seats on the plane.
     */
    private int capacity;


    /**
     * Constructs a new Plane object with given parameters.
     *
     * @param newPlaneName The name of the plane
     * @param newPlaneId   The ID of the plane
     * @param newCapacity  The number of seats on the plane
     */
    Plane(final String newPlaneName, final String newPlaneId, final int newCapacity) {
        this.planeName = newPlaneName;
        this.planeId = newPlaneId;
        this.capacity = newCapacity;
    }


    /**
     * Getter method for the plane name.
     *
     * @return The name of the plane
     */
    public String getPlaneName() {
        return planeName;
    }

    /**
     * Getter method for the plane ID.
     *
     * @return The ID of the plane
     */
    public String getPlaneId() {
        return planeId;
    }

    /**
     * Getter method for the capacity of the plane.
     *
     * @return The number of seats on the plane
     */
    public int getCapacity() {
        return capacity;
    }


    /**
     * Returns a string representation of this Plane object.
     *
     * @return A string representation of this Plane object
     */
    @Override
    public String toString() {
        return "Plane{" + "planeName='" + planeName + '\''
                +
                ", planeId='" + planeId + '\'' + ", capacity=" + capacity + '}';
    }
}

