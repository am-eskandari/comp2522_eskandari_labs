package ca.bcit.comp2522.lab08;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Main class for the shortest path problem in an undirected graph.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class GraphDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the adjacency matrix file name: ");
        String fileName = scanner.nextLine();

        try {
            Graph graph = new Graph(fileName);

            System.out.print("Enter the start node ID: ");
            int startId = scanner.nextInt();

            System.out.print("Enter the end node ID: ");
            int endId = scanner.nextInt();

            List<Node> shortestPath = graph.findShortestPath(startId, endId);

            if (shortestPath != null) {
                System.out.println("There is a path of length " + (shortestPath.size() - 1) + " between nodes " + startId + " and " + endId);
                System.out.print("Path: ");
                for (Node node : shortestPath) {
                    System.out.print(node.getId() + " ");
                }
                System.out.println();
            } else {
                System.out.println("No path found.");
            }
        } catch (IOException e) {
            System.err.println("Error reading the adjacency matrix file: " + e.getMessage());
        }
    }
}
