package org.example.collections;

import java.util.Comparator;

public class StringComparator implements Comparator <String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() > o2.length() ? 1 : o1.length() == o2.length() ? 0 : -1;
    }
}
