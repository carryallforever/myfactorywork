package com.example.work.abstractfactory;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/7 8:32
 * @Description:
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
