package com.example.work.simplepattern;

import com.example.work.ICourse;
import com.example.work.JavaCourse;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/7 7:56
 * @Description:
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        courseFactory.create("java").record();
        courseFactory.create("python").record();

        CourseFactory factory = new CourseFactory();
        ICourse javaCourse = factory.createII(JavaCourse.class);
        javaCourse.record();
    }
}
