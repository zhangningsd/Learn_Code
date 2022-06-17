package com.zn.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend gf = GirlFriend.getInstance();
        System.out.println(gf);
    }
}

class GirlFriend{
    private String name;
    private static GirlFriend girlFriend = new GirlFriend("zyh");

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}