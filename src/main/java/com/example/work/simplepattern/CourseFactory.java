package com.example.work.simplepattern;

import com.example.work.ICourse;
import com.example.work.JavaCourse;
import com.example.work.PythonCourse;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/7 7:56
 * @Description:
 */
public class CourseFactory {

    //原始版本
    public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if ("python".equals(name)){
            return new PythonCourse();
        }else {
            return null;
        }
    }

    //该进版本
    public ICourse createI(String className){
        if(!(null == className || "".equals(className))){
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //最终版本
    public ICourse createII(Class<? extends ICourse> clazz){

        if(null!= clazz){
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
