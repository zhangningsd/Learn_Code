import java.util.HashSet;
import java.util.Set;

public class Set01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        set.remove("john");

        System.out.println(set);

    }
}

