class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses]; // 1. 남은 숙제 개수
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++) graph.add(new ArrayList<>());

        // 그래프 만들기 & 숙제 개수 세기
        for(int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        // 2. 당장 들을 수 있는(숙제 0개) 과목 찾기
        for(int i=0; i<numCourses; i++) {
            if(indegree[i] == 0) q.offer(i);
        }

        int count = 0; // 들은 수업 개수
        while(!q.isEmpty()) {
            int cur = q.poll();
            count++; // 수업 하나 들음

            // 3. 이 수업 들었으니, 다음 수업들의 숙제 개수 -1
            for(int next : graph.get(cur)) {
                indegree[next]--;
                if(indegree[next] == 0) q.offer(next); // 이제 들을 수 있으면 큐에 추가
            }
        }

        return count == numCourses; // 다 들었으면 성공
    }
}