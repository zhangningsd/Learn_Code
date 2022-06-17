import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@SuppressWarnings({"all"})
public class MapExercise01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new Employee02("zn", 1, 20000));
        hashMap.put(2, new Employee02("zyh", 2, 30000));
        hashMap.put(3, new Employee02("cxy", 3, 10000));

        //第一种
        Set set = hashMap.keySet();
        for (Object key : set) {
            Employee02 e = (Employee02) hashMap.get(key);
            if (e.getSal() > 18000) {
                System.out.println(e);
            }
        }

        //第二种
        Set EntrySet = hashMap.entrySet();
        Iterator iterator = EntrySet.iterator();
        while (iterator.hasNext()) {
            Object entry =  iterator.next();
            Map.Entry m = (Map.Entry) entry;
            Employee02 e = (Employee02) m.getValue();
            if (e.getSal() > 18000) {
                System.out.println(e);
            }
            
        }
    }
}

class Employee02 {
    private String name;
    private int id;
    private double sal;

    public Employee02(String name, int id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee02{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sal=" + sal +
                '}';
    }


}
