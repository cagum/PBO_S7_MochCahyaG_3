import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStorage<T> {
    private List<T> listData;
    private Map<String, T> mapData;

    public DataStorage() {
        listData = new ArrayList<>();
        mapData = new HashMap<>();
    }

    public void addToList(T item) {
        listData.add(item);
    }

    public void addToMap(String key, T value) {
        mapData.put(key, value);
    }

    public List<T> getListData() {
        return listData;
    }

    public Map<String, T> getMapData() {
        return mapData;
    }

    // Generic method to print list elements
    public static <E> void printList(List<E> list) {
        for (E item : list) {
            System.out.println(item);
        }
    }

    // Generic method to print map entries
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
