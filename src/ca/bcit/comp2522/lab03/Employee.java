package ca.bcit.comp2522.lab03;

/**
 * Represents an Employee in a company.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Employee {

    /**
     * The name of the Employee.
     */
    private String name;
    /**
     * The identifier of the Employee.
     */
    private String employeeID;
    /**
     * The role of the Employee in the company.
     */
    private String role;

    /**
     * Constructs a new Employee with the specified name, identifier, and role.
     *
     * @param name       the name of the Employee
     * @param employeeID the identifier of the Employee
     * @param role       the role of the Employee in the company
     */
    public Employee(
            final String name,
            final String employeeID,
            final String role) {
        this.name = name;
        this.employeeID = employeeID;
        this.role = role;
    }

    /**
     * Returns the name of this Employee.
     *
     * @return the name of this Employee
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the identifier of this Employee.
     *
     * @return the identifier of this Employee
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Returns the role of this Employee in the company.
     *
     * @return the role of this Employee in the company
     */
    public String getRole() {
        return role;
    }

    /**
     * Returns a String representation of this Employee.
     *
     * @return a String representation of this Employee
     */
    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", employeeID='"
                +
                employeeID + '\'' + ", role='" + role + '\'' + '}';
    }
}
