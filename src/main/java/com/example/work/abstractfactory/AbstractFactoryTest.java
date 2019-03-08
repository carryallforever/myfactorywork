package com.example.work.abstractfactory;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/7 8:35
 * @Description:
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        JavaCourseFactory fa = new JavaCourseFactory();
        fa.createNote().edit();
        fa.createVideo().record();
    }
}
