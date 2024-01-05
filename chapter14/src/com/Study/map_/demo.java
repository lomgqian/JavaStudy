package com.Study.map_;

/**
 * @date 2023/10/20 20:29
 */
public class demo {

    public static void main(String[] args) {
        hanoiTower(3, 'A', 'B', 'C');
    }

    private static void hanoiTower(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println("第1个盘子从" + a + "->" + c);
        } else {
            hanoiTower(num - 1, a, c, b);
            System.out.println("第" + num + "个盘子从" + a + "->" + c);
            hanoiTower(num - 1, b, a, c);
        }
    }
}
