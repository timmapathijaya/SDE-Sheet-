class Solution {
    public void dfsTraversal(int currNode , ArrayList<ArrayList<Integer>> adj , 
    ArrayList<Integer> dfs , boolean[] visited)
    {
        visited[currNode] = true;
        dfs.add(currNode);
        for(Integer adjNode : adj.get(currNode))
        {
            if(!visited[adjNode])
            dfsTraversal(adjNode , adj , dfs , visited);
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsTraversal(0 , adj , dfs , visited);
        return dfs;
        
    }
}
// TC : O(V + 2E)
// SC : N[Visited-Array] + N[Recursive Stack-Space]
