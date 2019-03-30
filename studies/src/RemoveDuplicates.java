public class RemoveDuplicates {



        public int removeDuplicates(int[] nums) {

            int k = 0;
            int i=0;
            while(i<nums.length-1) {
                if(nums[i] == nums[i+1]) {
                    while(i < nums.length-1 && nums[i] == nums[i+1]){
                        i++;
                    }
                    //System.out.println(i);
                    nums[k++] = nums[i];
                } else{
                    nums[k++] = nums[i];
                }
                i++;
            }
            return k;
        }


        public static void main(String args[]){
            new RemoveDuplicates().removeDuplicates(new int[]{1,1,2});
        }
    }

