package A23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class B10_Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums,target));

    }
    public static ArrayList<Integer> twoSum(int[] nums ,int target){
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            if (nums[start]+nums[end]==target){
                list.add(start);
                list.add(end);
                return list;
            }
            else if (nums[start]+nums[end]<target) {
                start++;
            }
            else{
                end--;
            }
        }
        return list;
    }
}
