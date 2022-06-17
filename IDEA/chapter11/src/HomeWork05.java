/**
 * @author ZhangNing
 */
public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.innerclass();
    }
}

class A {
    private final String name = "ZXC";

    public void innerclass (){
        class B {
            private final String name = "ASD";

            void show(){
                System.out.println(name + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}