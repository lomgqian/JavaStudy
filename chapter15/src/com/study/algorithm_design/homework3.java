package com.study.algorithm_design;
import java.util.Arrays;
/**
 * @date 2023/11/20 14:39
 */


public class homework3 {

    public static void main(String[] args) {
        int[] weights = {35, 30, 60, 50, 40, 10, 25};
        int[] values = {10, 40, 30, 50, 35, 40, 30};
        int capacity = 150;

        int result = knapsackGreedy(weights, values, capacity);
        System.out.println("Maximum value using greedy algorithm: " + result);
    }

    public static int knapsackGreedy(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        double[] ratios = new double[n];
        Integer[] sortedItems = new Integer[n];

        for (int i = 0; i < n; i++) {
            ratios[i] = (double) values[i] / weights[i];
            sortedItems[i] = i;
        }

        Arrays.sort(sortedItems, (i, j) -> Double.compare(ratios[j], ratios[i]));

        int totalValue = 0;
        int currentCapacity = capacity;

        for (int i : sortedItems) {
            if (weights[i] <= currentCapacity) {
                totalValue += values[i];
                currentCapacity -= weights[i];
            }
        }

        return totalValue;
    }
}
