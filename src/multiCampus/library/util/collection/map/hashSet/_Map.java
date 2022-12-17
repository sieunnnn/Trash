package src.multiCampus.library.util.collection.map.hashSet;

import src.multiCampus.library.util.collection.set.hashSet._HashSet;

import java.util.Map.Entry;

public class _Map<K,V> {

    private _HashSet<Entry<K,V>> entrySet = new _HashSet<>();
    private _HashSet<K> keySet = new _HashSet<>();
    private int size;

    // int size()
    public int size() {
        return size;
    }

    // McHashSet<Map.Entry<K,​V>> entrySet()
    // key 와 value 를 저장하고 있는 entrySet 을 반환
    public _HashSet<Entry<K, V>> entrySet(){
        return entrySet;
    }

    // Set<K> keySet()
    public _HashSet<K> keySet(){
        return keySet;
    }

    // V put(K key, V value)
    // Map 에 Key 와 Value 를 추가하고 추가한 value 값을 반환
    public V put(K key, V value) {
        Entry<K, V> entry = new Node(key,value);
        entrySet.add(entry);
        keySet.add(key);
        size++;
        return value;
    }

    // V get(Object key)
    public V get(Object key) {

        for (Entry<K, V> entry : entrySet) {
            if(entry.getKey().equals(key)) return entry.getValue();
        }

        return null;
    }

    // V remove(Object key): key 로 특정되는 값을 삭제하고 삭제된 값을 반환
    @SuppressWarnings("unchecked")
    public V remove(K key) {
        V res = get(key);
        entrySet.remove(new Node(key, null));
        keySet.remove(key);
        size--;
        return res;
    }

    public V replace(K key, V value) {
        V v = get(key);
        remove(key);
        put(key, value);
        return v;
    }


    @Override
    public String toString() {
        return entrySet.toString();
    }

    public static class Node<K, V> implements Entry<K, V>{

        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return value;
        }

        @Override
        public String toString() {
            return "entry [key=" + key + ", value=" + value + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((key == null) ? 0 : key.hashCode());
            return result;
        }

        @SuppressWarnings("rawtypes")
        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;

            Node other = (Node)obj;

            if (key == null) {
                if (other.key != null)
                    return false;
            } else if (!key.equals(other.key))
                return false;

            return true;
        }

    }
}
