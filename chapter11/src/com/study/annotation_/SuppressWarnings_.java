package com.study.annotation_;

import java.util.List;
import java.util.ArrayList;

/**
 * @date 2023/7/23 10:00
 */
@SuppressWarnings({"all"})//抑制所有警告，可选择，有不同挡位
//作用范围与所在位置有关
public class SuppressWarnings_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("marry");
        int i;
        System.out.println(list.get(1));
    }
}
//	可以指定的警告类型有
//        1)	all，抑制所有警告
//        2)	boxing，抑制与封装/拆装作业相关的警告
//        3)	cast，抑制与强制转型作业相关的警告
//        4)	dep-ann，抑制与淘汰注释相关的警告
//        5)	deprecation，抑制与淘汰的相关警告
//        6)	fallthrough，抑制与 switch 陈述式中遗漏 break 相关的警告
//        7)	finally，抑制与未传回 finally 区块相关的警告
//        8)	hiding，抑制与隐藏变数的区域变数相关的警告
//        9)	incomplete-switch，抑制与 switch 陈述式(enum case)中遗漏项目相关的警告
//        10)	javadoc，抑制与 javadoc 相关的警
//        11)	nls，抑制与非 nls 字串文字相关的警告
//        12)	null，抑制与空值分析相关的警告
//        13)	rawtypes，抑制与使用 raw 类型相关的警告（传参时没有指定泛型错误警告）
//        14)	resource，抑制与使用 Closeable 类型的资源相关的警告
//        15)	restriction，抑制与使用不建议或禁止参照相关的警告
//        16)	serial，抑制与可序列化的类别遗漏 serialVersionUID 栏位相关的警告
//        17)	static-access，抑制与静态存取不正确相关的警告
//        18)	static-method，抑制与可能宣告为 static 的方法相关的警告
//        19)	super，抑制与置换方法相关但不含 super 呼叫的警告
//        20)	synthetic-access，抑制与内部类别的存取未最佳化相关的警告
//        21)	sync-override，抑制因为置换同步方法而遗漏同步化的警告
//        22)	unchecked，抑制与未检查的作业相关的警告
//        23)	unqualified-field-access，抑制与栏位存取不合格相关的警告
//        24)	unused，抑制与未用的程式码及停用的程式码相关的警告