class Pair{
    int vtx;
    int lv;
    public Pair(int vtx, int lv){
        this.vtx = vtx;
        this.lv = lv;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, Integer> vis = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        for(int src=0; src<graph.length; src++){
            if(vis.containsKey(src)){
                continue;
            }
            q.add(new Pair(src, 0));
            while(!q.isEmpty()){
                Pair rv = q.poll();
                if(vis.containsKey(rv.vtx)){
                    if(rv.lv != vis.get(rv.vtx)){
                        return false;
                    }
                    else{
                        continue;
                    }
                }
                vis.put(rv.vtx, rv.lv);
                
                for(int i : graph[rv.vtx]){
                    if(!vis.containsKey(i)){
                        q.add(new Pair(i, rv.lv+1));
                    }
                }
            }
        }
        return true;
    }
}