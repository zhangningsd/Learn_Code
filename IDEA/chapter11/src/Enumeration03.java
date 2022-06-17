import java.util.Arrays;

/**
 * @author ZhangNing
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season01.SPRING);
        System.out.println(Season01.SUMMER.name());
        System.out.println(Season01.AUTUMN.ordinal());
        System.out.println(Arrays.toString(Season01.values()));
        System.out.println(Season01.valueOf("WINTER").name());
        System.out.println(Season01.WINTER.compareTo(Season01.SUMMER));


    }
}

enum Season01 {

    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷");

    private String name;
    private String desc;



    private Season01(String name, String desc) {
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
