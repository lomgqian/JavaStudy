package com.learn.CodeBlock_;

public class codeblockdetail {
    public static void main(String[] args) {
        System.out.println("p387,看看就行了");
        AA aa = new AA();
        AA aa2 = new AA();
    }
}


class AA{
    static {
        System.out.println("test");
    }
    {
        System.out.println("静态代码会因为类的调用而调用一次，普通代码则是随着创建对象而调用。调用两次");
    }
}

