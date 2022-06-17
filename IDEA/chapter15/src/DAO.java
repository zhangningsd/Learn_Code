import java.util.*;

public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    public void save(String Id, T entity) {
        map.put(Id, entity);
    }

    public T get(String Id) {
        return map.get(Id);
    }

    public void update(String Id, T entity) {
        map.put(Id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<Map.Entry<String, T>> entrySet = map.entrySet();
        for (Map.Entry<String, T> entry : entrySet) {
            list.add(entry.getValue());
        }
        return list;
    }

    public void delete(String Id) {
        map.remove(Id);
    }
}
