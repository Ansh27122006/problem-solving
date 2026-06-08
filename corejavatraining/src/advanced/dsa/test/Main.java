//package advanced.dsa.test;
//import java.util.*;
//
//class Solution {
//    public List<List<Integer>> powerSet(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> list=new ArrayList<>();
//        generate(nums, nums.length-1, list, ans);
//        return ans;
//    }
//    public void generate(int[] nums, int i, List<Integer> list, List<List<Integer>> ans){
//        if(i<0){
//            Collections.sort(list);
//            ans.add(new ArrayList<>(list));
//            return;
//        }
//        generate(nums,i-1,list,ans);
//        list.add(nums[i]);
//        generate(nums,i-1,list,ans);
//        list.removeLast();
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] arr={1,2,3};
//        System.out.println(sol.powerSet(arr));
//    }
//}

package advanced.dsa.test;
import java.util.*;

class Solution {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        return check(nums, 0, 0, k);
    }
    public boolean check(int[] nums, int i, int sum , int k){
        if(i>=nums.length){
            if(sum==k) return true;
            return false;
        }
        return check(nums, i+1, sum, k) || check(nums, i+1, sum+nums[i], k);
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr={4, 3, 9, 2};
        System.out.println(sol.checkSubsequenceSum(arr,10));
    }
}
