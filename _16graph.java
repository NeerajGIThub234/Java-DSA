import java.util.ArrayList;
import java.util.Scanner;
class Graph {
    static Scanner s=new Scanner(System.in);
    public static int[][] createGraph(int v){
        int[][] adjMat=new int[v][];
        for(int i=0;i<v;i++){
            System.out.print("enter number of adjacent vertices of vertex "+i+": ");
            int n=Integer.parseInt(s.nextLine());
            int[] arr=new int[n];
            System.out.println("enter adjacent vertices of vertex "+i+": ");
            for(int j=0;j<n;j++){
                arr[j]=Integer.parseInt(s.nextLine());
            adjMat[i]=arr;
            }
        }
        return adjMat;
    }
    public static void traverse(int[][] adjMat,int v){
        for(int i=0;i<v;i++){
            System.err.print("adjacent vertices of vertex "+i+": ");
            for(int ele:adjMat[i])
                  System.out.print(ele+" ");
            System.out.println();
        }
    }
    public static ArrayList<Integer> bfs(int [][] adjMat,int v,int start){
        int[] visited=new int[v];
        ArrayList<Integer> queue=new ArrayList<Integer>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        visited[start]=1;
        queue.add(start);
        result.add(start);
        while (queue.size()>0) {
            int ele=queue.remove(0);
            for(int adj:adjMat[ele]){
                if (visited[adj]==0) {
                    visited[adj]=1;
                    result.add(adj);
                    queue.add(adj);
                }
            }
        }
    return result;
    }
    public static void dfs(int[][] adjMat,int v,int start,int[] visited){
        System.out.print(start+" ");
        visited[start]=1;
        for(int adj:adjMat[start]){
            if (visited[adj]==0) {
                dfs(adjMat, v,adj, visited);
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("enter number of vertices: ");
        int v=Integer.parseInt(s.nextLine());
        int[][] graph=createGraph(v);
        traverse(graph, v);
        System.out.println("enter the vertex from which you want to start bfs: ");
        int start=Integer.parseInt(s.nextLine());
        ArrayList<Integer> bfsResult=bfs(graph, v, start);
        System.out.println(bfsResult);
        System.out.print("enter the vertex from which you want to start dfs: ");
        int dfsStart=Integer.parseInt(s.nextLine());
        int[] visited=new int[v];
        dfs(graph, v, dfsStart, visited);
    }
}
