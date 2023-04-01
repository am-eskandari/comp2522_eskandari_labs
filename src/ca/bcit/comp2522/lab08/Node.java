package ca.bcit.comp2522.lab08;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a node in an undirected graph.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Node {
    private final int id;
    private final List<Node> neighbors;

    /**
     * Constructs a new Node with the specified ID.
     *
     * @param id the unique identifier of the Node
     */
    public Node(final int id) {
        this.id = id;
        neighbors = new ArrayList<>();
    }

    /**
     * Returns the ID of this Node.
     *
     * @return the unique identifier of the Node
     */
    public int getId() {
        return id;
    }

    /**
     * Adds a neighboring Node to the list of neighbors.
     *
     * @param neighbor the neighboring Node to be added
     */
    public void addNeighbor(final Node neighbor) {
        neighbors.add(neighbor);
    }

    /**
     * Returns the list of neighboring Nodes.
     *
     * @return a List of neighboring Nodes
     */
    public List<Node> getNeighbors() {
        return neighbors;
    }

}
