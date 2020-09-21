package main.java.edu.uml.bcabral;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K,V> implements Map<K,V> {

    private HashMap<K, V> myMap = new HashMap<>();


    @Override
    public int size() {
        return this.myMap.size();
    }

    @Override
    public boolean isEmpty() {
        return this.myMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return this.myMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return this.myMap.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return this.myMap.get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return this.myMap.put( key,  value);
    }

    @Override
    public Object remove(Object key) {
        return this.remove(key);
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return this.myMap.values();
    }

    @Override
    public Set<Entry> entrySet() {
        return this.myMap.entrySet();
    }
}
