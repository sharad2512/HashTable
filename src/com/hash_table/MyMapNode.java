package com.hash_table;

public class MyMapNode <K,V> {
    K key;
    V value;
    MyMapNode<K, V> next;

    // constructor name as MyMaoNode and passing key and value
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    // method getter and setter
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;

    }
    //  getvalue method and setvalue
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode<K, V> getNext() {
        return next;
    }

    public void setNext(MyMapNode<K, V> next) {
        this.next = (MyMapNode<K, V>) next;
    }

    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("MyMapNode{" + " Key= ").append(key).append(" Value= ").append(value).append('}');
        if (next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}
