package com.java.base.algorithm;

import java.util.HashMap;
import java.util.LinkedHashMap;

class LRUCache {
    private HashMap<Integer,Entry> buckets;
    private DoubleList cache;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        buckets = new HashMap<>(capacity);
        cache = new DoubleList();
    }

    public int get(int key) {
        if (!buckets.containsKey(key)) {
            return -1;
        }
        // 将该数据提升为最近使用的
        makeRecently(key);
        return buckets.get(key).v;

    }

    public void put(int key, int val) {
        if (buckets.containsKey(key)) {
            // 删除旧的数据
            deleteKey(key);
            // 新插入的数据为最近使用的数据
            addRecently(key, val);
            return;
        }

        if (capacity == cache.size()) {
            // 删除最久未使用的元素
            removeLeastRecently();
        }
        // 添加为最近使用的元素
        addRecently(key, val);
    }


    /* 将某个 key 提升为最近使用的 */
    private void makeRecently(int key) {
        Entry x = buckets.get(key);
        // 先从链表中删除这个节点
        cache.remove(x);
        // 重新插到队尾
        cache.addLast(x);
    }

    /* 添加最近使用的元素 */
    private void addRecently(int key, int val) {
        Entry x = new Entry(key, val);
        // 链表尾部就是最近使用的元素
        cache.addLast(x);
        // 别忘了在 map 中添加 key 的映射
        buckets.put(key, x);
    }

    /* 删除某一个 key */
    private void deleteKey(int key) {
        Entry x = buckets.get(key);
        // 从链表中删除
        cache.remove(x);
        // 从 map 中删除
        buckets.remove(key);
    }

    /* 删除最久未使用的元素 */
    private void removeLeastRecently() {
        // 链表头部的第一个元素就是最久未使用的
        Entry deletedNode = cache.removeFirst();
        // 同时别忘了从 map 中删除它的 key
        int deletedKey = deletedNode.k;
        buckets.remove(deletedKey);
    }

    class DoubleList {
        // 头尾虚节点
        private Entry head, tail;
        // 链表元素数
        private int size;

        public DoubleList() {
            // 初始化双向链表的数据
            head = new Entry(0, 0);
            tail = new Entry(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        // 在链表尾部添加节点 x，时间 O(1)
        public void addLast(Entry x) {
            x.prev = tail.prev;
            x.next = tail;
            tail.prev.next = x;
            tail.prev = x;
            size++;
        }

        // 删除链表中的 x 节点（x 一定存在）
        // 由于是双链表且给的是目标 Node 节点，时间 O(1)
        public void remove(Entry x) {
            x.prev.next = x.next;
            x.next.prev = x.prev;
            size--;
        }

        // 删除链表中第一个节点，并返回该节点，时间 O(1)
        public Entry removeFirst() {
            if (head.next == tail)
                return null;
            Entry first = head.next;
            remove(first);
            return first;
        }

        // 返回链表长度，时间 O(1)
        public int size() { return size; }

    }

        class Entry {
        Integer k;
        Integer v;
        Entry prev;
        Entry next;
        Entry(Integer k,Integer v){
            this.k = k;
            this.v = v;
        }
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
