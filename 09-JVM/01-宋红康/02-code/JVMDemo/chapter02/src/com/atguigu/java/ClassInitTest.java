package com.atguigu.java;

/**
 * @author shkstart
 * @create 2020 下午 6:01
 */
public class ClassInitTest {
   private static int num = 1;

   static{
       num = 3;
       number = 20;
       System.out.println("静态方法----" + num);
       //System.out.println(number);//报错：非法的前向引用。
       //静态代码块中，你可以给它赋值，但不能调用它,这是编译器决定的
   }

   private static int number = 10;  //linking之prepare: number = 0 --> initial: 20 --> 10

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);//2
        System.out.println(ClassInitTest.number);//10
    }
}
