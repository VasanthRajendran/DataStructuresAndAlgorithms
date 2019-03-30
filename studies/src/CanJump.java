public class CanJump {

    public boolean canJump(int[] nums) {
        int maxIndex = nums.length-1;
        int maxJump  = nums[0];
        for(int i = 0; i <= maxJump; i++){
            maxJump=Math.max(maxJump,i+nums[i]);
            if(maxJump>=maxIndex) return true;
        }
        return false;
    }

    public static void main(String args[]) {
        new CanJump().canJump(new int[]{2,3,5});
    }
}
