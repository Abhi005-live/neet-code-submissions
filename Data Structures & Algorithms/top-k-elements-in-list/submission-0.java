
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Step 2: Bucket array (index = frequency)
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : count.keySet()) {
            int freq = count.get(num);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        // Step 3: Collect top k
        int[] res = new int[k];
        int idx = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[idx++] = num;
                    if (idx == k) return res;
                }
            }
        }

        return res;
    }
}