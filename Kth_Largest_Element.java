class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<Integer>() ;  //By default priority queue is a Min Heap. Min Heap keeps maximum value in the root.
        
        for(int i:nums)
        {
            minHeap.add(i);
            if(minHeap.size()>k)        //we did not use size -1 because we want to return the kth largest at the end.
            {
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}