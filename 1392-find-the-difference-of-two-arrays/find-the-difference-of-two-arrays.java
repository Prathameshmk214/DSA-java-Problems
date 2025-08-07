class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        // Check elements in nums1 that are not in nums2
        for (int i = 0; i < nums1.length; i++) {
            int count = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] != nums2[j]) {
                    count++;
                }
            }
            // if count == nums2.length, means no match found
            if (count == nums2.length && !one.contains(nums1[i])) {
                one.add(nums1[i]);
            }
        }

        // Check elements in nums2 that are not in nums1
        for (int j = 0; j < nums2.length; j++) {
            int count = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (nums2[j] != nums1[i]) {
                    count++;
                }
            }
            if (count == nums1.length && !two.contains(nums2[j])) {
                two.add(nums2[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(one);
        ans.add(two);
        return ans;
    }
}
