1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        for (int i = 0; i <= nums.length; i++) {
7            int complement = target - nums[i];
8
9            if (map.containsKey(complement)) {
10                return new int[] { map.get(complement), i };
11            }
12            map.put(nums[i], i);
13
14        }
15        return new int[] {};
16    }
17
18}
19