/**
 * @author ZhangNing
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}


class Season {
    private String name;
    private String desc;
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return  "name=" + name + '\'' + ',' +
                "desc=" + desc + '\'';
    }
}
