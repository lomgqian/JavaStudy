package com.Study;

/**
 * @date 2024/1/12 15:47
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        int cpunum=runtime.availableProcessors();
        System.out.println(cpunum);
    }
}
