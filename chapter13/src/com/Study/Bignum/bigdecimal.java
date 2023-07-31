package com.Study.Bignum;

import java.math.BigDecimal;

/**
 * @date 2023/7/30 11:37
 */
public class bigdecimal {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1999.74382749762357832758634562349572349857893475934");
        BigDecimal bigDecimal2 = new BigDecimal("199.79572349857893475934");
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.divide(bigDecimal2,BigDecimal.ROUND_CEILING));
    }
}
