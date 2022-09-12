class Solution {
    public void dfsTraversal(int node , boolean[] visited , ArrayList<Integer> dfs , ArrayList<ArrayList<Integer>> adj)
    {
        visited[node] = true;
        dfs.add(node);
        
        for(Integer adjNode : adj.get(node))
        {
            if(visited[adjNode] == false)
            dfsTraversal(adjNode , visited , dfs , adj);
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer> dfs = new ArrayList<>();
       boolean visited[] = new boolean[V];
       
       dfsTraversal(0 , visited , dfs , adj);
       
       return dfs;
    }
}
