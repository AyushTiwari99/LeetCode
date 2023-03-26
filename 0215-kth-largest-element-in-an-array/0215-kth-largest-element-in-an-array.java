class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int ele : nums){
            q.add(ele);
        }
        while((q.size() - k) > 0){
            q.poll();
        }
        return q.peek();
    }
}