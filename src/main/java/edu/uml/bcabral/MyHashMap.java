package edu.uml.bcabral;


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
    public V get(Object key) {
        return this.myMap.get(key);
    }

    @Override
    public V put(K key, V value) {
        return this.myMap.put( key,  value);
    }

    @Override
    public V remove(Object key) {
        return this.remove(key);
    }

    @Override
    public void putAll(Map m) {
        this.myMap.putAll(m);
    }

    @Override
    public void clear() {
        this.myMap.clear();
    }

    @Override
    public Set keySet() {
        return this.myMap.keySet();
    }

    @Override
    public Collection values() {
        return this.myMap.values();
    }

    @Override
    public Set<Entry<K,V>> entrySet() {
        return this.entrySet();
    }
}
