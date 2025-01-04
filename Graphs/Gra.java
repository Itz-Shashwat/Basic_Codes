import java.util.*;

class datastructure {
    int source;
    int destination;

    // Constructor
    datastructure(int s, int d) {
        this.source = s;
        this.destination = d;
    }
}

public class Gra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = 10;

        // Create an array of ArrayLists to represent the graph
        ArrayList<datastructure> graph[] = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<datastructure>();
        }

        // Add edges to the graph
        graph[0].add(new datastructure(0, 1));
        graph[1].add(new datastructure(1, 2));
        graph[1].add(new datastructure(1, 3));
        graph[2].add(new datastructure(2, 3));

        // Traverse and print the graph
        for (int i = 0; i < graph.length; i++) {
            if (!graph[i].isEmpty()) {
                System.out.print("Vertex " + i + " has edges to: ");
                for (datastructure edge : graph[i]) {
                    System.out.print(edge.destination + " ");
                }
                System.out.println();
            }
        }
    }
}
