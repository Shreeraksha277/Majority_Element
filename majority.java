class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            
            // If count becomes 0, choose new candidate
            if (count == 0) {
                candidate = num;
            }

            // If same → increase count, else decrease
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Final candidate is the majority element
        return candidate;
    }
}
