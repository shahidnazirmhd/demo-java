package com.snm.demo.collections.map_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap<K, V> {
  private List<MyEntry<K, V>> entries = new ArrayList<>();

  public void put(K key, V value) {
    for (MyEntry<K, V> entry : entries) {
      if (entry.getKey().equals(key)) {
        // Updating value
        entry.setValue(value);
        return;
      }
    }
    entries.add(new MyEntry<>(key, value));
  }

  public V get(K key) {
    for (MyEntry<K, V> entry : entries) {
      if (entry.getKey().equals(key)) {
        return entry.getValue();
      }
    }
    return null; // No Key found
  }

  public boolean containsKey(K key) {
    for (MyEntry<K, V> entry : entries) {
      if (entry.getKey().equals(key)) {
        return true;
      }
    }
    return false;
  }

  public boolean containsValue(V value) {
    for (MyEntry<K, V> entry : entries) {
      if (entry.getValue().equals(value)) {
        return true;
      }
    }
    return false;
  }

  public boolean containsKeyValue(K key, V value) {
    for (MyEntry<K, V> entry : entries) {
      if (entry.getKey().equals(key) && entry.getValue().equals(value)) {
        return true;
      }
    }
    return false;
  }

  public int size() {
    return entries.size();
  }

  public boolean isEmpty() {
    return entries.isEmpty();
  }

  public void clear() {
    entries.clear();
  }

  public void remove(K key) {
    entries.removeIf(entry -> entry.getKey().equals(key));
    //    Iterator<MyEntry<K, V>> iterator = entries.iterator();
    //    while (iterator.hasNext()) {
    //      MyEntry<K, V> entry = iterator.next();
    //      if (entry.getKey().equals(key)) {
    //        iterator.remove();
    //      }
    //    }
  }

  public List<K> keys() {
    return entries.stream().map(MyEntry::getKey).collect(Collectors.toList());

    //    List < K > keyList = new ArrayList<>();
    //    for (MyEntry<K, V> entry : entries) {
    //      keyList.add(entry.getKey());
    //    }
    //    return keyList;
  }

  public List<V> values() {
    return entries.stream().map(MyEntry::getValue).collect(Collectors.toList());

    //    List<V> valueList = new ArrayList<>();
    //    for (MyEntry<K, V> entry : entries) {
    //      valueList.add(entry.getValue());
    //    }
    //    return valueList;
  }

  public void display() {
    if (entries.isEmpty()) {
      return;
    }
    System.out.println("Key\t:\tValue");
    for (MyEntry<K, V> entry : entries) {
      System.out.println(entry.getKey() + "\t:\t" + entry.getValue());
    }
  }

  private static class MyEntry<K, V> {
    private K key;
    private V value;

    public MyEntry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

    public void setValue(V value) {
      this.value = value;
    }
  }
}
