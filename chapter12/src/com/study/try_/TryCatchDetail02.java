package com.study.try_;

/**
 * @date 2023/7/25 15:43
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {//如果try代码块可能存在多个异常，可以使用多个catch分别捕获不同的异常
            Person person = new Person();
            person=null;
            System.out.println(person.getName());
            int n1=10;
            int n2=0;
            int res=n1/n2;
        } catch (NullPointerException e){//子类异常必须要写到前面，父类异常在后面
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }finally {

        }
    }
}
class Person{
    private String name="jack";

    public String getName() {
        return name;
    }
}