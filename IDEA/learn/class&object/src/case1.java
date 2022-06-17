public class case1 {
    public static void main(String[] args) {


        person01 p1 = new person01("zhangning", 21);
        System.out.println(p1.age+ " " + p1.salary + " " + p1.name + " " + p1.isPass);

    }
}
class person01 {
    int age;
    String name;
    double salary;
    boolean isPass;

    public person01(String pName, int pAge){
        name = pName;
        age = pAge;
    }
}
