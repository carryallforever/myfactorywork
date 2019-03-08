package com.example.work.abstractfactory;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/7 8:29
 * @Description:
 */
public class JavaCourseFactory implements  CourseFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
