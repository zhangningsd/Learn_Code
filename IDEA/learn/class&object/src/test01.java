public class test01 {
    public static void main(String[] args) {
        chenxiuyan chenxiuyan = new chenxiuyan();
        chenxiuyan.setName("陈修艳");
        chenxiuyan.setAge(23);
        chenxiuyan.setSex("female");
        chenxiuyan.setCollage("JLU");
        System.out.println(chenxiuyan.getSex());
    }
}

class people {
    private String name;
    private int age;

    public people() {
    }

    public people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class chenxiuyan extends people {
    private String collage;
    private String sex;

    public chenxiuyan() {
    }

    public chenxiuyan(String collage, String sex) {
        this.collage = collage;
        this.sex = sex;
    }

    public chenxiuyan(String name, int age) {
        super(name, age);
    }

    public chenxiuyan(String name, int age, String collage, String sex) {
        super(name, age);
        this.collage = collage;
        this.sex = sex;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
