import java.util.ArrayList;
import java.util.*;

public class KillProcess {
/*    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        if (kill == 0) return pid;

        int n = pid.size();
        Map<Integer, Set<Integer>> tree = new HashMap<>();
        for (int i = 0; i < n; i++) {
            tree.put(pid.get(i), new HashSet<Integer>());
        }
        for (int i = 0; i < n; i++) {
            if (tree.containsKey(ppid.get(i))) {
                Set<Integer> children = tree.get(ppid.get(i));
                children.add(pid.get(i));
                tree.put(ppid.get(i), children);
            }
        }

        List<Integer> result = new ArrayList<>();
        traverse(tree, result, kill);

        return result;
    }

    private void traverse(Map<Integer, Set<Integer>> tree, List<Integer> result, int pid) {
        result.add(pid);

        Set<Integer> children = tree.get(pid);
        for (Integer child : children) {
            traverse(tree, result, child);
        }
    }

    public static void main(String args[]) {
        KillProcess k = new KillProcess();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        k.killProcess();
    }*/

        public List<List<Integer>> threeSum(int[] nums) {

            Arrays.sort(nums);
            List<List<Integer>>  list = new ArrayList<>();
            for(int i=0;i<nums.length-1;i++) {
                int k=nums.length-1;
                int j = i+1;
                while(j<k) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> sub = new ArrayList<>();
                        sub.add(nums[i]);
                        sub.add(nums[j]);
                        sub.add(nums[k]);
                        list.add(sub);
                        j++;
                        k--;
                        while(j<k && nums[j] == nums[j-1]) {
                            j++;
                        }
                        while(k>j && nums[k] == nums[k+1]){
                            k--;
                        }
                    } else if (nums[i] + nums[j] + nums[k] < 0) {
                        j++;
                    } else {
                        k--;
                    }
                }

            }
            return list;
        }

        public static void main(String args[]) {
            KillProcess threeSum = new KillProcess();
            int arr[] = {-1,0,1,2,-1,-4};
            threeSum.threeSum(arr);
        }
    }
