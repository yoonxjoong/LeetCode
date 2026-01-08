/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private HashMap<Node, Node> map = new HashMap<Node, Node>();
    // 그래프 탐색 (BFS/DFS) + HashMap 사용
    public Node cloneGraph(Node node) {

        // 종료 조건
        // 입력 노드가 null이면 null반환
        if(node == null) {
            return null;
        }

        // 현재 노드가 맵에 존재한다면 반환(복제된적이 있음) 복제된 노드 반환
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // 아직 방문하지 않은 노드라면? 새로운 노드 객체 생성
        Node newNode = new Node(node.val);

        // Hashmap에 저장
        map.put(node, newNode);

        // 원본 노드의 neighbors 리스트를 순회
        for(Node neighbor : node.neighbors) {
            // 재귀적으로 함수를 호출하여 반환된 노드(복제된 이웃)을 현재 복제 노드의 neighbor 리스트에 추가
            newNode.neighbors.add(cloneGraph(neighbor));
        }

        // 완성된 복제 노드 반환
        return newNode;
    }
}