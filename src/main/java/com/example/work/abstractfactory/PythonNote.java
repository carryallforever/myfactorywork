package com.example.work.abstractfactory;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/7 8:33
 * @Description:
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
