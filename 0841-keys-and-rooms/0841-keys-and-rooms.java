class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> tmp = new HashSet<>();

        for (int i = 0; i < rooms.size(); i++) {
            for (int j = 0; j < rooms.get(i).size(); j++) {
                graph.computeIfAbsent(i, k -> new ArrayList<>()).add(rooms.get(i).get(j));
            }
        }
        dfs(graph, 0, tmp);

        return tmp.size() == rooms.size();
    }

    private void dfs(Map<Integer, List<Integer>> graph, int current, Set<Integer> tmp) {
        if (tmp.contains(current)) {
            return;
        }
        tmp.add(current);

        for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
            dfs(graph, neighbor, tmp);
        }
    }
}