class Solution {
    private int target;
    private int[][] graph;
    private List<List<Integer>> result;
    protected void backtrack(int currentNode, LinkedList<Integer> path){
        if(currentNode == this.target){
            this.result.add(new ArrayList<Integer>(path));
            return;
        }
        for(int nextNode : this.graph[currentNode]){
            path.addLast(nextNode);
            this.backtrack(nextNode,path);
            path.removeLast();
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.target = graph.length - 1;
        this.graph = graph;
        this.result = new ArrayList<List<Integer>>();
        LinkedList<Integer> path = new LinkedList<Integer>();
        path.addLast(0);
        this.backtrack(0,path);
        return this.result;
    }
}