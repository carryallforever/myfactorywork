package com.example.work.factorymethod;

import com.example.work.ICourse;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/7 8:21
 * @Description:
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }
}
