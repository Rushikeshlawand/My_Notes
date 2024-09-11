import java.util.Scanner;

 class GraphMatrix {

    private int[][] adjacencyMatrix;
    private int vertices;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
    }

    public void displayMatrix() {
        System.out.println("Adjacency Matrix");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    public class MainMatrix {
        public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = sc.nextInt();
        GraphMatrix graph = new GraphMatrix(vertices) ;
        System.out.print("Enter the number of edges: ");
        int edges = sc.nextInt();
        System.out.println("Enter the edges (source and destination): ");
        for (int i = 0; i < edges; i++) {
        int source = sc.nextInt();
        int destination = sc.nextInt();
        graph.addEdge (source, destination);
        graph.displayMatrix();
        }
}
    }