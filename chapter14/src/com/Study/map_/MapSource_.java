package com.Study.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @date 2023/10/6 20:57
 */
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","yjj");//K-V
        map.put("no2","ddd");//K-V
        Set set = map.entrySet();
    }
}
