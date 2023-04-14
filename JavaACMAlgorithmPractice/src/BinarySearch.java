public class BinarySearch{
    //力扣704

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
            BinarySearch sol = new BinarySearch();
            int[] nums = {1, 2, 3, 4, 5, 6};
            int target = 4;
            System.out.println(sol.search(nums, target));
    }
}