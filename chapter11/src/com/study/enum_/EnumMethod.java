package com.study.enum_;

/**
 * @date 2023/7/22 10:31
 */
public class EnumMethod {
    public static void main(String[] args) {
Season3 autumn=Season3.AUTUMN;//演示enum的各种方法
        System.out.println(autumn.name());//输出枚举对象的名字
        System.out.println(autumn.ordinal());//输出枚举对象的序号，从0开始编号
        //Season3.values();//从反编译可以看出values方法，返回Season3[],含有定义的所有枚举对象
        Season3[] values=Season3.values();
        System.out.println("--------------遍历取出枚举对象（增强for）-------------------");
        for(Season3 season3:values){
            System.out.println(season3);
        }
        //ValueOf:将字符串转换成枚举对象，要求字符串必须为已经有的常量名，否则报异常
        Season3 autumn1=Season3.valueOf("AUTUMN");
        System.out.println("autumn1="+autumn1);
        //CompareTo比较两个枚举变量，比较的就是编号
        System.out.println(Season3.WINTER.compareTo(Season3.AUTUMN));

//        int[] num={1,2,9};
//        //普通for循环
//        System.out.println("----------普通for循环-----------");
//        for (int i=1;i<num.length;i++) {
//            System.out.println(num[i]);
//        }
//        //增强for循环
//        System.out.println("----------增强for循环-----------");
//        for (int i:num){//执行流程是依次从数组中取出数据赋给i，若取完，则退出for循环
//            System.out.println("i="+i);
//        }

    }

}

