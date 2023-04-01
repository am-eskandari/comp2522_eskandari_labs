package ca.bcit.comp2522.lab08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Represents an undirected graph and provides methods to find the shortest path between nodes.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Graph {
    private final List<Node> nodes;

    public Graph(String fileName) throws IOException {
        nodes = new ArrayList<>();
        Path filePath = Paths.get("src/ca/bcit/comp2522/lab08/" + fileName);
        List<String> fileLines = Files.readAllLines(filePath);

        int nodeId = 0;
        for (String line : fileLines) {
            Node node = new Node(nodeId);
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '1') {
                    Node neighbor;
                    if (i >= nodes.size()) {
                        neighbor = new Node(i);
                        nodes.add(neighbor);
                    } else {
                        neighbor = nodes.get(i);
                    }
                    node.addNeighbor(neighbor);
                }
            }
            nodes.add(node);
            nodeId++;
        }
    }

    public List<Node> findShortestPath(int startId, int endId) {
        if (startId >= nodes.size() || endId >= nodes.size()) {
            return null;
        }
        Node startNode = nodes.get(startId);
        Node endNode = nodes.get(endId);

        Queue<List<Node>> queue = new LinkedList<>();
        List<Node> startPath = new ArrayList<>();
        startPath.add(startNode);
        queue.add(startPath);

        while (!queue.isEmpty()) {
            List<Node> currentPath = queue.poll();
            Node currentNode = currentPath.get(currentPath.size() - 1);

            if (currentNode.getId() == endNode.getId()) {
                return currentPath;
            }

            for (Node neighbor : currentNode.getNeighbors()) {
                if (!currentPath.contains(neighbor)) {
                    List<Node> newPath = new ArrayList<>(currentPath);
                    newPath.add(neighbor);
                    queue.add(newPath);
                }
            }
        }
        return null;
    }
}
