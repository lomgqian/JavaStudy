package com.Study.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2023/10/5 21:03
 */
public class map_ {
    public static void main(String[] args) {
//map和collection并列存在
        //key和value都可以为null，但key只能有一个null。用为不能重复。
        //而value可以有很多个
        //debug的再练练
        //常用String作为Map的Key
        //通过get方法传入key，会返回对应的value
        Map map = new HashMap();
        map.put("no1","yjj");//K-V
        map.put("no2","ddd");//K-V
        map.put("no1","aaa");//有相同的k，就相当于替换
        map.put(null,"abc");
        map.put(null,null);
        map.put(111,"也可以");
        map.put(new Object(),"韩顺平是真的喜欢金庸啊");
        System.out.println(map);
        System.out.println(map.get("no1"));
    }
}
