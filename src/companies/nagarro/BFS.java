package companies.serviceNow;

import java.util.*;
import java.util.stream.Collectors;

public class BFS {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = 5;
        int m = 3;
        ArrayList<Integer> edge1 = new ArrayList<>();
        edge1.add(2);
        edge1.add(3);
        ArrayList<Integer> edge2 = new ArrayList<>();
        edge2.add(1);
        ArrayList<Integer> edge3 = new ArrayList<>();
        edge3.add(1);
        edge3.add(4);
        ArrayList<Integer> edge4 = new ArrayList<>();
        edge3.add(3);
        //edge3.add(4);
        adj.add(new ArrayList<>());
        adj.add(edge1);
        adj.add(edge2);
        adj.add(edge3);
        adj.add(edge4);
        adj.add(new ArrayList<>());
        int distance[] = new int[n-1];
        List<Integer> bfs = bfs(n, m, adj, 1);

        for(int x : bfs){
            System.out.print(x+" ");
        }
//        int src = 1;
//        for(int dest = 1,j=0; dest<=n ;dest++){
//            if(dest == src){
//                continue;
//            }
//            int dist = bfs1(n,m,adj,src,dest);
//            if(dist != -1){
//                dist = dist*6;
//            }
//            distance[j++] = dist;
//        }
//        for(int x : distance)
//            System.out.print(x + " ");
    }

    public static List<Integer> bfs(int n, int m, List<List<Integer>> adj, int source) {
        int distance[] = new int[n-1];
        for(int destination = 1,j=0; destination<=n ;destination++){
            if(destination == source){
                continue;
            }
            int dist = bfs1(n,m,adj,source,destination);
            if(dist != -1){
                dist = dist*6;
            }
            distance[j++] = dist;
        }
        List<Integer> intList = new ArrayList<Integer>(distance.length);
        for (int i : distance) {
            intList.add(i);
        }
        return intList;
    }
    public static int bfs1(int n, int m, List<List<Integer>> adj, int source, int dest) {
        boolean vis[] = new boolean[adj.size()];
        int parent[] = new int[adj.size()];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        parent[source] = -1;
        vis[source] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur == dest) break;

            for(int neighbour : adj.get(cur)){
                if(!vis[neighbour]){
                    vis[neighbour] = true;
                    q.add(neighbour);
                    parent[neighbour] = cur;
                }
            }
        }
        int cur = dest;
        int distance = 0;
        while(parent[cur] != -1){
            if(parent[cur] == 0){
                distance = -1;
                break;
            }
            cur = parent[cur];
            distance++;
        }
        return distance;
    }
}
