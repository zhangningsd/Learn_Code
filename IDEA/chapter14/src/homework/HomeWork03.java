package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class HomeWork03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);

        m.put("jack", 2600);
        Set set = m.keySet();
        for (Object key : set) {
            m.put(key, ((int)m.get(key)) + 100);
        }

        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + ":" + entry.getValue());
            
        }

    }
}

