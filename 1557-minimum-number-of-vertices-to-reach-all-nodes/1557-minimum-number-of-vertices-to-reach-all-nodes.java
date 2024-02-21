class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> ans = new HashSet<Integer>();

        // collect reachable set
        for(List<Integer> edge : edges) {
            set.add(edge.get(1));
        }

        System.out.println(set.toString());

        for(List<Integer> edge : edges) {
            if(!set.contains(edge.get(0))) {
                ans.add(edge.get(0));
            }
        }

        return new ArrayList<Integer>(ans);
    }
}