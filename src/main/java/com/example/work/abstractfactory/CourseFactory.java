package com.example.work.abstractfactory;

/**
 * 抽象工厂是用户的主入口
 * 在spring中应用的最为广泛的一种设计模式
 * 易于扩展
 * @Auther: zhouyao
 * @Date: 2019/3/7 8:25
 * @Description:
 */
public interface CourseFactory {

    INote createNote();
    IVideo createVideo();
}
