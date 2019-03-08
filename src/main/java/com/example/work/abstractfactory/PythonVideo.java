package com.example.work.abstractfactory;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/7 8:34
 * @Description:
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
