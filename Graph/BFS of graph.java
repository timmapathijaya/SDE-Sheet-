class Solution {
    public void bfsTraversal(int vertex , int[] visited , ArrayList<Integer> bfs , ArrayList<ArrayList<Integer>> adj)
    {
        visited[vertex] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        
        while(queue.isEmpty() == false)
        {
            vertex = queue.poll();
            bfs.add(vertex);
            
            for(Integer adjNode : adj.get(vertex))
            {
                if(visited[adjNode] == 0)
                {
                    visited[adjNode] = 1;
                    queue.add(adjNode);
                }
            }
        }
        
    }
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer> bfs = new ArrayList<>();
       int visited[] = new int[V];
       bfsTraversal(0 , visited , bfs , adj);
       return bfs;
    }
}
