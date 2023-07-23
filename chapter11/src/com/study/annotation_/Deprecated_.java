package com.study.annotation_;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @date 2023/7/23 9:50
 */
public class Deprecated_ {
    public static void main(String[] args) {

    }
}
@Deprecated//修饰某个元素，表示其已经过时
    //可以修饰方法，类，字段，包，参数
    //源码
//@Documented
//@Retention(RetentionPolicy.RUNTIME)
//@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
//public @interface Deprecated {
//}
    //用于版本升级过渡
class A{
    public int n1=10;
    public void hi(){

    }
}