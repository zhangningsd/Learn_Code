import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Collection01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(true);
        list.add("asdf");

        System.out.println(list);
        list.remove((Integer)10);
        System.out.println(list);

    }
}
