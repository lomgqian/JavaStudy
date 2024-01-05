package com.study.algorithm_design;
import java.util.ArrayList;
import java.util.List;
/**
 * @date 2023/12/1 18:07
 */
public class homework4 {
    public static void main(String[] args) {
        SubsetsGenerator subsetsGenerator = new SubsetsGenerator();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsetsGenerator.subsets(nums);

        // 打印结果
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
 class SubsetsGenerator {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, new ArrayList<>(), nums, result);
        return result;
    }

    private void backtrack(int start, List<Integer> path, int[] nums, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(i + 1, path, nums, result);
            path.remove(path.size() - 1);
        }
    }}