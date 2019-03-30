public class FindPeakElement {
     public int findPeakElement(int[] nums) {
         int n = nums.length;
         int lo = 0, hi = n - 1;
         while(lo < hi) {
             int mid = lo + (hi - lo) / 2;
             if(nums[mid] < nums[mid+1]) {
                 lo = mid + 1;
             } else {
                 hi = mid;
             }
         }
         return lo;
        }
    public static void main(String args[]) {
         FindPeakElement findPeakElement = new FindPeakElement();
         findPeakElement.findPeakElement(new int[]{1,2,1,3,5,6,4});
    }
}
