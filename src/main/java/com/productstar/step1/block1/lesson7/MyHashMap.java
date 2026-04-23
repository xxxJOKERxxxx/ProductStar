package com.productstar.step1.block1.lesson7;

import java.util.ArrayList;
import java.util.List;

class MyHashMap {
    // Внутренний массив для хранения пар
    Entry[] buckets = new Entry[16];
    int size = 0;   // сколько пар всего

    // Одна пара ключ-значение
    static class Entry {
        String key;
        String value;
        Entry next;  // для коллизий (когда два ключа в одной ячейке)

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Добавление
    void put(String key, String value) {
        int index = Math.abs(key.hashCode()) % buckets.length;
        // ... логика добавления
        size++;
    }

    // Получение всех ключей
    List<String> keySet() {
        List<String> keys = new ArrayList<>();
        for (Entry bucket : buckets) {
            Entry current = bucket;
            while (current != null) {
                keys.add(current.key);
                current = current.next;
            }
        }
        return keys;
    }

    // Количество пар
    int size() {
        return size;
    }
}
