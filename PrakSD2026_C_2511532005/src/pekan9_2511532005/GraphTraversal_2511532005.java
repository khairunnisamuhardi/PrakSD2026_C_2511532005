package pekan9_2511532005;
import java.util.*;

public class GraphTraversal_2511532005 {
	private Map <String, List <String>> graph_2005 = new HashMap <> ();
	
	// menambahkan edge (graf tak berarah)
	public void addEdge_2005(String node1_2005, String node2_2005) {
		graph_2005.putIfAbsent(node1_2005, new ArrayList<>());
		graph_2005.putIfAbsent(node2_2005, new ArrayList<>());
		graph_2005.get(node1_2005).add(node2_2005);
		graph_2005.get(node2_2005).add(node1_2005);
	}
	// menampilkan graph awal
	public void printGraph_2005() {
		System.out.println("Graf awal (Adjacency List): ");
		for (String node_2005 : graph_2005.keySet()) {
			System.out.print(node_2005 + " -> ");
			List<String> neighbors = graph_2005.get(node_2005);
			System.out.println(String.join(", ", neighbors));
		}
		System.out.println();
	}
	
	// DFS rekrusif
	public void dfs_2005 (String start_2005) {
		Set <String> visited_2005 = new HashSet <> ();
		System.out.println("Penelusuran DFS: ");
		dfsHelper_2005 (start_2005, visited_2005);
		System.out.println();
	}
	private void dfsHelper_2005 (String current_2005, Set <String> visited_2005) {
		if (visited_2005.contains (current_2005)) return;
		visited_2005.add(current_2005);
		System.out.print(current_2005 + " ");
		for (String neighbor_2005 : graph_2005.getOrDefault(current_2005, new ArrayList<>())) {
			dfsHelper_2005 (neighbor_2005, visited_2005);
		}
	}
	//BFS iteratif
	public void bfs_2005(String start_2005) {
		Set<String> visited_2005 = new HashSet<>();
		Queue<String> queue_2005 = new LinkedList<>();
		queue_2005.add(start_2005);
		visited_2005.add(start_2005);
		System.out.println("Penelusuran BFS: ");
		while (!queue_2005.isEmpty()) {
			String current_2005 = queue_2005.poll();
			System.out.print(current_2005 + " ");
			for (String neighbor_2005 : graph_2005.getOrDefault(current_2005, new ArrayList<>())) {
				if (!visited_2005.contains (neighbor_2005)) {
					queue_2005.add(neighbor_2005);
					visited_2005.add(neighbor_2005);
				}
			}
		}
		System.out.println();
	}
	// main
	public static void main(String[] args) {
		GraphTraversal_2511532005 graph_2005 = new GraphTraversal_2511532005();
		
		// contoh graf: A-B, A-C, B-D, B-E
		graph_2005.addEdge_2005("A", "B");
		graph_2005.addEdge_2005("A", "C");
		graph_2005.addEdge_2005("B", "D");
		graph_2005.addEdge_2005("B", "E");
		//cetak graf awal
		System.out.println("Graf Awal adalah : ");
		graph_2005.printGraph_2005();
		// Lakukan penelusuran
		graph_2005.dfs_2005("A");
		graph_2005.bfs_2005("A");
		
	}
}
