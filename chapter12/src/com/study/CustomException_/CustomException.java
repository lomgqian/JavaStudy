package com.study.CustomException_;

/**
 * @date 2023/7/25 16:56
 */
public class CustomException {//自定义异常一般来说是RuntimeException（运行异常）
    public static void main(String[] args) throws AgeException{
int age=80;
if((age>=18&&age<=120)){
    throw /*手动生成异常的关键字*/  new AgeException("年龄错误");


}    System.out.println("年龄正确");
    }
}
class AgeException extends Exception/* RuntimeException*/{
    public AgeException(String message){
        super(message);
    }
}
