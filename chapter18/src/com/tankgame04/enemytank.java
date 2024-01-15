package com.tankgame04;

import java.util.Vector;

/**
 * @date 2024/1/11 17:20
 */
public class enemytank extends tank {
    Vector<shot> shots=new Vector<>();
    public enemytank(int x, int y, int direct) {
        super(x, y, direct);
    }
}
