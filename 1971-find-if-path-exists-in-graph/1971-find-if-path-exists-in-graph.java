class Solution {
     public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        for(int[] edge : edges){
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }

        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            List<Integer> neighbors = entry.getValue();
            for (Integer neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        queue.offer(source);
        visited.add(source);

        while(!queue.isEmpty()){
            int current = queue.poll();

            if(current == destination){
                return true;
            }

            for(int neighbor : graph.getOrDefault(current, Collections.emptyList())){
                System.out.printf("%d, %d \n",neighbor, current);
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }

        }

        return false;
    }
}