package com.example.work.factorymethod;

import com.example.work.ICourse;
import com.example.work.PythonCourse;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/7 8:20
 * @Description:
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
