package com.zn.interface_;

public class Computer {
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
