package org.skypro.skyshop.model;

import java.util.Comparator;

public class ComparatorSearchable implements Comparator<Searchable> {

    @Override
    public int compare(Searchable o1, Searchable o2) {
        if (o1.getName().length() == o2.getName().length()) {
            return o1.getName().compareTo(o2.getName());
        }
        return Integer.compare(o2.getName().length(), o1.getName().length());
    }
}
