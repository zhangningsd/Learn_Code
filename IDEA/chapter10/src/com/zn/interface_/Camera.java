package com.zn.interface_;

public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始");
    }

    @Override
    public void stop() {
        System.out.println("相机停止");
    }
}
