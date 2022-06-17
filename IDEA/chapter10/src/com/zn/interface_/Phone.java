package com.zn.interface_;

public class Phone implements UsbInterface {  //实现接口
    @Override
    public void start() {
        System.out.println("手机开始");
    }

    @Override
    public void stop() {
        System.out.println("手机停止");
    }

}
