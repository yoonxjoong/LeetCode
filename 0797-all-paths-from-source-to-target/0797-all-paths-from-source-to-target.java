class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> path = new ArrayList<>();

        dfs(graph, 0, graph.length-1, path, result);
        
        return result;
    }

    private void dfs(int[][] graph, int current, int target, List<Integer> path, List<List<Integer>> result) {
        path.add(current);
        if(current == target){
            result.add(new ArrayList<>(path));
        }else{
            for(int neighbor : graph[current]){
                dfs(graph, neighbor, target, path, result);
            }
        }
        path.remove(path.size() - 1);
    }
}